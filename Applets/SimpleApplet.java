import java.awt.* ;
import java.applet.*  ; 

/*
    <applet code = "SimpleApplet" width = 200 height = 600 >
    </applet>
*/

public class SimpleApplet extends Applet{
    public void paint(Graphics g){
        g.drawString("A simple Applet" , 20 , 20);
    }
}
