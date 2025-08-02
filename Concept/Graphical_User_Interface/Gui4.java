import java.awt.*;
import java.awt.event.*;

class ForkFrame
{
     public ForkFrame(String title)
     {
        Frame fobj = new Frame(title);
        fobj.setSize(300,600);
        fobj.setVisible(true);
        fobj.addWindowListener(new ForkListener());
     }

}
class ForkListener extends  WindowAdapter
{
      public void windowClosing(WindowEvent obj)
      {
        System.exit(0);
      }
}

class Gui4
{
    public static void main(String arg[])
    {
        ForkFrame ffobj = new ForkFrame("Fork");
    }
}