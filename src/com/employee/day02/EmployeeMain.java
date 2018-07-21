
package com.employee.day02;

/**
 *
 * @author Bonifacio
 */
public class EmployeeMain {
    public static void main(String[] args) {
        Address ad = new Address();
        ad.setCity("Makati");
        ad.setPostalcode("1000");
        ad.setProvince("Bulacan");
        ad.setStreetaddress1("Street 1");
        ad.setStreetaddress2("Street 2");
        
        Employee emp = new Employee("Bonifacio","Ong","So","Manager","Software dev",ad);
        emp.printdetails();
    }
}
