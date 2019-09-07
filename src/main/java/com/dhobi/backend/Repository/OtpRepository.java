package com.dhobi.backend.Repository;

import com.dhobi.backend.model.ModelForSavingOtp;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface OtpRepository extends MongoRepository<ModelForSavingOtp,String> {
    public ModelForSavingOtp findBymobileno(String mobileno);

   @Query("{$and:[{ 'mobileno':?0},{ 'status':?1}]}")
  public ModelForSavingOtp findLastSendOtpDocument(String mobileno,int status);
   // @Query("{update:{ mobileno : ?0} , {$set : {otp : 5111}}")
   // public ModelForSavingOtp save(String mobileno);

}
