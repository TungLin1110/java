package exe23_11;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class exe23_11_Panel extends JPanel{

	private final static SecureRandom generator = new SecureRandom();
	
	private BouncingBall[] balls = new BouncingBall[30];//max to 30 balls
	int counter = 0;
	public exe23_11_Panel(){
		this.setSize(400, 400);
		this.setBackground(Color.black);
		ExecutorService executor = Executors.newCachedThreadPool(); 
		this.addMouseListener(new MouseAdapter(){
		    public void mouseClicked(MouseEvent e) {
		    	if (counter < 30) {//generate balls and their color
					balls[counter] = new BouncingBall(e.getX(),e.getY(),
							new Color(generator.nextInt(255), generator.nextInt(255), generator.nextInt(255)));
					executor.execute(new Move(balls[counter], exe23_11_Panel.this));
					counter++;
				}
		    }
		});
	}


	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (BouncingBall bouncingBall : balls) {
			if (bouncingBall != null){
				g.setColor(bouncingBall.getColor());
				g.fillOval(bouncingBall.getxLocation(), bouncingBall.getyLocation(), bouncingBall.getSize(), bouncingBall.getSize());
							}
		}
	}
}

