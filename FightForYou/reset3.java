import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class reset3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reset3 extends botton
{
    /**
     * Act - do whatever the reset3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public void act() 
    {
        // Add your action code here.
        checkClick();
        
    }    
    public void checkClick(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("click.wav");
            Greenfoot.setWorld(new LevelThree());
            
            Score.score = 0;
        } 
    }  
}
