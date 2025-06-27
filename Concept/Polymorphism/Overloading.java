class Overloading
{
    public static void main(String arg[])
    {   
        Arithmatic aobj = new Arithmatic();

        int iRet=0;
        double dret=0.0;

        iRet=aobj.Addition(10,11);
        System.out.println("Addtion is "+iRet);

        iRet=aobj.Addition(10,11,12);
        System.out.println("Addtion is "+iRet);

        dret=aobj.Addition(10.2,11.23);
        System.out.println("Addtion is "+dret);


    }
}
class Arithmatic
{
    public int Addition(int A,int B)
    {
        return A+B;
    }

    public int Addition(int A, int B,int C)
    {
        return A+B+C;
    }
    public double Addition(double A ,double B)
    {
        return A+ B;
    }

}