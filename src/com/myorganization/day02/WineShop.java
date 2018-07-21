
package com.myorganization.day02;

/**
 *
 * @author Bonifacio
 */
public class WineShop extends Shop {
    private boolean areminormsallowed;

    public void setAreminormsallowed(boolean areminormsallowed) {
        this.areminormsallowed = areminormsallowed;
    }

    public WineShop(boolean areminormsallowed, String name, String[] items, String address, int employees) {
        super(name, items, address, employees);
        this.areminormsallowed = areminormsallowed;
    }

    public WineShop(boolean areminormsallowed) {
        this.areminormsallowed = areminormsallowed;
    }

    @Override
    public void printDetails() {
        super.printDetails(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Are minors allowed? "+areminormsallowed);
    }
    
}
