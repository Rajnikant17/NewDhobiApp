package com.dhobi.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

public class MMensWearQuestion {
    private String MensWearQuestions;
    private String MensWearAnswer;

    public String getMensWearQuestions() {
        return MensWearQuestions;
    }

    public void setMensWearQuestions(String mensWearQuestions) {
        MensWearQuestions = mensWearQuestions;
    }

    public String getMensWearAnswer() {
        return MensWearAnswer;
    }

    public void setMensWearAnswer(String mensWearAnswer) {
        MensWearAnswer = mensWearAnswer;
    }
}
