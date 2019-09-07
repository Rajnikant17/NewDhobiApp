package com.dhobi.backend.Repository;

import com.dhobi.backend.model.MPayment;
import com.dhobi.backend.model.ModelForSavingOtp;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PaymentSummaryRepository extends MongoRepository<MPayment,String> {

   /* @Query("{$and:[{ 'mobileno':?0},{'password':?1}]}")
    public List<MPayment> findUserOrderDetails(String mobileno, String password); */
   @Query("{'mobileno':?0}")
   public List<MPayment> findUserOrderDetails(String mobileno);


}
