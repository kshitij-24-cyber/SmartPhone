package Definition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OnlineShop {

    public List<SmartPhone> getListOfSmartPhones(Set<SmartPhone> smartPhones, byte requiredScreenSize) {
        List<SmartPhone> smartPhoneList = new ArrayList<>();
        for (SmartPhone smartPhone : smartPhones) {
            if (smartPhone.getScreenSize() >= requiredScreenSize) {
                smartPhoneList.add(smartPhone);
            }
            smartPhone.setPrice(smartPhone.getPrice() - smartPhone.getPrice() * 0.1);
        }
        return smartPhoneList;
    }

    public List<SmartPhone> findBudgetSmartPhone(Set<SmartPhone> smartPhones) {
        List<SmartPhone> list1 = new ArrayList<>();
        for (SmartPhone smartPhone : smartPhones) {
            if (smartPhone.getPrice() >= 10000) {
                list1.add(smartPhone);
            }
        }
        if (list1.isEmpty()) {
            list1.add(new SmartPhone(945116296, "samsaung", 10000.0, (byte) 5));
        }
        return list1;


    }




}
