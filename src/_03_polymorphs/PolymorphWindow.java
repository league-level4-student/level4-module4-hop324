package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    JFrame window;
    private Timer timer;
    
    
    ArrayList<Polymorph> array = new ArrayList<Polymorph>();
   
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   //	 window.addMouseListener(this);
   	 

   	 
   	 Polymorph bluePoly = new BluePolymorph(50, 50);
   	 Polymorph redPoly = new RedPolymorph(100, 100);
   	 Polymorph movePoly = new MovingPolymorh(200, 200);
   	 Polymorph circlePoly = new CirclePolymorph(250, 250);
   	 Polymorph mousePoly = new MousePolymorph(10, 10);
   	 Polymorph imagePoly = new ImagePolymorph(300, 300);
   	 Polymorph buttonPoly = new ButtonPolymorph(300, 100);
   	 
   	 
   	 
   	 array.add(bluePoly); array.add(movePoly); array.add(redPoly); array.add(circlePoly); array.add(mousePoly); array.add(imagePoly); array.add(buttonPoly);
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
   	 
    // 		 bluePoly.update();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for(int i = 0; i < array.size(); i++) {
   		 array.get(i).draw(g);
   	 }
   	 
   	 for(int i = 0; i< array.size(); i++) {
   		 array.get(i).update();
   	   	repaint();
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	 for(int i = 0; i< array.size(); i++) {
       		 array.get(i).update();
       	   	repaint();
       	 }
    }

	
}
