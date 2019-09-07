package com.dhobi.backend.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.List;

public class MRegistrationResponse {
    Integer code;
    Integer subcode;
    DataRegistrationResponse dataRegistrationResponse;

    public DataRegistrationResponse getDataRegistrationResponse() {
        return dataRegistrationResponse;
    }

    public void setDataRegistrationResponse(DataRegistrationResponse dataRegistrationResponse) {
        this.dataRegistrationResponse = dataRegistrationResponse;
    }

    public Integer getSubcode() {
        return subcode;
    }

    public void setSubcode(Integer subcode) {
        this.subcode = subcode;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
