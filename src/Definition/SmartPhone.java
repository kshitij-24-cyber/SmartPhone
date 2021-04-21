package Definition;

import java.util.Objects;

public class SmartPhone {
    private long imeiNumber;
    private String phoneName;
    private double price;
    private byte sizeOfScreen;

    public SmartPhone(long imeiNumber, String phoneName, double price, byte sizeOfScreen) {
        this.imeiNumber = imeiNumber;
        this.phoneName = phoneName;
        this.price = price;
        this.sizeOfScreen = sizeOfScreen;
    }

    public long getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(long imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte getSizeOfScreen() {
        return sizeOfScreen;
    }

    public void setSizeOfScreen(byte sizeOfScreen) {
        this.sizeOfScreen = sizeOfScreen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return imeiNumber == that.imeiNumber && Double.compare(that.price, price) == 0 && sizeOfScreen == that.sizeOfScreen && Objects.equals(phoneName, that.phoneName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imeiNumber, phoneName, price, sizeOfScreen);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "imeiNumber=" + imeiNumber +
                ", phoneName='" + phoneName + '\'' +
                ", price=" + price +
                ", sizeOfScreen=" + sizeOfScreen +
                '}';
    }
}
