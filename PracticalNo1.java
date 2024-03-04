
class PracticalNo1
{
    public static void main(String[] argv) 
{
        CompanyData SBJIT = new CompanyData("Himanshu Talekar", 19, "Male", 16);
        SBJIT.display();
}
}

class CompanyData 
{
    String name;
    int age;
    String gender;
    int empid;

    CompanyData() 
{
        System.out.println("Inside Default Constructor");
}

    CompanyData(String nm, int ag, String gen, int em) 
{ 
        System.out.println("Inside Parametrized Constructor");

        this.name = nm;
        this.age = ag;
        this.gender = gen;
        this.empid = em;
}

    public void display()  
{
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Gender: " + this.gender);
    System.out.println("Emp ID: " + this.empid);
}
}