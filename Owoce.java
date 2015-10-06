import greenfoot.*;

public class Owoce extends Actor
{
    int nazwa;
    boolean isGrabbed;
    Kosze kosze=new Kosze();

    public void act() 
    {

        if (Greenfoot.mousePressed(this) && !isGrabbed)
        {
            // grab the object
            isGrabbed = true;
            // the rest of this block will avoid this object being dragged UNDER other objects
            Quiz2 quiz = (Quiz2) getWorld();
            MouseInfo info = Greenfoot.getMouseInfo();
            getWorld().removeObject(this);
            getWorld().addObject(this, info.getX(), info.getY());
            return;
        }
        // check for actual dragging of the object
        if ((Greenfoot.mouseDragged(this)) && isGrabbed)
        {
            // follow the mouse
            MouseInfo info = Greenfoot.getMouseInfo();
            setLocation(info.getX(), info.getY());
            return;
        }
        // check for mouse button release
        if (Greenfoot.mouseDragEnded(this) && isGrabbed)
        {
            if (isTouching(Kosze.class))
            {
                Quiz2 quiz = (Quiz2) getWorld();
                quiz.sprawdzOwoc(nazwa);
            }
            isGrabbed = false;
            return;
        }
    }    
   
}
