package com.level.exception;

import com.level.FileUtils;

import java.io.FileNotFoundException;

public class AgeException extends Exception {
    public AgeException(String message){
//        super(message);
        FileUtils.update("error.txt", message);
    }
}
