import java.applet.* ;
import java.awt.* ; 

/*
<applet code = "PaintingApplet" width = 200 height = 100>
</applet>
*/

public class PaintingApplet extends Applet{
        String msg  ; 
        
        //Setting the foreground and background colors
        public void init() {
            setBackground(Color.cyan);
            setForeground(Color.red);
            msg = "Iniside init() ";
        }
    
        public void start(){
            msg += " Inside start()";
        }
    
        public void paint (Graphics g){
            msg += " Inside paint";
            g.drawString(msg , 10 , 30);
        }
       
}

