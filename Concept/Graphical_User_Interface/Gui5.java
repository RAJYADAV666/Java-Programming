import java.awt.*;
import java.awt.event.*;

class ForkFrame
{
     public ForkFrame(String title)
     {
        Frame fobj = new Frame(title);
        fobj.setSize(300,600);
        fobj.setVisible(true);

        Button bobj = new Button("Submit");

        fobj.add(bobj);
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

class Gui5
{
    public static void main(String arg[])
    {
        ForkFrame ffobj = new ForkFrame("Fork");
    }
}