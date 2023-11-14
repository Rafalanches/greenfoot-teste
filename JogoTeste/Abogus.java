import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Abogus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Abogus extends Actor

{
      /**
     * Act - do whatever the Abogus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public int speed = 4;
    public void act()
    {
            movimento();
    }
    /**
     * Move one step forward.
     */
    public void move()
    {
        move(1);
    }
    public void movimento(){
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
            setRotation(270);
            setImage(new GreenfootImage("abogus.png"));
        }
          else if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
            setRotation(90);
            setImage(new GreenfootImage("abogus.png"));
        }
          else if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX()  - speed, this.getY());
            setRotation(360);
            setImage(new GreenfootImage("abogus-l.png"));
        }
          else if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX()  + speed, this.getY());
             setRotation(360);
             setImage(new GreenfootImage("abogus.png"));

        }
         else if (Greenfoot.isKeyDown("t")){
             getWorld().addObject (new hadouken(), getX() + 100, getY() + 30);
            }
        }
}
