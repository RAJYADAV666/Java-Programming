
class HashCode
{
    public static void main(String arg[])
    {
        Employee obj = new Employee("Amit ",23455,23,"Satara");
         Employee obj2 = new Employee("raj ",255,26,"pune");

        Employee eobj = obj ;

        obj.Display();

        System.out.println("Hash code of eobj is :"+obj.hashCode());
        System.out.println("Hash code of eobj is :"+eobj.hashCode());
        System.out.println("Hash code of eobj is :"+obj2.hashCode());

        obj =null;
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