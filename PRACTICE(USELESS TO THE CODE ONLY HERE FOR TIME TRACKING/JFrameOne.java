
import javax.swing.*;
import java.awt.*;
public class JFrameOne{
	private JFrame frame;

	public JFrameOne(){
		initialize();
	}

	public void initialize(){
		frame = new JFrame();
		this.frame.setTitle("SortingAlgDemo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800,500);
		this.frame.setLocationRelativeTo(null);
		this.frame.setResizable(true);
		this.frame.setVisible(true); 
 
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5)); 
		panel.setBackground(Color.BLACK);
 
		Button button1 = new Button("Shuffle List");
		panel.add(button1);

		 

		frame.add(panel,BorderLayout.CENTER); 

 
	}   
}   