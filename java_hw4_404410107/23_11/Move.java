package exe23_11;
import javax.swing.*;
import java.awt.*;
public class Move implements Runnable {

	private int X_MOVEMENT = 3;
	private int Y_MOVEMENT = 3;
	private BouncingBall ball;
	private exe23_11_Panel panel;

	@Override
	public void run() {
		while (true) {//change the dir
			if (ball.getyLocation() >= panel.getHeight() - ball.getSize() ||
					ball.getyLocation() <= 0) {
				Y_MOVEMENT = - Y_MOVEMENT;
			}
			if (ball.getxLocation() >= panel.getWidth() - ball.getSize()||
					ball.getxLocation() <= 0){
				X_MOVEMENT = - X_MOVEMENT;
			}
			ball.setxLocation(ball.getxLocation() + X_MOVEMENT);
			ball.setyLocation(ball.getyLocation() + Y_MOVEMENT);
			ball.setSize(30);
			panel.repaint();
			//make ball move slower
			try{Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public Move(BouncingBall ball, exe23_11_Panel panel) {
		this.ball = ball;
		this.panel = panel;
	}

}

