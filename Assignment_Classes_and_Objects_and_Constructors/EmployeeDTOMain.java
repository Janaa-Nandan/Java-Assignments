package Learnmaxxing.Assignment_Classes_and_Objects_and_Constructors;

import java.util.ArrayList;

public class EmployeeDTOMain {
    public static void main(String[] args) {
        EmployeeDTO employee1 = new EmployeeDTO(1, "firstname1", "lastname1", "firstname1_lastname1@gmail.com", "9876543210", "123-456-789");
        EmployeeDTO employee2 = new EmployeeDTO();
        employee2.setFirstName("firstname2");
        employee2.setLastName("lastname2");
        employee2.setEmail("firstnam2_lastname2@gmail.com");
        employee2.setSsn("987-654-321");
        employee2.setPhoneNumber("1234567890");
        System.out.println("Company Name: " + EmployeeDTO.getCompanyName());
        System.out.println("Total Employees: " + EmployeeDTO.getEmployeeCount());
        for (EmployeeDTO emp : EmployeeDTO.employees){
            System.out.println(printer(emp));
        }
    }
    public static String printer(EmployeeDTO emp){
        return "Employee id = '" + emp.getId() + '\'' +
                ", Firstname = '" + emp.getFirstName() + '\'' +
                ", Lastname = '" + emp.getLastName() + '\'' +
                ", Email = '" + emp.getEmail() + '\'' +
                ", Phone number = " + emp.getPhoneNumber() +
                ", SSN number = " + emp.getSsn();
    }
}
class EmployeeDTO {
    static ArrayList<EmployeeDTO> employees = new ArrayList<>();
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String ssn; // Social Security Number (PII)
    private static String companyName = "ZohoCorp";
    private static int employeeCount = 0;
    public EmployeeDTO(int id, String firstName, String lastName, String email, String phoneNumber, String ssn) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        employees.add(employeeCount,this);
        employeeCount++;
    }
    public EmployeeDTO(){
        employees.add(employeeCount,this);
        employeeCount++;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public static void setCompanyName(String companyName) {
        EmployeeDTO.companyName = companyName;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getSsn() {
        return ssn;
    }
    public static String getCompanyName() {
        return companyName;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
