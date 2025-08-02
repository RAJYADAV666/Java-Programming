import java .util.*;

class Collection
{
    public static void main(String arg[])
    {
        LinkedList <Integer> lobj = new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(12);
        lobj.add(13);
        lobj.add(14);
        
        lobj.addFirst(2);

        System.out.println(lobj);
        boolean bret = true;

        bret = lobj.contains(13);

        if(bret == true)
        {
            System.out.println("LL contains 13 in it");
        }
        else
        {
             System.out.println("LL  not contains 13 in it");
        }

        Iterator iobj = lobj.iterator();

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        System.out.println(lobj.indexOf(13));
    }
}