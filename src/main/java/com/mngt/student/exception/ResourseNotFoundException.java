package com.mngt.student.exception;

public class ResourseNotFoundException  extends RuntimeException{
    public ResourseNotFoundException(String resourse, Long id) {
        super(resourse+ " with ID "+id+" not found");
    }
}
