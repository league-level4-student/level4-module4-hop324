package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ImagePolymorph extends Polymorph{
	public int width = 1000;
	public int height = 800;
	public BufferedImage image;
		ImagePolymorph(int x, int y){
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
			try {
				image = ImageIO.read(this.getClass().getResourceAsStream("copy_of_wallpaper1.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			g.drawImage(image, (int)x, (int)y, null);

			
		}
		
	}


