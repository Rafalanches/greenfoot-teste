import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundão here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundão extends World
{
    GifImage myGif = new GifImage("oip.gif");
    private GreenfootSound bgMusic = new GreenfootSound("glamour.mp3");
    
    public void started()
    {
    bgMusic.playLoop();
    }
    
     public void stopped()
    {
    bgMusic.pause();
    }
    public void act(){
    setBackground(myGif.getCurrentImage()); 
    
    }
    /**
     * Constructor for objects of class Mundão.
     * 
     */
    public Mundão()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }
    
    private void prepare(){

        Abogus abogus = new Abogus();
        addObject(abogus,198,360);
        jotaro jotaro = new jotaro();
        addObject(jotaro,609,336);
        Counter counter = new Counter();
        addObject(counter,176,98);
        Counter2 counter2 = new Counter2();
        addObject(counter2,650,101);
    }
}
