package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ButtonPolymorph extends Polymorph implements ActionListener {
	public int width = 1000;
	public int height = 800;
	public JButton buttonOverlay = new JButton();
		ButtonPolymorph(int x, int y){
			super(x, y);
		}
		
		public void setWidth(int setter){
			width = setter;
		}
		public void setHeight(int setter){
			height = setter;
		}
		public int getWidth() {
			return width;
		}
		public int getHeight() {
			return height;
		}
		
		

		@Override
		public void draw(Graphics g) {
			g.setColor(Color.PINK);
			g.fillRect((int)x, (int)y, 50, 50);
			buttonOverlay.addActionListener(this);
			buttonOverlay.setSize(getWidth(), getHeight());
			buttonOverlay.setOpaque(true);
			buttonOverlay.setAlignmentX((float)x);
			buttonOverlay.setAlignmentY((float)y);
		}
	

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "Hi");
		}
		
	}


