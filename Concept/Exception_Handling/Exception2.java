 import java .util.*;
class Exception2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] ={10,20,30,40,50};

        System.out.println("Enter the Index from Where you Want to fetch the Data");
        int iIndex = sobj.nextInt();

        System.out.println("Data is "+Arr[iIndex]);
    }
}