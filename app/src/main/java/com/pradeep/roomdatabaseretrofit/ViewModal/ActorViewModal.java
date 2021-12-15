package com.pradeep.roomdatabaseretrofit.ViewModal;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.pradeep.roomdatabaseretrofit.Modal.UserDetail;
import com.pradeep.roomdatabaseretrofit.Repository.ActorRespository;

import java.util.List;

public class ActorViewModal extends AndroidViewModel {

    private ActorRespository actorRespository;
    private LiveData<List<UserDetail>> getAllActors;

    public ActorViewModal(@NonNull Application application) {
        super(application);
        actorRespository=new ActorRespository(application);
        getAllActors=actorRespository.getAllActors();
    }

    public void insert(List<UserDetail> list)
    {
        actorRespository.insert(list);
    }

    public LiveData<List<UserDetail>> getAllActor()
    {
        return getAllActors;
    }

}
