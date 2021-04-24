package Execution;

import Definition.OnlineShop;
import Definition.SmartPhone;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<SmartPhone> KhannaMobileShope = new HashSet<>();
        KhannaMobileShope.add(new SmartPhone(12345678, "Samsung", 1500.0, (byte) (6)));
        KhannaMobileShope.add(new SmartPhone(123546879, "Apple", 50000.0, (byte) (5)));
        KhannaMobileShope.add(new SmartPhone(12342678, "Blackbeery", 9000.0, (byte) 4));
        KhannaMobileShope.add(new SmartPhone(12245678, "Vmax", 11000.0, (byte) 7));
        KhannaMobileShope.add(new SmartPhone(12145678, "redmi", 10002., (byte) 7));
        KhannaMobileShope.add(new SmartPhone(22345678, "Vergin", 12000.0, (byte) 6));
        KhannaMobileShope.add(new SmartPhone(32345678, "Oppo", 11000.0, (byte) 3));
        KhannaMobileShope.add(new SmartPhone(98765432, "Vivo", 1500000.0, (byte) 8));

        OnlineShop onlineShop = new OnlineShop();
        List<SmartPhone> result = onlineShop.getListOfSmartPhones(KhannaMobileShope, (byte) 5);
        for (SmartPhone smartPhone : result) {
            System.out.println(smartPhone);
        }
        System.out.println("                         ");
        List<SmartPhone> result1 = onlineShop.findBudgetSmartPhone(KhannaMobileShope);
        for (SmartPhone smartPhone : result1) {
            System.out.println(smartPhone);
        }
        System.out.println();
        System.out.println(onlineShop.searchPhone(KhannaMobileShope, 12345678));
    }
}
