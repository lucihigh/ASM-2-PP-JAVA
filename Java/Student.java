public class Student 
{
    private String fullName;
    private int age;
    private String studentId;

    // Constructor
    public Student(String fullName, int age, String studentId) 
    {
        this.fullName = fullName;
        this.age = age;
        this.studentId = studentId;
    }

    
    public String getFullName() 
    {
        return fullName;
    }

    public void setFullName(String fullName) 
    {
        this.fullName = fullName;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public String getStudentId() 
    {
        return studentId;
    }

    public void setStudentId(String studentId) 
    {
        this.studentId = studentId;
    }

    // Display student info
    public void displayInfo() 
    {
        System.out.println("ID: " + studentId + " | Full Name: " + fullName + " | Age: " + age);
    }
}

