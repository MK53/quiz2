import greenfoot.*;
import java.awt.Color;
import java.util.*;
import javax.swing.*;
import greenfoot.core.WorldHandler;
public class Quiz2 extends World
{
    List<Integer> ile = new ArrayList<Integer>();
    Owoc1 owoc1=new Owoc1();
    Owoc2 owoc2=new Owoc2();
    Owoc3 owoc3=new Owoc3();
    Owoc4 owoc4=new Owoc4();
    Kosz1 kosz1=new Kosz1();
    Kosz2 kosz2=new Kosz2();
    Kosz3 kosz3=new Kosz3();
    Kosz4 kosz4=new Kosz4();
    Owoce owoce=new Owoce();
    Kosze kosze=new Kosze();
    int nazwaOwoc, nazwaKosz, o1,o2,o3,o4;
    public int test;
    JPanel panel = WorldHandler.getInstance().getWorldCanvas();
    public Quiz2()
    {    
        super(600, 400, 1);
        panel.removeAll();
        for(int i = 50; i <=350; i=i+100){
            ile.add(i);
        }
        int los = Greenfoot.getRandomNumber(4);
        addObject(owoc1, 50, ile.get(los));
        o1=ile.get(los);
        ile.remove(los);
        los = Greenfoot.getRandomNumber(3);
        addObject(owoc2, 50, ile.get(los));
        o2=ile.get(los);
        ile.remove(los);
        los = Greenfoot.getRandomNumber(2);
        addObject(owoc3, 50, ile.get(los));
        o3=ile.get(los);
        ile.remove(los);
        addObject(owoc4, 50, ile.get(0));
        o4=ile.get(0);
        addObject(kosz1, 550, 50);
        showText("Jabłko", 450, 50);//to można olać - dałem to, bo mi sie nie chciało inaczej wyjaśniac która beczka jest od którego owocu...
        addObject(kosz2, 550, 150);
        showText("Pomarańcza", 450, 150);//j.w
        addObject(kosz3, 550, 250);
        showText("Gruszka", 450, 250);//j.w
        addObject(kosz4, 550, 350);
        showText("Truskawka", 450, 350);//j.w
    }

    public void sprawdzOwoc(int nazwa)
    {
        nazwaOwoc=nazwa;
        wynik();
    }


    public void wynik()
    {
        if (nazwaOwoc==test)
        {
            switch(nazwaOwoc)
            {
                case 1:
                removeObject(kosz1);
                removeObject(owoc1);
                showText("", 450, 50);
                break;
                case 2:
                removeObject(kosz2);
                removeObject(owoc2);
                showText("", 450, 150);
                break;
                case 3:
                removeObject(kosz3);
                removeObject(owoc3);
                showText("", 450, 250);
                break;
                case 4:
                removeObject(kosz4);
                removeObject(owoc4);
                showText("", 450, 350);
                break;
            }
        }
        else
        {
            switch (nazwaOwoc) 
            {
                case 1:
                owoc1.setLocation(50,o1);
                break;
                case 2:
                owoc2.setLocation(50,o2);
                break;
                case 3:
                owoc3.setLocation(50,o3);
                break;
                case 4:
                owoc4.setLocation(50,o4);
                break;
            }

        }
    }
}
