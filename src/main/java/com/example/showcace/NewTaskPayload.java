package com.example.showcace;

public class NewTaskPayload {
    private String details;

    public NewTaskPayload() {
    }

    public NewTaskPayload(String details) {
        this.details = details;
    }

    public String details() {
        return details;
    }
}
