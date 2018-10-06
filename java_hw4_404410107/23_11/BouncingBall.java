package exe23_11;
import javax.swing.*;
import java.awt.*;

public class BouncingBall {

	private int size = 30;
	private int x_coor;
	private int y_coor;
	private Color color;
	
	public BouncingBall(int x_coor, int y_coor, Color color) {
		this.x_coor = x_coor;
		this.y_coor = y_coor;
		this.color = color;
	}
	public Color getColor() { return color; }
	public int getxLocation() { return x_coor;}
	public int getyLocation() { return y_coor; }
	public int getSize() { return size; }
	public void setColor(Color color) { this.color = color;	}
	public void setxLocation(int x_coor) { this.x_coor = x_coor; }
	public void setyLocation(int y_coor) { this.y_coor = y_coor;	}
	public void setSize(int size) { this.size = size; }
	
	
	
	
}
