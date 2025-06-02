import java .util.*;

class Evenodd
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        int No=0;

        System.out.println("Enter the Number:");
        No=sobj.nextInt();


        if(No %2==0)
        {
            System.out.println("Number is EVen:");
        }
        else{
            System.out.println("Number is Odd:");
        }
    }
}