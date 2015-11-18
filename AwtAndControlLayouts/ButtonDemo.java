import java.awt.* ; 
import java.awt.event.* ; 
import java.applet.* ; 

/*
    <applet code = "ButtonDemo" width = 200 height = 200>
    </applet>
*/


public class ButtonDemo extends Applet implements ActionListener{
    String msg = "";
    Button yes , no , maybe ; //For making buttons
    
    public void init(){
        yes = new Button("YES");
        no = new Button("NO");
        maybe = new Button("MAYBE");

        //Adding buttons to the applet
        add(yes);
        add(no);
        add(maybe);


        /*An ActionListener is a callback mechanism. Whenever a control it is added to fires an ActionEvent, the public void actionPerformed(ActionEvent e) method will be invoked.*/
        yes.addActionListener(this);
        no.addActionListener(this); 
        maybe.addActionListener(this) ; 
    }

    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
        long time = ae.getWhen();
        System.out.println("Event occured at time = " + time);
        if(str.equals("YES"))
            msg = "You pressed yes";
        else if(str.equals("NO"))
            msg = "You pressed no";
        else 
            msg = "You pressed maybe";

        repaint();
    }

    public void paint(Graphics g){
        g.drawString(msg, 6 , 100);
    }
}
