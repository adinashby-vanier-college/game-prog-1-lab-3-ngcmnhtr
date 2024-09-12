// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here. @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 100, 293);
        Worm worm =  new  Worm();
        addObject(worm, 244, 184);
        Worm worm2 =  new  Worm();
        addObject(worm2, 333, 261);
        Worm worm3 =  new  Worm();
        addObject(worm3, 263, 335);
        Worm worm4 =  new  Worm();
        addObject(worm4, 422, 170);
        Worm worm5 =  new  Worm();
        addObject(worm5, 129, 134);
    }
}
