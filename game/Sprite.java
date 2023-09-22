package game;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;


public class Sprite {

	int x;
	int y;
	int imageWidth;
	int imageHeight;
        ImageIcon ico;
        Image image;
	
	protected void setX(int x) {
		this.x = x;
	}
	
	int getX() {
		return x;
	}
	
	protected void setY(int y) {
		this.y = y;
	}
	
	int getY() {
		return y;
	}
	
	int getImageWidth() {
		return imageWidth;
	}
	
	int getImageHeight() {
		return imageHeight;
	}
	
	Image getImage() {
		return image;
	}
	
	Rectangle getRect() {
		return new Rectangle(x,y,image.getWidth(null), image.getHeight(null));
	}
	
	public void getImageDimension() {
		imageWidth=image.getWidth(null);
                imageHeight=image.getHeight(null);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
