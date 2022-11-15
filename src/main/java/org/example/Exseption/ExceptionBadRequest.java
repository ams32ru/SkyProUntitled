package org.example.Exseption;

public class ExceptionBadRequest extends RuntimeException{
    public ExceptionBadRequest() {
        super("400 Bad Request");
    }
}
