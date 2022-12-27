import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Actor
{
    int keyGet = 0;
    int coinGet = 0;
    int score = 0;
    int lives = 3;
    
    
    public void act()
    {
        // Add your action code here.
        HumanMovement();
        detectBlockCollision();
        getKeys();
        getCoin();
        showStatus();
    }
    
     public void HumanMovement(){
        //Kode untuk robot bergerak
        if (Greenfoot.isKeyDown("W")){
            setLocation(getX(),getY()-2);
            animate();
        }
        if (Greenfoot.isKeyDown("S")){
            setLocation(getX(),getY()+2);
            animate();
        }
        if (Greenfoot.isKeyDown("D")){
            setLocation(getX()+2,getY());
            animate();
        }
        if (Greenfoot.isKeyDown("A")){
            setLocation(getX()-2,getY());
            animate();
        }
    }
    
    public void detectBlockCollision(){
        //kode untuk mendeteksi robot jika terkena block maka lokasi akan diset ulang
        if (isTouching(Block.class)){
            Greenfoot.playSound("death.mp3");
            setLocation(0,getY());
        }
    }
    
    public void getKeys(){
        if (isTouching(Keys.class)){
            Greenfoot.playSound("mariocoin.mp3");
            removeTouching(Keys.class);
            keyGet++;
        }
    }
    
    public void getCoin(){
        if (isTouching(Coin.class)){
            Greenfoot.playSound("mariocoin.mp3");
            removeTouching(Coin.class);
            coinGet++;
        }
    }
    
    private GreenfootImage robotimage1 = new GreenfootImage("man01.png");
    private GreenfootImage robotimage2 = new GreenfootImage("man02.png");
    
    public void animate(){
        if (getImage().equals(robotimage1)){
            setImage(robotimage2);
        }else{
            setImage(robotimage1);
        }
    }
    
    public void increaseKeys(){
        if (keyGet == 1){
            score++;
        }
    }
    
    public void increaseCoin(){
        if (coinGet == 3){
            score++;
        }
    }
    
    public void showStatus(){
        getWorld().showText("Score : "+score,71,530);
        getWorld().showText("Keys : "+keyGet,71,550);
        getWorld().showText("Coin : "+coinGet,71,570);
    }
}
