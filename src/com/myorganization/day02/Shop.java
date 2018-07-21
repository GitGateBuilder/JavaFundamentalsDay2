
package com.myorganization.day02;

/**
 *
 * @author Bonifacio
 */
public class Shop {
    private String name;
    private String[] items;
    private String address;
    private int employees;

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public String[] getItems() {
        return items;
    }

    public String getAddress() {
        return address;
    }

    public int getEmployees() {
        return employees;
    }

    
    
    public Shop(String name, String[] items, String address, int employees) {
        this.name = name;
        this.items = items;
        this.address = address;
        this.employees = employees;
    }

    public Shop() {
    }
    
    
    
    public String findbyItemName(String name){
        return "";
    }
    
    public void printDetails(){
        System.out.println("Name: "+name);
        
        for (String item: items){
            System.out.println(item);
        }
        
        System.out.println("Address:"+address);
        System.out.println("Employees:"+employees);
    }
}
