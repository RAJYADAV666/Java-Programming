import java.io.*;

class CreateFile
{
    public static void main(String arg[]) throws Exception
    {
        File fobj = new File("Fork.txt");
        fobj.createNewFile();
    }
}