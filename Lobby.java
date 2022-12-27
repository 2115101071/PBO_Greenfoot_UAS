import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobby extends World
{

    /**
     * Constructor for objects of class Lobby.
     * 
     */
    public Lobby()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Play play = new Play();
        addObject(play,429,258);
        Options options = new Options();
        addObject(options,430,357);
        Exit exit = new Exit();
        addObject(exit,431,454);
        Ghost ghost = new Ghost();
        addObject(ghost,726,321);

        Spider spider = new Spider();
        addObject(spider,11,308);
        spider.setLocation(136,439);
        spider.setLocation(116,412);
        Spider spider2 = new Spider();
        addObject(spider2,729,171);
        spider2.setLocation(765,148);
        Spider spider3 = new Spider();
        addObject(spider3,712,559);
        spider3.setLocation(623,493);
        spider3.setLocation(629,538);
        Spider spider4 = new Spider();
        addObject(spider4,271,176);
        spider4.setLocation(234,169);
        Spider spider5 = new Spider();
        addObject(spider5,287,554);
        spider5.setLocation(254,528);
        Spider spider6 = new Spider();
        addObject(spider6,545,173);
        spider6.setLocation(530,162);
        spider4.setLocation(161,267);
        spider6.setLocation(459,180);
        spider4.setLocation(197,171);
        spider.setLocation(159,331);
        spider.setLocation(99,353);
        spider4.setLocation(109,123);
        spider4.setLocation(59,114);
        spider4.setLocation(111,114);
        spider6.setLocation(371,152);
        spider5.setLocation(360,372);
        spider.setLocation(166,452);
        spider4.setLocation(120,303);
        spider4.setLocation(120,259);
        spider4.setLocation(112,243);
        spider.setLocation(129,519);
        spider6.setLocation(497,141);
        spider2.setLocation(777,145);
        removeObject(spider6);
        spider2.setLocation(640,160);
    }
}
