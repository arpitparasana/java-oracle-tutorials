package com.cleancode.practice;

public class VariableNamePractice {

    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    public static void main(String[] args) {

        System.out.println(ChangeSetStatus.OPEN.getCode());
        System.out.println(ChangeSetStatus.CANCELLED.getCode());
    }
}
