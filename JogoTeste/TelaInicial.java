import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TelaInicial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TelaInicial extends World
{
    public int temp = 20;
    private GreenfootSound liMusic = new GreenfootSound("glamour.mp3");
    
    public void started()
    {
    liMusic.playLoop();
    }
    
     public void stopped()
    {
    liMusic.pause();
    }
    
    /**
     * Constructor for objects of class TelaInicial.
     * 
     */
    public TelaInicial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
        
    }

    public void act(){
    temp--;
    if (Greenfoot.isKeyDown("enter") && (temp < 1)){
        h1 world = new h1();
        Greenfoot.setWorld(world);
    }
}
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Banner banner = new Banner();
        addObject(banner,397,421);
    }
}
