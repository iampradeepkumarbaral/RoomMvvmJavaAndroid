package com.pradeep.roomdatabaseretrofit.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.pradeep.roomdatabaseretrofit.Dao.ActorDao;
import com.pradeep.roomdatabaseretrofit.Database.ActorDatabase;
import com.pradeep.roomdatabaseretrofit.Modal.UserDetail;

import java.util.List;

public class ActorRespository {
    private ActorDatabase database;
    private LiveData<List<UserDetail>> getAllActors;

    public ActorRespository(Application application)
    {
        database=ActorDatabase.getInstance(application);
        getAllActors=database.actorDao().getAllActors();
    }

    public void insert(List<UserDetail> actorList){
     new InsertAsynTask(database).execute(actorList);
    }

    public LiveData<List<UserDetail>> getAllActors()
    {
        return getAllActors;
    }

   static class InsertAsynTask extends AsyncTask<List<UserDetail>,Void,Void>{
        private ActorDao actorDao;
         InsertAsynTask(ActorDatabase actorDatabase)
         {
             actorDao=actorDatabase.actorDao();
         }
        @Override
        protected Void doInBackground(List<UserDetail>... lists) {
             actorDao.insert(lists[0]);
            return null;
        }
    }
}
