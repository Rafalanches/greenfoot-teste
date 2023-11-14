import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hadouken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hadouken extends Abogus
{
     public int temp = 20;
    /**
     * Act - do whatever the hadouken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    moveAtaque();
    acertarAlvo();
    }
    
    public void moveAtaque(){
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x, y);
    }
     public void acertarAlvo(){
        
    Actor b = getOneIntersectingObject(jotaro.class);
    temp--;
    
    if (b != null){
        Counter counter =(Counter) getWorld().getObjects(Counter.class).get(0);
        counter.add(10);
        if  (temp < 1){
        f1 world = new f1();
         Greenfoot.setWorld(world);
         getWorld().removeObject(b);
        getWorld().removeObject(this);
    }
    }
    
    }
}
