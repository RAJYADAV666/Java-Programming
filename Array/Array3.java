class Array3
{
    public static void main(String arg[] )
    {
        int arr[] [] ={{10,20,30},{40,50},{60,70,80},{90,100,110,120,130},{140}};

        int i =0;
        int j=0;

        for(i =0;i<arr.length;i++)
        {
            for(j =0; j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }

            System.out.println();
        }

    }
}