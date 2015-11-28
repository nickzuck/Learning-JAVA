import java.awt.* ; 
import java.awt.event.* ; 


public class AwtContainerDemo{
    private Frame mainFrame ;
    private Label headerLabel ; 
    private Label statusLabel ; 
    private Panel controlPanel ; 
    private Label msgLabel ;

    public AwtContainerDemo(){
        prepareGUI();
    }

    private void prepareGUI(){
        mainFrame = new Frame("JAVA AWT examples ");
        mainFrame.setSize() ;
        mainFrame.setLayout(new GridLayout(3,1)) ;
        mainFrame.addWindowListener(new WindowAdapter()){
            public void windowClosing(WindowEvent windowevent){
                System.exit(0);
            }
        }  
    }
}
