package com.example.demo.dto;

public class ErrorResponse {

    private String error;
    private String detail;

    public ErrorResponse() {}

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
