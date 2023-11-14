import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jotaro extends Actor
{
    GifImage myGif = new GifImage("jotaro.gif");
    GifImage mygif = new GifImage("shitpost.gif");
    GifImage myGGif = new GifImage("shitpost2.gif");
    
    public int speed = 4;
    GreenfootSound combo = new GreenfootSound("combo.wav");
    /**
     * 
     * Act - do whatever the gay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        setImage(myGif.getCurrentImage());  
        movimento();
    }
    public void movimento(){

        if (Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() - speed);
            setRotation(270);
        }
          else if (Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() + speed);
            setRotation(90);
        }
          else if (Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX()  - speed, this.getY());
            setRotation(360);
            setImage(myGGif.getCurrentImage());
        }
          else if (Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX()  + speed, this.getY());
             setRotation(360);
             setImage(mygif.getCurrentImage()); 
        }
         else if (Greenfoot.isKeyDown("n")){
        getWorld().addObject (new ora(), getX() - 100, getY() - 20);
        
}
}
}