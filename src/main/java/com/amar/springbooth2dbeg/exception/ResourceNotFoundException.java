package com.amar.springbooth2dbeg.exception;

public class ResourceNotFoundException extends RuntimeException{
    private static final long servialVersionUId = 1L;

    public ResourceNotFoundException (String message){
        super(message);
    }
}
