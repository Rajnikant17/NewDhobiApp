package com.dhobi.backend.Repository;

import com.dhobi.backend.model.MDashBoard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DashBoardRepositries extends MongoRepository<MDashBoard,String> {
}
