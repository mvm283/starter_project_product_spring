package com.example.start.starter.controller.advise;

import com.example.start.starter.dto.MessageDto;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@Profile("english")
@RestControllerAdvice
public class ENControllerAdvise {

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MessageDto processNullPointerException(){
        MessageDto messageDto=new MessageDto();
        messageDto.setErrorCode("0001");
        messageDto.setMessage("EN: Error found in the request, try later");
        messageDto.setType("ERROR");
        return messageDto;
    }

    @ExceptionHandler(NoSuchElementException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MessageDto processNoSuchElementException(){
        MessageDto messageDto=new MessageDto();
        messageDto.setErrorCode("0002");
        messageDto.setMessage("EN: Error found in the request, no element has found");
        messageDto.setType("ERROR");
        return messageDto;
    }

}

