package com.jr.shapes;

import java.util.Optional;

// Optionals
// This is a java wrapper class 
// Ideal use case would be for variables that could have a null value.
// Using optionals would avoid the need to check for null values.
// Also to deal with scenarios when it has to return empty or null values without raising any null exceptions

public class Rectangle {
    private Optional <Integer> length;
    private Optional <Integer> width;

    public Rectangle(Integer length, Integer width){
        this.length = Optional.ofNullable(length);
        this.width = Optional.ofNullable(width);
    }

    public Optional<Integer> getLength(){
        return this.length;
    }

    public Optional<Integer> getWidth(){
        return this.width;
    }

    public void setLength(Optional <Integer> length){
        this.length = length;
    }

    public void setWidth(Optional <Integer> width){
        this.width = width;
    }


}
