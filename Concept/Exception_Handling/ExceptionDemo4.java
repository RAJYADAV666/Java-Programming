import java .util.*;

class ExceptionDemo4
{
    public static void main(String arg[])
    {
        Demo dobj = new Demo();
        
       try
       {
          dobj.Division();
       }

      catch(ArithmeticException obj )
      {
            System.out.println("Inside the Catch Block:");

      }
      finally
      {
        System.out.println("Inside Finally Block:");
      }

    }
}

class Demo 
{
    public void Division() throws ArithmeticException 
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 =0;
        int iNo2 =0;
        int iRes = 0;

        System.out.println("Enter the FIrst Number :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the Second Number:");
        iNo2 = sobj. nextInt();

        iRes = iNo1 /iNo2;

        System.out.println("The Division is "+iRes);

    }
}