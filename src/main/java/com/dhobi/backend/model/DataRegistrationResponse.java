package com.dhobi.backend.model;

import org.springframework.stereotype.Component;

public class DataRegistrationResponse {
    String message;
    Boolean bool ;

    public Boolean getBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
