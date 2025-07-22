class FinalizeDemo2
{
    public static void main(String arg[])
    {
        Employee obj = new Employee("Amit ",23455,23,"Satara");

        obj.Display();
        System.gc();
    }    
}
class Employee
{
    public String Name;
    public int Salary;
    public int Age;
    public String Address;

    Employee(String str,int amount , int A , String addr)
    {
        this.Name =str;
        this.Salary = amount;
        this.Age =A;
        this.Address = addr;
    }

    protected void Finalize()
    {
        System.out.println("Inside Finalize Method :...");
    }

    void Display()
    {
        System.out.println("Employee Name :"+this.Name);
        System.out.println("Employee Salary :"+this.Salary);
        System.out.println("Employee Age : "+this.Age);
        System.out.println("Employee Address :"+this.Address);
    }
}