
package com.employee.day02;

/**
 *
 * @author Bonifacio
 */
public class Employee {
    private String firstname;
    private String middlename;
    private String lastname;
    private String jobtitle;
    private String department;
    private Address address;

    public Employee() {
    }

    public Employee(String firstname, String middlename, String lastname, String jobtitle, String department, Address address) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.jobtitle = jobtitle;
        this.department = department;
        this.address = address;
    }

    public void printdetails(){
        System.out.println("Name: "+firstname + " "+middlename+" "+lastname);
        System.out.println("Position: "+jobtitle+" "+department);
        System.out.println("Adress: "+address.getStreetaddress1()+" "+address.getStreetaddress2()+" "+address.getCity()+" "+address.getPostalcode());
        
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    
    
    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public String getDepartment() {
        return department;
    }

    public Address getAddress() {
        return address;
    }
    
    
}
