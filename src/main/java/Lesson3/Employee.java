package Lesson3;

public class Employee {
    private String nameSurname;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String nameSurname, String position, String email, String phone, int salary, int age) {
        this.nameSurname = nameSurname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.printf("Name: %s\nPosition: %s\nEmail: %s\nPhone: %s\nSalary: %d\nAge: %d\n",
                getNameSurname(), getPosition(), getEmail(), getPhone(), getSalary(), getAge());
        System.out.println("----------------------------------------------------");
    }
}
