package game;

import javax.swing.ImageIcon;

public class Brick extends Sprite {

    private boolean destroyed;

    public Brick(int x, int y) {
        
        initBrick(x, y);
    }
    
    private void initBrick(int x, int y) {
        
        this.x = x;
        this.y = y;
        
        destroyed = false;

        loadImage();
        getImageDimension();
    }
    
    private void loadImage() {
        
        this.ico=new ImageIcon(getClass().getResource("/images/brick.png"));
        this.image=ico.getImage();       
    }

    boolean isDestroyed() {
        
        return destroyed;
    }

    void setDestroyed(boolean val) {
        
        destroyed = val;
    }
}
