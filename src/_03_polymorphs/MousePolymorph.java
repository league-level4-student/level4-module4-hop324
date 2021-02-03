package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;


public class MousePolymorph extends Polymorph{
	public int width = 1000;
	public int height = 800;
		MousePolymorph(int x, int y){
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
			g.setColor(Color.magenta);
			g.fillRect((int)x, (int)y, 50, 50);
			
		}
		
		public void update() {
			Point p = MouseInfo.getPointerInfo().getLocation();
			setX(p.x);
			setY(p.y);
		}
		
	}


