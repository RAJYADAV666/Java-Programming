
class CloneMethod
{
    public static void main(String arg[])
    {
        Employee obj1 = new Employee("Amit ",23455,23,"Satara");
        
        Employee obj2 = (Employee)obj1.clone();
        obj1.Display();
        obj2.Display();

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
    void Display()
    {
        System.out.println("Employee Name :"+this.Name);
        System.out.println("Employee Salary :"+this.Salary);
        System.out.println("Employee Age : "+this.Age);
        System.out.println("Employee Address :"+this.Address);
    }

    try
    {
      public Object clone() 
     {
        return super.clone();
     }
    }
    catch(CloneNotSupportedException obj)
    {

    }
}