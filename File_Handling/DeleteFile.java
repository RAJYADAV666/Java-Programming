import java .io.*;
class DeleteFile
{
    public static void main(String arg[]) throws Exception
    {   

        File fobj = new File("Fork.txt");

        fobj.delete();
    }
}