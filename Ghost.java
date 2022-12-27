import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost extends Actor
{
    public Ghost()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Ghost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("left") && getRotation() != 340)
        move(4); 
        
    }
}
