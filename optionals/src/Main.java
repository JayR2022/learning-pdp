import com.jr.shapes.Rectangle;

public class Main {

    // Flow of control a.k.a order in which our code is executed.
    // in Java the starting point of execution is from the below main method. 
    // The main method will be in the Java Call Stack. 
    // Java uses call stack to keep track of the order of execution of method. 
    // Each method or function is added to call stack as Stack Frames. They are added in a Last-In-First-Out basis. 
    // The stack frames are popped once a return call is made.

    public static void main(String[] args){

        Rectangle newShape = new Rectangle(null,null);
        Rectangle newNonNullRectangle = new Rectangle(190,450);

        System.out.println("Length: "+newShape.getLength());
        System.out.println("Width: "+newShape.getWidth());

        System.out.println("New Rectangle Length: "+newNonNullRectangle.getLength());
        System.out.println("New Rectangle Width: "+newNonNullRectangle.getWidth());


    }
    
}
