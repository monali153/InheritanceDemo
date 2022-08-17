package data;

public class Address {

   private int houseNo;
   private String streetName;
   private String city;
   private String country;
   private int zipCode;

   public Address(int houseNo, String streetName, String city, String country, int zipCode){
      this.houseNo = houseNo;
      this.streetName = streetName;
      this.city = city;
      this.country = country;
      this.zipCode = zipCode;
   }

   public  void setHouseNo(int houseNo){
      this.houseNo = houseNo;
   }
   public int getHouseNo(){
      return houseNo;
   }
   public void setStreetName(String streetName){
      this.streetName = streetName;
   }
   public String getStreetName(){
      return streetName;
   }
   public void setCity(String city){
      this.city = city;
   }
   public String getCity(){
      return city;
   }
   public void setCountry(String country){
      this.country = country;
   }
   public String getCountry(){
      return country;
   }
   public void setZipCode(int zipCode){
      this.zipCode= zipCode;
   }
   public int getZipCode(){
      return zipCode;
   }

   public void display(){
      System.out.println("Address Details");
      System.out.println("houseNo = " + houseNo);
      System.out.println("streetName = " + streetName);
      System.out.println("city = " + city);
      System.out.println("country = " + country);
      System.out.println("zipCode = " + zipCode);
      System.out.println();
   }
}
