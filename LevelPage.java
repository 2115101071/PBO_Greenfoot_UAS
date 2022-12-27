import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelPage extends World
{

    /**
     * Constructor for objects of class LevelPage.
     * 
     */
    public LevelPage()
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
        SelectLevel selectLevel = new SelectLevel();
        addObject(selectLevel,506,103);
        selectLevel.setLocation(457,91);
        EasyB easyB = new EasyB();
        addObject(easyB,458,232);
        MediumB mediumB = new MediumB();
        addObject(mediumB,460,337);
        HardB hardB = new HardB();
        addObject(hardB,462,440);
    }
}
