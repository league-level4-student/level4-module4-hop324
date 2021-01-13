package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;


public class CirclePolymorph extends Polymorph{
	public int width = 1000;
	public int height = 800;
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
			g.setColor(Color.black);
			g.fillRect(x, y, 50, 50);
			
		}
		
		public void update(Graphics g) {
			
		}
		
	}


