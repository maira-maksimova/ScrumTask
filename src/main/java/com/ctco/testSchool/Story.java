package com.ctco.testSchool;

public class Story {
    int value;
    int storyPoints;
    int testPoints;
    type type=null;

    public int getStoryPoints() {
        return storyPoints;
    }

    public void setStoryPoints(int storyPoints) {
        this.storyPoints = storyPoints;
    }

    public int getTestPoints() {
        return testPoints;
    }

    public void setTestPoints(int testPoints) {
        this.testPoints = testPoints;
    }

    public enum type {DEV, TEST, DB, BA}
}
