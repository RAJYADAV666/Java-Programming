class FinalCharchterstic
{
    public static void main(String arg[])
    {
        Demo dobj1 = new Demo();
        System.out.println("Value of A:"+ dobj1.A);
        System.out.println("Value of B :"+dobj1. B); 

        Demo dobj2 = new Demo(66,76);
        System.out.println("Value of A:"+ dobj2.A);
        System.out.println("Value of B :"+dobj2. B); 

    }
 }
 class Demo 
 {
    public int A;
    public final int B ;

    Demo()
    {
        A=11;
        B=21;
    }

    Demo(int i, int j)
    {
        A=i;
        B=j;
    }

 }