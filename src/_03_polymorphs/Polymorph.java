package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    public void setX(int setter) {
    	x = setter;
    }
    public int getX() {
    	return x;
    }
    public void setY(int setter) {
    	y = setter;
    }
    public int getY() {
    	return y;
    }
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
