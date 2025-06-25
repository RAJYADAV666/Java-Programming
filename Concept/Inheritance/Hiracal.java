class Hiracal
{
       public static void main(String arg[])
       {
        
            Derived  dobj2 = new Derived();
            DerivedX dobj1 = new DerivedX();
            
       }

}
class Base 
{
    public int A,B;

    public Base()
    {
        System.out.println("Base Constructer:");
    }

    public void fun()
    {
        System.out.println("Base Fun");
    }

    
}
class Derived extends Base
{
    public int X,Y;

    public Derived()
    {
        System.out.println("Derived Constructer:");
    }

    public void gun()
    {
        System.out.println("Derived Gun");
    }
}

class DerivedX extends Base
{
    public int P,Q;

    public DerivedX()
    {
        System.out.println("DerivedX Constructer");
    }

} 