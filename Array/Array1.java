class Array1
{
    public static void main(String arg[])
    {
        int arr1[] = {11,12,34,55}; //1

        int arr2[] = new int[4];  //2
        
        arr2[0] = 21;
        arr2[1] = 22;
        arr2[2] = 23;
        arr2[3] = 24;      

        System.out.println("Length of Array is"+arr2.length);

        int iCnt =0;

        for(iCnt =0 ;iCnt< arr2.length; iCnt++)
        {
            System.out.println(arr2[iCnt]);
        }

    }
}