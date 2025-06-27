class Overridingg
{
    public static void main(String arg[])
    {
        Base bobj = new Derived();

        bobj.fun();
        bobj.gun();
        bobj.sun();
        bobj.run();
        // bobj.mun();  error 
                 
    }
}

class Base
{
    public void fun()
    {
        System.out.println("Inside Base fun:");
    }
    public void gun()
    {
         System.out.println("Inside Base gun:");
    }
    public void sun()
    {
         System.out.println("Inside Base sun:");
    }
    public void run()
    {
         System.out.println("Inside Base run:");
    }
}
class Derived extends Base
{
    public  void fun()
    {
        System.out.println("Inside derived fun");
    }
    public void sun()
    {
        System.out.println("Inside derived sun");
    }
    public void run(int A)
    {
        System.out.println("Inside derived run");
    }
    public void mun()
    {
        System.out.println("Inside derived Mun");
    }
}