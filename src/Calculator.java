import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Container;


public class Calculator extends JFrame {
	
	public static final int WIDTH = 300;
    public static final int WIDTH = 600;
	
	public Calculator(){
		setSize(WIDTH, WIDTH);
		addWindowListener(new WindowDestroyer);
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		SecondWindow window1 = new SecondWindow();
		window1.setVisible(true);

		SecondWindow window2 = new SecondWindow(Color.PINK);
		window2.setVisible(true);
	}
}
