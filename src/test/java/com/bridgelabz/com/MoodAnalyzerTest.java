package com.bridgelabz.com;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("This is a Sad Message");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD",mood);

    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("This is Happy Messgae");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}

