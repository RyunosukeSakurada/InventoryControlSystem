import java.util.ArrayList;

public class CustomerDetails {
  
  private int customerId;
  private String customerName;
  private int itemQuantity;
  private int itemNumber;
  private float totalBill;


  //-------------getter&setter----------------------------------------
  public float gettotalBill(){
    return customerId;
  }
  public void  settotalBill(float bill){
    this.totalBill = bill;
  }
  public int getCustomerId() {
    return customerId;
  }
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }
  public String getCustomerName() {
    return customerName;
  }
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  public int getItemQuantity() {
    return itemQuantity;
  }
  public void setItemQuantity(int itemQuantity) {
    this.itemQuantity = itemQuantity;
  }
  public int getItemNumber() {
    return itemNumber;
  }
  public void setItemNumber(int itemNumber) {
    this.itemNumber = itemNumber;
  }
  //-----------------------------------------------------------------


  public void AddCustomerDetails(CustomerDetails c){
    this.customerId = c.customerId;
    this.customerName = c.customerName;
    this.itemQuantity = c.itemQuantity;
  }
  
  public float DisplayCustomerBills(ArrayList<CustomerDetails> arr, String customerName, ArrayList<Shop> sl){
    float total = 0;
    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
    System.out.println( "\n\nCustomer Name\t\tItem Number\t\tItem quantity");
    System.out.println("-----------------------------------------------------------------------");

    //----------for--------------
    for(CustomerDetails c : arr){
      if(c.customerName.equals(customerName)){

        System.out.println( c.customerName+"\t\t\t"+c.itemNumber+"\t\t\t"+c.itemQuantity);
        for(Shop shop : sl){
            if(shop.getItemNumber() == c.itemNumber){
              total += (c.itemQuantity * shop.getItemPrice());
            }
        }
      } 
    }
    //----------for--------------

    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
    System.out.println("Subtotal = " + total);

    float dis = 0;
    float sf = 0; 
    if(total < 300){
      dis = (total * 15) / 100;
      sf = 40;
    }
    else{
      if(total >= 300 && total < 600){
        dis = (total * 20)/100;
        sf = 20;
      }
      else{
        if(total >= 600){
          dis = (total * 30)/100;
          sf = 0;
        }
        // ------------for--------------
        for (CustomerDetails cus :arr){
          if(cus.getCustomerName().equals(customerName)){
            cus.setTotalBill(total);
          }
        }
        // ------------for--------------
      }
    }//else
    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
    System.out.println("Shopping Fee = " + sf);
    System.out.println("Subtotal with Shopping Fee = " + (total+ sf));
    System.out.println("Discount = " + dis);
    System.out.println("------------------------------------------------");
    System.out.println("Total bill = " + ((total + sf) - dis));
    System.out.println("------------------------------------------------");

    return (total - dis);
  }
  
  
  
  public float getTotalBill() {
    return totalBill;
  }
  public void setTotalBill(float totalBill) {
    this.totalBill = totalBill;
  }
  public void DisplayCustomerBill(ArrayList<CustomerDetails> cl, String customerName2) {
  }
}