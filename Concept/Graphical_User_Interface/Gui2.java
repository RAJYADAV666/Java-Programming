import java.awt.*;

class ForkFrame
{
    public ForkFrame(String title)
    {
        Frame fobj = new Frame(title);
        {
            fobj.setSize(300,300);
            fobj.setVisible(true);

        } 
    }

}

class Gui2
{
    public static void main(String arg[])
    {
       ForkFrame fobj = new ForkFrame("Fork");
    }
}