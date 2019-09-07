package com.dhobi.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

public class MForWomensWearQuestion {
    private   String WomensWearQuestions;

    public String getWomensWearQuestions() {
        return WomensWearQuestions;
    }

    public void setWomensWearQuestions(String womensWearQuestions) {
        WomensWearQuestions = womensWearQuestions;
    }

    public String getWomensWearAnswer() {
        return WomensWearAnswer;
    }

    public void setWomensWearAnswer(String womensWearAnswer) {
        WomensWearAnswer = womensWearAnswer;
    }

    private   String WomensWearAnswer;
}
