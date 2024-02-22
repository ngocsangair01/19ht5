package org.example.buoi3.exceptions;

public class ErrorResponse {
    private Integer status;// la cac con so 400,401,...
    private String message; //la message minh gui ve cho nguoi dung

    public ErrorResponse() {
    }

    public ErrorResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
