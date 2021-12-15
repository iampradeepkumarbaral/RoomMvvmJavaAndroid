package com.pradeep.roomdatabaseretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.pradeep.roomdatabaseretrofit.Adapter.ActorAdapter;
import com.pradeep.roomdatabaseretrofit.Modal.UserDetail;
import com.pradeep.roomdatabaseretrofit.Network.Retrofit;
import com.pradeep.roomdatabaseretrofit.Repository.ActorRespository;
import com.pradeep.roomdatabaseretrofit.ViewModal.ActorViewModal;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActorViewModal actorViewModal;

    private RecyclerView recyclerView;
    private List<UserDetail> actorList;
    private ActorRespository actorRespository;
   private ActorAdapter actorAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        actorRespository=new ActorRespository(getApplication());
        actorList=new ArrayList<>();
        actorAdapter=new ActorAdapter(this,actorList);

        actorViewModal=new ViewModelProvider(this).get(ActorViewModal.class);
        networkRequest();
       // actorViewModal.insert();
        actorViewModal.getAllActor().observe(this, new Observer<List<UserDetail>>() {
            @Override
            public void onChanged(List<UserDetail> actorList) {
                recyclerView.setAdapter(actorAdapter);
                actorAdapter.getAllActors(actorList);

                Log.d("mainThread", "onChanged: "+actorList.size());
            }
        });

    }

    private void networkRequest() {

        Retrofit retrofit=new Retrofit();
        Call<List<UserDetail>> call=retrofit.api.getAllActors();
        call.enqueue(new Callback<List<UserDetail>>() {
            @Override
            public void onResponse(Call<List<UserDetail>> call, Response<List<UserDetail>> response) {
                if(response.isSuccessful())
                {
                    actorRespository.insert(response.body());
                    Log.v("mainValue", "onResponse: "+response.body());
                }
            }

            @Override
            public void onFailure(Call<List<UserDetail>> call, Throwable t) {
                Log.v("mainValue", "onResponse: "+call);
                Toast.makeText(MainActivity.this, "something went wrong..."+call, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
