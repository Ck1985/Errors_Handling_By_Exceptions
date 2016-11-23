package exceptions;
import static net.mindview.util.Print.*;
/**
 * Created by Anonymous11100001 on 7/30/2016.
 */
public class Switch {
    private boolean state = false;
    public boolean read(){
        return this.state;
    }
    public void on(){
        this.state = true;
        print(this);
    }
    public void off(){
        this.state = false;
        print(this);
    }
    public String toString() {
        return state ? "on" : "off";
    }
}
