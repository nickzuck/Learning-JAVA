import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Factorial" width="700" height="500">
 </applet>
 */
public class Factorial extends Applet implements ActionListener
{
	TextField input,ans;
	Button b;
	public void init()
	{
		setLayout(null);
		input = new TextField();
		ans = new TextField();
		b = new Button("Evaluate!");
		Label l = new Label("Input:");
		Label l2 = new Label("Factorial: ");
		
		
		
		l.setBounds(10, 15, 40, 20);
		l2.setBounds(10, 50, 80, 25);
		input.setBounds(50, 10, 100, 30);
		ans.setBounds(90, 50, 100, 30);
		b.setBounds(40,80,100,30);
		b.addActionListener(this);
		
		add(b);
		add(l);
		add(l2);
		add(input);
		add(ans);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int num,fact=1;
		num = Integer.parseInt(input.getText());
		for(;num>0; num--)
			fact *= num;
		
		ans.setText(fact + "");
	}
}
