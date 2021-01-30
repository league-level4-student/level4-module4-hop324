package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{
public int width = 1000;
public int height = 800;
	BluePolymorph(int x, int y) {
		super(x, y);
	}
	
	public void setWidth(int setter){
		width = setter;
	}
	public void setHeight(int setter){
		height = setter;
	}
	public int getWidth(int setter) {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	

	@Override
	public void draw(Graphics g) {
		setWidth((int) x);
		setHeight((int) y);
		g.setColor(Color.blue);
		g.fillRect((int)x, (int)y, 50, 50);
		
	}
	
}
