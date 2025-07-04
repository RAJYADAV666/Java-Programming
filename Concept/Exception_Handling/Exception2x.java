 import java .util.*;
class Exception2x
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the Second Number:");
        int iNo2 = sobj.nextInt();

        int iAns=0;

       try
       {
        System.out.println("Inside try Block:");
         iAns = iNo1/iNo2;
       }
       catch(ArithmeticException obj)
       {
        System.out.println("Inside Cath Block"+obj);
       }
       catch(ArrayIndexOutOfBoundsException obj )
       {
        System.out.println("Array index out of bounds exception"+obj);
       }
       catch (Exception obj )
       {
        System.out.println("Inside the Generic catch block:"+obj);
       }
       finally
       {
        System.out.println("Inside Finally Block:");
       }
 
        System.out.println("Division is :"+iAns);
    }
}