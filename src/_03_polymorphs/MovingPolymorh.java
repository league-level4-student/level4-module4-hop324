package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

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
			g.fillRect((int)x,(int) y, 50, 50);
			System.out.println(x + " " + y);
			
		}
		
		public void redraw(Graphics g) {
			System.out.println("Potatoes");
			g.setColor(Color.lightGray);
			g.fillRect((int)x,(int) y, 50, 50);
			g.setColor(Color.black);
			g.fillRect((int)x+counter,(int)y+counter, 50, 50);
			System.out.println("Haha: "+ x + " " + y);
		}
		
		
		public int counter = 10;
		public void update() {
			Random randy = new Random();
			if(getX() > 8 && getX() < 492) {
			setX(x+(randy.nextInt(3))-1);
			}
			else if(getX() <= 8) {
				setX(x+(randy.nextInt(3)));
			}
			else if(getX() >= 492) {
				setX(x+(randy.nextInt(1))-3);
			}
			if(getY() > 8 && getY() < 492) {
			setY(y+(randy.nextInt(3))-1);
			}
			else if(getY() <= 8) {
				setY(y+(randy.nextInt(3)));
			}
			else if(getY() >= 492) {
				setY(y+(randy.nextInt(1))-3);
			}
		}

}
