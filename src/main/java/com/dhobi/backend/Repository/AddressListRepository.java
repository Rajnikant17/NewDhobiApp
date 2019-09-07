package com.dhobi.backend.Repository;

import com.dhobi.backend.model.MAddress;
import com.dhobi.backend.model.MResponseAddress;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressListRepository extends MongoRepository<MAddress,String> {


}
