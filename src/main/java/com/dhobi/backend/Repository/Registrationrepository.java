package com.dhobi.backend.Repository;

import com.dhobi.backend.model.MOtpResponse;
import com.dhobi.backend.model.MRegistration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface Registrationrepository extends MongoRepository<MRegistration,String> {

   public MRegistration findBymobileno(String mobileno);

   @Query("{$and:[{ 'mobileno':?0},{ 'registrationStatus':?1}]}")
   public MRegistration findBymobilenoAndStatus(String mobileno,int registrationStatus);

   @Query("{$and:[{ 'mobileno':?0},{ 'registrationStatus':?1}]}")
   public MRegistration findByMobileNoAndRegistrationStatus(String mobileno, int registrationStatus);

}
