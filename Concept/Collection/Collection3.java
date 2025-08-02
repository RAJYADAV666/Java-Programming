import java .util.*;

class Collection3
{
    public static void main(String arg[])
    {
        Hashtable <String , Integer> hobj = new Hashtable<String,Integer>();

        hobj.put("C" ,2000);
        hobj.put("C++",3000);
        hobj.put("C#" ,4000);
        hobj.put("Android",5000);

        System.out.println(hobj.get("C"));

        Enumeration eobj = hobj.keys();

        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }
    }
}