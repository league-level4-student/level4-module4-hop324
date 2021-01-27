package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorh  extends Polymorph{

	Graphics aww;
	MovingPolymorh(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public int width = 1000;
	public int height = 800;
		
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
			System.out.println(x + " " + y);
			
		}
		
		public void redraw(Graphics g) {
			System.out.println("Potatoes");
			g.setColor(Color.lightGray);
			g.fillRect(x, y, 50, 50);
			g.setColor(Color.black);
			g.fillRect(x+counter,y+counter, 50, 50);
			System.out.println("Haha: "+ x + " " + y);
		}
		
		public int counter = 10;
		public void update() {
		}

}
