import java.io.*;

class WriteFile
{
    public static void main(String arg[]) throws Exception
    {
        String Data = "Fork Infosystem";
        byte Arr[] = Data.getBytes();

        FileOutputStream fobj = new FileOutputStream("Fork.txt");
        fobj.write(Arr);
    }
}