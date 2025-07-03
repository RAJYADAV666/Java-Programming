class InterfaceDemo
{
    public static void main(String arg[])
    {
        Marvellous mobj = new Marvellous(); 

        int iRet=0;

        iRet = mobj.Addtion(11,10);
        System.out.println("Addtion is "+iRet);

        iRet = mobj.Subtraction(11,10);
        System.out.println("SUbtraction is "+iRet);
    }
}
interface Mathmatics
{
    public int Addtion(int A , int B);
    public int Subtraction(int A, int B);

}
class Marvellous implements Mathmatics
{
    public int Addtion(int A, int B)
    {
        return A+B;
    }

    public int Subtraction(int A, int B)
    {
        return A-B;
    }
    
}