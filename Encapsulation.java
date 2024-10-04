// 1. public accessible from anywhere(within same class , package, sub class, and globally accross all packages).
// 2. private accessible only within same class.
// 3. protected accessible within the same package and by subclasses.
// 4. default accessible within package.
class Employee {
    private String name;
    private String email;
    private int age;

    protected String department;
    String company = "XYZ Corp";

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

    protected void setDepartment(String department) {
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age :" + age);
        System.out.println("Company: " + company);
        System.out.println("Department: " + department);
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Rohan Singhal");
        emp.setEmail("rohan5632@gmail.com");
        emp.setAge(26);
        emp.setDepartment("IT");
        emp.displayDetails();
    }
}
