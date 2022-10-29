import java.util.ArrayList;
import java.util.Scanner;

public class Control {

  private static Scanner s;
  private static ArrayList<Shop> sl = new ArrayList<Shop>();
  private static ArrayList<CustomerDetails> cl = new ArrayList<CustomerDetails>();

  //-------------Menu-----------------------------------------------------
  static void showMenu(){
    System.out.println(
      "\n\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=\n"+
      "Select an option from the menu\n"+
      "1: Add new item\n"+
      "2: Display all items\n"+
      "3: Add customer details\n"+
      "4: Quit\n"+
      "=*=*=*=*=*=*=*=*=*=*=*=*=*=*="
    );
  }



  //------------function--------------------------------------------------
  public static void main(String[] args){
    int option;
    s = new Scanner(System.in);

    do{
      Shop sh = new Shop();
      showMenu();
      option = s.nextInt();

        switch (option) {
          case 1:
            System.out.println("Enter item number: ");
            sh.setItemNumber(s.nextInt());
            //--------------------------------------------
            System.out.println("Enter item name: ");
            s = new Scanner(System.in);
            sh.setItemName(s.nextLine());
            //--------------------------------------------
            System.out.println("Enter item prices: ");
            sh.setItemPrice(s.nextInt());

            sh.addItem(sh);
            sl.add(sh);
            break;
        //===================================================//
          case 2:
            sh.displayItems(sl);
            break;
        //===================================================//
          case 3:
            _sellOutDetails();
            break;
        //===================================================//
          default:
            System.out.println("Thank you for using this service!!");
            break;
        }
    }while(option != 4);
  }

  private static void _sellOutDetails(){
    s = new Scanner(System.in);
    CustomerDetails c = new CustomerDetails();

    System.out.println("Enter customer name: ");
      c.setCustomerName(s.nextLine());
      System.out.println("Enter item number: ");
      c.setItemNumber(s.nextInt());
      System.out.println("Enter item quantity: ");
      c.setItemQuantity(s.nextInt());
      c.AddCustomerDetails(c);
      cl.add(c);
    System.out.println("Do you have more items? (Yes or No)");
    String choice = "";
    s.next();
    if(choice.contains("yes") == true){
        _sellOutDetails();
    }else{
        c.DisplayCustomerBills(cl, c.getCustomerName(),sl);
    }
  }
}
