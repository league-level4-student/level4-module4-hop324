package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;


public class CirclePolymorph extends Polymorph{
	public int width = 1000;
	public int height = 800;
	public double angle = 0.0;
		CirclePolymorph(int x, int y) {
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
			g.setColor(Color.orange);
			g.fillRect((int)x, (int)y, 25, 25);
			
		}
		
		public void update() {
			System.out.println("is this working");
			angle+=5.0;
			setX(x+Math.cos(angle)*50);
			setY(y+Math.sin(angle)*50);
		}
		
	}


