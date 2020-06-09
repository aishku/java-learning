package people;

public class Address {
    private int pincode;
    private String city;
    private String houseNo;
    private String locality;

    public Address(int pc,String c,String hn,String locality){
        pincode=pc;
        city=c;
        houseNo=hn;
        this.locality=locality;
    }
    public int getPincode(){
        return pincode;
    }
    public String getCity(){
        return city;
    }
    public String getHouseNo(){
        return houseNo;
    }
    public String getLocality(){
        return locality;
    }
    public void setPincode(int pin){
        pincode=pin;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setHouseNo(String houseNo){
        this.houseNo=houseNo;
    }
    public void setLocality(String locality){
        this.locality=locality;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pincode=" + pincode +
                ", city='" + city + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", locality='" + locality + '\'' +
                '}';
    }
}
