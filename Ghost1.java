import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghost1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost1 extends Actor
{
    /**
     * Act - do whatever the Ghost1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ghost1()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
        setRotation(0);
    }
    
    public Ghost1(int speed)
    {
        setRotation(0);
        this.speed = speed;
    }
    
    public void act()
    {
        ghostMove();
    }
    
    private int speed = -3;
    protected void ghostMove(){
        move(speed);
        if(isAtEdge()){
            getWorld().removeObject(this); 
        }
        
        if(Greenfoot.getRandomNumber(100) < 5){
            turn(Greenfoot.getRandomNumber(70) - 40);
        }
    }
}
