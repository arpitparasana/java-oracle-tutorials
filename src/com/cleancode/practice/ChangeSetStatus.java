package com.cleancode.practice;

public enum ChangeSetStatus {
    CANCELLED("C"), OPEN, PROMOTED;

    private String code;

    private ChangeSetStatus() {
    }

    private ChangeSetStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
