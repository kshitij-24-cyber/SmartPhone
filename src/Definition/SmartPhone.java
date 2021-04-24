package Definition;


import java.util.Objects;

public class SmartPhone {
    private final long IMEInumber;
    private  final String PhoneName;
    private Double price;
    private byte ScreenSize;

    public SmartPhone(long IMEINumber, String phoneName, Double price, byte screenSize) {
        this.IMEInumber = IMEINumber;
        PhoneName = phoneName;
        this.price = price;
        ScreenSize = screenSize;
    }

    public long getIMEInumber() {
        return IMEInumber;
    }

    public String getPhoneName() {
        return PhoneName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public byte getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(byte screenSize) {
        ScreenSize = screenSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return IMEInumber == that.IMEInumber && ScreenSize == that.ScreenSize && Objects.equals(PhoneName, that.PhoneName) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IMEInumber, PhoneName, price, ScreenSize);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "IMENumber=" + IMEInumber +
                ", PhoneName='" + PhoneName + '\'' +
                ", price=" + price +
                ", ScreenSize=" + ScreenSize +
                '}';
    }
}
