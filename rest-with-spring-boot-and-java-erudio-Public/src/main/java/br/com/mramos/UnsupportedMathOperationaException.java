package br.com.mramos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationaException extends RuntimeException{

    public UnsupportedMathOperationaException(String ex) {
        super(ex);
    }
}
