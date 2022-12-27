import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends World
{

    /**
     * Constructor for objects of class Easy.
     * 
     */
    public Easy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,251,242);
        wall.setLocation(167,205);
        Wall wall2 = new Wall();
        addObject(wall2,798,347);
        Wall wall3 = new Wall();
        addObject(wall3,380,550);
        wall3.setLocation(230,556);
        Wall wall4 = new Wall();
        addObject(wall4,815,562);
        Human human = new Human();
        addObject(human,110,116);
        human.setLocation(78,106);
        Score score = new Score();
        addObject(score,867,61);
        Coin coin = new Coin();
        addObject(coin,283,103);
        coin.setLocation(305,103);
        Coin coin2 = new Coin();
        addObject(coin2,878,227);
        coin2.setLocation(884,242);
        Coin coin3 = new Coin();
        addObject(coin3,213,400);
        coin3.setLocation(154,459);
        Keys keys = new Keys();
        addObject(keys,573,517);
        keys.setLocation(780,475);
        coin2.setLocation(898,215);
        wall2.setLocation(851,289);
        coin2.setLocation(903,199);
        Block block = new Block();
        addObject(block,465,377);
        human.setLocation(81,82);
        human.setLocation(75,94);
        Ghost1 ghost1 = new Ghost1();
        addObject(ghost1,785,163);
        ghost1.setLocation(822,189);
        score.setLocation(94,546);
    }
}
