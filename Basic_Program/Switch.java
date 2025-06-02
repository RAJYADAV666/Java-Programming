import java .util.*;

class Switch
{
    public static void main(String arg[])
    {
        int Number=23;

        String Size;

        switch(Number){


        case 22:
            Size="Medium";
            break;

        case 34:
            Size="large";
            break;

        case 23:
            Size="normal";
            break;

        default:
            Size="unknown";  
            break;     

        }

        System.out.println("Size "+ Size);
    }


}