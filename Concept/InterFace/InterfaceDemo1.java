class InterfaceDemo1
{
    public static void main(String arg[])
    {
       Demo obj = new Demo();

       float fRet = 0.0f;

       fRet = obj.Area(10.2f);
       System.out.println("Area is :"+fRet);

       fRet = obj.Circumference(12.7f);
       System.out.println(" Circumference is :"+fRet);

    } 
}
interface Circle
{
    float PI = 3.14f;
    public float Area(float Radius);
    public float Circumference(float Radius);
}

class Demo implements Circle
{
    public float Area(float Radius)
    {
        return PI * Radius *Radius;
    }

    public float Circumference(float Radius)
    {
        return 2* PI * Radius;
    }
}
