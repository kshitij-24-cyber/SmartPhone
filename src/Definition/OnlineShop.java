package Definition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OnlineShop {

    public List<SmartPhone> getListOfSmartPhones(Set<SmartPhone> smartPhones, byte requiredScreenSize) {
        List<SmartPhone> smartPhoneList = new ArrayList<>();
        for ( SmartPhone smartPhone : smartPhones){
            if(smartPhone.getScreenSize() >= requiredScreenSize){
                smartPhoneList.add(smartPhone);
            }
            smartPhone.setPrice(smartPhone.getPrice() - smartPhone.getPrice()*0.1);
        }
        return smartPhoneList;
    }

}
