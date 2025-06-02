import java .util.*;

class Even
{
     public static boolean Chkbool(int iValue)
    {
        if(iValue % 2==0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String arg[])
    {
        Scanner sobj= new Scanner(System.in);

        int No=0;
        boolean bret=false;

        System.out.println("Enter the Number:");
        No=sobj.nextInt();

        bret=Chkbool(No);

        if(bret==true)
        {
            System.out.println("Number is Even:");
        }
        else
        {
            System.out.println("Number is Odd:");
        }
    }

     
}

