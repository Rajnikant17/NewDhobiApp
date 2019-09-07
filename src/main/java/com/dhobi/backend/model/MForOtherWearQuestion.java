package com.dhobi.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

public class MForOtherWearQuestion {
    private String OtherWearQuestions;

    public String getOtherWearQuestions() {
        return OtherWearQuestions;
    }

    public void setOtherWearQuestions(String otherWearQuestions) {
        OtherWearQuestions = otherWearQuestions;
    }

    public String getOtherWearAnswer() {
        return OtherWearAnswer;
    }

    public void setOtherWearAnswer(String otherWearAnswer) {
        OtherWearAnswer = otherWearAnswer;
    }

    private String OtherWearAnswer;
}
