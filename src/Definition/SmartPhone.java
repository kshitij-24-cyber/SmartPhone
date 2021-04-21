package Definition;

import java.util.Objects;

public class SmartPhone {
    private long imeiNumber;
    private String nameOfPhone;
    private double priceOfPhone;
    private byte screenSize;

    public SmartPhone(long imeiNumber, String nameofPhone, double priceOfPhone, byte screenSize) {
        this.imeiNumber = imeiNumber;
        this.nameOfPhone = nameofPhone;
        this.priceOfPhone = priceOfPhone;
        this.screenSize = screenSize;
    }

    public long getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(long imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public String getNameofPhone() {
        return nameOfPhone;
    }

    public void setNameofPhone(String nameofPhone) {
        this.nameOfPhone = nameofPhone;
    }

    public double getPriceOfPhone() {
        return priceOfPhone;
    }

    public void setPriceOfPhone(double priceOfPhone) {
        this.priceOfPhone = priceOfPhone;
    }

    public byte getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(byte screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return imeiNumber == that.imeiNumber && Double.compare(that.priceOfPhone, priceOfPhone) == 0 && screenSize == that.screenSize && Objects.equals(nameOfPhone, that.nameOfPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imeiNumber, nameOfPhone, priceOfPhone, screenSize);
    }
}
