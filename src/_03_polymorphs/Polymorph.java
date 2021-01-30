package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    double x;
    double y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    public void setX(double d) {
    	x = d;
    }
    public double getX() {
    	return x;
    }
    public void setY(double setter) {
    	y = setter;
    }
    public double getY() {
    	return y;
    }
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
