import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ora extends jotaro
{
    GifImage Gif = new GifImage("oraora.gif");
    SimpleTimer shootora = new SimpleTimer();
    int orainterval = 1000;
     public int temp = 20;
    /**
     * Act - do whatever the ora wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         setImage(Gif.getCurrentImage());
         acertarAlvo();
         if (shootora.millisElapsed()>orainterval){
            getWorld().removeObject(this);
            }
    }
     public void moveAtaque(){
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x, y);
    }
    public void acertarAlvo(){
        
    Actor a = getOneIntersectingObject(Abogus.class);
     temp--;
    if (a != null){
        Counter2 counter2 =(Counter2) getWorld().getObjects(Counter2.class).get(0);
        counter2.add(1);
              if  (temp < 1){
        f2 world = new f2();
         Greenfoot.setWorld(world);
         getWorld().removeObject(a);
        getWorld().removeObject(this);
    }
    }
     
    }
}
