package com.marlena.ui;

import com.marlena.domain.commands.CommandInvalidException;
import com.marlena.infrastructure.NoSuchEntityException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandlers {

    @ResponseStatus(code = HttpStatus.NOT_FOUND,
            reason = "Entity with given id not exist")
    @ExceptionHandler(NoSuchEntityException.class)
    public void handleEntityNoFound(){

    }
    @ResponseStatus(code = HttpStatus.UNAUTHORIZED,
            reason = "No required authentication")
    @ExceptionHandler(SecurityException.class)
    public void handleSecurityException() {


    }

    @ExceptionHandler(CommandInvalidException.class)
    public ResponseEntity handleInvalidCommand(CommandInvalidException ex) {
        return new ResponseEntity(ex.getValidationErrors(), HttpStatus.UNPROCESSABLE_ENTITY);
    }
}
