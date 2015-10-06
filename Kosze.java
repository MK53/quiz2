import greenfoot.*;

public class Kosze extends Actor
{

    int nazwa;

    public void act() 
    {

        if (isTouching(Owoce.class))
        {
            Quiz2 quiz = (Quiz2) getWorld();
            quiz.test=nazwa;

        }

    }
}
