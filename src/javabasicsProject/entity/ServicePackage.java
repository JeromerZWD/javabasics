package javabasicsProject.entity;

public class ServicePackage {
   public int price;

   public ServicePackage(int price) {
      this.price = price;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public void showInfo(){};
}
