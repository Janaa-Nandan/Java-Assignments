package Learnmaxxing.Assignment4;

//Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing
// different types of employees such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails.
// Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.
public class Employee {
    int empid;
    String empname;
    int empage;
    Employee(int id,String name, int age){
        this.empid = id;
        this.empname = name;
        this.empage = age;
    }
    String getEmployeeDetails(){
        String sysout = "ID : "+empid+" NAME : "+empname+" AGE : "+empage;
        return sysout;
    }
}
class HourlyEmployees extends Employee{
    double hourlysalary;
    HourlyEmployees(int id, String name, int age, int sal) {
        super(id, name, age);
        this.hourlysalary = sal;
    }
    @Override
    String getEmployeeDetails() {
        return super.getEmployeeDetails()+"EMPLOYEE SHIFT TYPE : \"HOURLY\" HOURLY SALARY : "+hourlysalary;
    }
}
class SalariedEmployees extends Employee{
    double salary;
    SalariedEmployees(int id, String name, int age, int sal) {
        super(id, name, age);
        this.salary = sal;
    }
    @Override
    String getEmployeeDetails() {
        return super.getEmployeeDetails()+"EMPLOYEE SHIFT TYPE : \"FULL TIME\"  SALARY : "+salary;
    }
}