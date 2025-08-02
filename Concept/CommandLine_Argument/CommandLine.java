class CommandLine
{
    public static void main(String arg[])
    {
        System.out.println("Number of Command line arguments are:"+arg.length);

        System.out.println("Command Line arguments are:");

        for(int i =0;i<=arg.length;i++)
        {
            System.out.println(arg[i]);
        }
    }
}