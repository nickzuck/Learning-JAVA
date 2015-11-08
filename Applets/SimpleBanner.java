import java.awt.* ; 
import java.applet.* ; 

/*
    <applet code = "SimpleBanner", width = 300 , height = 200>
    </applet>
*/

public class SimpleBanner extends Applet implements Runnable
{
    String msg = "A Simple moving banner";
    Thread t = null ;
    int state ; 
    boolean stopFlag ; 

    //SEt the colors of the applet
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
    }
    
    //Initialize and start the thread
    public void start(){
        t = new Thread(this);
        stopFlag = false ; 
        t.start();
    } 

    //For doing the work in the thread
    public void run(){
        char ch ; 
       
        while(stopFlag == false){
            try{
                repaint() ; 
                Thread.sleep(250);
                ch = msg.charAt(0);
                msg = msg.substring(1 , msg.length());
                msg += ch;
                if(stopFlag){
                    break;
                }
            }
            catch(Exception e){
                //System.out.println("The following exception occured\n" + e);
                stopFlag = true;
            }
            
        }

        stop();
    }

    public void stop(){
        stopFlag = true;
        t = null ; 
    }

    public void paint(Graphics g){
        g.drawString(msg , 50 , 30);
    }
}
