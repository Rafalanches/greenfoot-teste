import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class f1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class f1 extends Mundão
{

       public int temp = 20;
       public int temp1 = 20;
    /**
     * Constructor for objects of class f1.
     * 
     */
    public f1()
    {
    }
         public void act(){
    temp--;
    if (Greenfoot.isKeyDown("enter") && (temp < 1)){
        setBackground(new GreenfootImage("fim.png"));
        temp1--;
    }
    if(Greenfoot.isKeyDown("enter") && (temp1 < 1)){
        TelaInicial world = new TelaInicial();
        Greenfoot.setWorld(world);
    }
    }
}

