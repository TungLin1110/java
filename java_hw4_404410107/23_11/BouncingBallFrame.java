package exe23_11;
import javax.swing.*;
import java.awt.*;

public class BouncingBallFrame extends JFrame{

	public static void main(String[] args) {
		
		BouncingBallFrame frame = new BouncingBallFrame();
		exe23_11_Panel panel = new exe23_11_Panel();
	
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
		
	}
}
