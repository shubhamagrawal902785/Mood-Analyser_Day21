package com.bridgelabz.com;

public class MoodAnalyzerMain {

    private String message;
    public MoodAnalyzerMain(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
