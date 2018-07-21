
package com.myorganization.day02;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bonifacio
 */
public class ShopMain {
    public static void main(String[] args) {
        System.out.println("Hey!");
        
        Shop wineShop = new Shop("Juan's", new String[]{"ed","Edd","eddy"},"Sikatuna",3);
//        wineShop.name="Juan's";
//        wineShop.address="Dito";
//        wineShop.items = new String[]{"Wine 1", "Wine 2", "Wine 3"};
        wineShop.printDetails();
        
        Shop cakeShop = new Shop();
        cakeShop.setName("Pektos");
        cakeShop.setAddress("Dun");
        cakeShop.setItems(new String[]{"Cake 1", "Cake 2", "Cake 3"});
        cakeShop.setEmployees(-1);
        cakeShop.printDetails();
        
        WineShop overwine = new WineShop(true,);
        //just adding comments here for repo change purposes
    }
}
