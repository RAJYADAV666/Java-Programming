// one Interface Extend another Interface 
class InterfaceDemo2
{
    public static void main(String arg[])
    {
        Raj robj = new Raj();
    }
}
interface Demo
{
    void Fun();
}
interface Hello extends Demo
{
    void Gun();
}
class Raj implements Demo ,Hello
{
    public void fun()
    {

    }
    public void Gun()
    {

    }

}