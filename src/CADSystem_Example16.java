/**
 * Created by Anonymous11100001 on 7/30/2016.
 */
import static net.mindview.util.Print.*;
class Shape{
    Shape(int i){
        print("Shape(" + i + ") Constructor");
    }
    void dispose(){
        print("Dispose Shape");
    }
}
class Circle extends Shape{
    Circle(int i){
        super(i);
        print("Circle(" + i + ") Constructor");
    }
    void dispose(){
        print("Dispose Circle");
        super.dispose();
    }
}
class Triangle extends Shape{
    Triangle(int i){
        super(i);
    }
    void dispose(){
        print("Dispose Triangle");
        super.dispose();
    }
}
class Line extends Shape{
    private int start, end;
    Line(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        print("Line(" + start + ", " + end + ") Constructor");
    }
    void dispose(){
        print("Dispose Line");
    }
}
public class CADSystem_Example16 extends Shape{
    private Circle circle;
    private Triangle triangle;
    private Line[] lines = new Line[3];
    public CADSystem_Example16(int i){
        super(i);
        circle = new Circle(i);
        triangle = new Triangle(i);
        for(int j = 0; j < 3; j++) {
            lines[j] = new Line(j, j * j);
        }
        print("Combined Constructor");
    }
    void dispose(){
        print("Dispose CADSystem");
        for(int j = lines.length - 1; j >= 0; j--){
            lines[j].dispose();
        }
        triangle.dispose();
        circle.dispose();
        super.dispose();
    }
    public static void testFinallyClause(int i){
        CADSystem_Example16 cad = new CADSystem_Example16(i);
        try{
            print("Creating ..... CADSystem ......");
            return;
        }finally{
            //Although return keyword in middle try block, but
            // finally still executed (Clean up working):
            cad.dispose();
        }
    }
    public static void main(String[] args){
        testFinallyClause(16);
    }
}
