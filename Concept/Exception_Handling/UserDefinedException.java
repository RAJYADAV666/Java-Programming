import java .util.*;

class UserDefinedException
{
    public static void main(String arg[])
    {
        
    Scanner sobj = new Scanner(System.in);
    int iage =0;

    System.out.println("Enter your age:");
    iage = sobj.nextInt();

    try
    {
        if(iage < 18)
        {
           throw new AgeInvalid("Your age is Below 18");
        }
        else
        {
            System.out.println("Login Succesfully ");
        }
    }
    catch(AgeInvalid obj)
    {
        System.out.println("Inside a catch block:");
        System.out.println(obj);
    }
    }

}

class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
        super (str);
    }
}