import java .util.*;

class Leap
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        int iYear=0;

        System.out.println("Enter the Year :");
        iYear=sobj.nextInt();

        if(iYear % 4==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year ");
        }
    }
}