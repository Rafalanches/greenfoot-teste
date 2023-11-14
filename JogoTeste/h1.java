import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class h1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class h1 extends World
{

       public int temp = 20;
    public int temp1 = 20;
    /**
     * Constructor for objects of class h1.
     * 
     */
    public h1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
    }
        public void act(){
    temp--;
    if (Greenfoot.isKeyDown("enter") && (temp < 1)){
        setBackground(new GreenfootImage("historinha1.png"));
        temp1--;
    }
    //Iniciar o jogo
    if (Greenfoot.isKeyDown("enter") && (temp1 <0)){
        Mundão world = new Mundão();
        Greenfoot.setWorld(world);
    }
}
    
}
