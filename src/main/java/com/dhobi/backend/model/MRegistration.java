package com.dhobi.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "UserRegistrationData")
public class MRegistration {

    @Id
    public String id;
    public String username;
    public String mobileno;
    public String password;
    public Integer registrationStatus;
}
