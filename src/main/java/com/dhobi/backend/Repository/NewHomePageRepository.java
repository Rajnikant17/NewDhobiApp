package com.dhobi.backend.Repository;

import com.dhobi.backend.model.MDataHomePage;
import com.dhobi.backend.model.NewMDataHomePage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface NewHomePageRepository extends MongoRepository<NewMDataHomePage,String> {
   @Query("{'partnersid':?0}")
    public NewMDataHomePage partnersid(String partnersid);
}
