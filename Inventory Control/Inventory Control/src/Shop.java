import java.util.ArrayList;

public class Shop {

  private int itemNumber;
  private String itemName;
  private int itemPrice;
  
  //-------getter&setter------------------------------------------------------------
  public void setItemNumber(int itemNumber) {
    this.itemNumber = itemNumber;
  }
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }
  public void setItemPrice(int itemPrice) {
    this.itemPrice = itemPrice;
  }
  public int getItemNumber() {
    return this.itemNumber;
  }
  public String getItemName() {
    return this.itemName;
  }
  public int getItemPrice() {
    return this.itemPrice;
  }
  


  //--------function①-----------------------------------------------------------------
  public void addItem(Shop s){
    this.itemName = s.itemName;
    this.itemNumber = s.itemNumber;
    this.itemPrice = s.itemPrice;
  }


  //--------function②-----------------------------------------------------------------
  public void displayItems(ArrayList<Shop> arr){
  System.out.println("\n\n");
  if(arr.isEmpty()){
    System.out.println("No item");
    return;
      }
      System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
      System.out.println( "Item Number\t\tItem Name\t\tItem Price");
      for (Shop shop :arr){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println( shop.itemNumber+"\t\t\t"+shop.itemName+"\t\t\t"+shop.itemPrice+"\t\t\t");
      }
      System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
    }
}
