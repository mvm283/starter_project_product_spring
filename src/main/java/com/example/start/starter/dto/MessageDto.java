package com.example.start.starter.dto;

public class MessageDto {

    private String message;
    private String type;
    private String errorCode;

    public MessageDto(){
    }

    public MessageDto(String message, String type, String errorCode) {
        this.message = message;
        this.type = type;
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
