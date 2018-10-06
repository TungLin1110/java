package exe23_10;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class exe23_10_Panel extends JPanel{

	private final static SecureRandom generator = new SecureRandom();
	
	private BouncingBall[] balls = new BouncingBall[1];//only 1 ball
	int counter = 0;
	public exe23_10_Panel(){
		this.setSize(400, 400);
		this.setBackground(Color.black);
		ExecutorService executor = Executors.newCachedThreadPool(); 
		this.addMouseListener(new MouseAdapter(){
		    public void mouseClicked(MouseEvent e) {
		    	if (counter < 1) {//generate blue ball
					balls[counter] = new BouncingBall(e.getX(),e.getY(),
							new Color(generator.nextInt(255), generator.nextInt(255), generator.nextInt(255)));
					executor.execute(new Move(balls[counter], exe23_10_Panel.this));
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
				g.setColor(Color.blue);
				g.fillOval(bouncingBall.getxLocation(), bouncingBall.getyLocation(), bouncingBall.getSize(), bouncingBall.getSize());
							}
		}
	}
}

