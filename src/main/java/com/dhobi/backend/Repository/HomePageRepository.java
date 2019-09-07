package com.dhobi.backend.Repository;

import com.dhobi.backend.model.MDataHomePage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HomePageRepository extends MongoRepository<MDataHomePage,String> {

}
