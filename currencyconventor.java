import java.util.*;
public class currencyconventor {
    public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Welcome to the CURRENCY CONVENTOR!");
            System.out.println("1.Indian Rupees(Rs)");
            System.out.println("2.USD($)");
            System.out.println("3.Euro(EUR)");
            System.out.println("4.Japanese yen(JPY)");
            System.out.println("5.British pound(GBP)");
            
            
            int choice=scanner.nextInt();
            if(choice==1){
                System.out.print("Enter the amount in Indian Rupees :");
                double Rs=scanner.nextInt();
                double USD=Rs*0.012;
                System.out.println("The Indian rupees to USD  is :" + USD + "USD");
                double EUR=1*0.011;
                System.out.println("The Indian rupees to EURO is :" + EUR + "EUR");
                double JPY=Rs*1.93;
                System.out.println("The Indian rupees to JPY  is :" + JPY + "JPY");
                double GBP=Rs*0.0095;
                System.err.println("The Indian ruppes to GPB  is :" +  GBP + "GBP");
            }
            else if(choice==2){
                System.out.print("Enter the amount in USD :");
                double USD=scanner.nextDouble();
                double Rs=USD*83.40;
                System.out.println("The USD to Rs   is :" + Rs + "INR");
                double EUR=USD*0.93 ;
                System.out.println("The USD to EURO is :" + EUR + "EUR");
                double JPY=USD*160.61;
                System.out.println("The USD to JPY  is :" + JPY + "JPY");
                double GBP=USD*0.79;
                System.out.println("The USD to GBP  is :" + GBP + " GBP");
         }
            else if(choice==3){
                System.out.print("Enter the amount in EURO :");
                double EURO=scanner.nextInt();
                double Rs=EURO*89.29;
                System.out.println("The Euro to Rs  is :" + Rs + "INR");
                double USD=EURO*1.07;
                System.out.println("The Euro to USD is :" + USD + "USD");
                double JPY=EURO*172.03;
                System.out.println("The Euro to JPY is :" + JPY + "JPY");
                double GBP=EURO*0.85;
                System.err.println("The Euro to GPB is :" + GBP + "GBP");
             }
             else if(choice==4){
                System.out.print("Enter the amount in Japanese yen:");
                double JPY=scanner.nextInt();
                double Rs=JPY*0.52;
                System.out.println("The Japanese yen to Rs   is :" + Rs + "INR");
                double USD=JPY*0.0062;
                System.out.println("The Japanese yen to USD  is :" + USD + "USD");
                double EUR=JPY*0.0058;
                System.out.println("The Japanese yen to EURO is :" + EUR + "EUR");
                double GBP=JPY*0.0049;
                System.err.println("The Japanese yen to GBP  is :" + GBP + "GBP");
                 }
                 else if(choice==5){
                    System.out.print("Enter the amount in British pound:");
                    double GBP=scanner.nextInt();
                    double Rs=GBP*105.47;
                    System.out.println("The pound to Rs   is :" + Rs + "INR");
                    double USD=GBP*1.26;
                    System.out.println("The pound to USD  is :" +  USD + "USD");
                    double EUR=GBP*1.18;
                    System.err.println("The pound to EURO is :" + EUR + "EUR");
                    double JPY=GBP*203.21;
                    System.out.println("The pound to JPY  is :" + JPY + "JPY");
         }
         else{
            System.out.println("Invalid");
         }
         scanner.close();

    }
}

    

