package solidprinciples.singleresponsibility.src.com.jr.shapes;

import java.util.Optional;

public class Rectangle {
    private Optional <Integer> length;
    private Integer width;
    private Integer ifNullValue = 0;

    public Rectangle(Optional<Integer> length, Integer width){
        this.length = length;
        this.width = width;
    }

    public Optional<Integer> getLength(){
        return Optional.ofNullable(this.length).orElse(ifNullValue);
    }

    public Optional<Integer> getWidth(){
        return Optional.of(this.width);
    }

    public void setLength(Integer length){
        this.length = length;
    }

    public void setWidth(Integer width){
        this.width = width;
    }


}
