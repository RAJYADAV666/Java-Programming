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
class ForkListener implements WindowListener
{
      public void windowDeactivated(WindowEvent obj){}
      public void windowActivated(WindowEvent obj){}
      public void windowDeiconified(WindowEvent obj){}
      public void windowIconified(WindowEvent obj){}
      public void windowClosed(WindowEvent obj){} 
      public void windowClosing(WindowEvent obj)
      {
        System.exit(0);
      }
      public void windowOpened(WindowEvent obj){}   

}

class Gui3
{
    public static void main(String arg[])
    {
        ForkFrame ffobj = new ForkFrame("Fork");
    }
}