package com.pradeep.roomdatabaseretrofit.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.pradeep.roomdatabaseretrofit.Modal.UserDetail;

import java.util.List;

@Dao
public interface ActorDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<UserDetail> actorList);

    @Query("SELECT * FROM UserDetail")
    LiveData<List<UserDetail>> getAllActors();

    @Query("DELETE FROM UserDetail")
    void deleteAll();
}
