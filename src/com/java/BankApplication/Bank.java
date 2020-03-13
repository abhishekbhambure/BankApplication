import java.util.Scanner;
class Bank{
    String customerName;
    String customerId;
    double balance;
    
    Bank(String name, String id){
        this.customerName = name;
        this.customerId = id;
    }
    
    void deposite(double amount){
        balance = balance + amount;
    }
    
    void withdrawl(double amount){
        if(balance < amount){
            System.out.println("Insufficient Balance");
        }
        else{
            balance = balance - amount;
            System.out.println(+amount +" withdrawl , your current balance is : "+balance);
        }
    }
    
    double checkBalance(){
        return balance;
    }
    
    void startMenu(){
        char option = '\0';
        System.out.println("Welcome " +customerName + " Id : "+ customerId);
        System.out.println("**** Welcome ****");
        System.out.println("A. Deposite");
        System.out.println("B. Withdrawl");
        System.out.println("C. Check Balance");
        System.out.println("D. Exit");
        
        do{
            System.out.println("**** Enter your choice ****");
        Scanner sc = new Scanner(System.in);
        option = sc.next().charAt(0);
        System.out.println();
        
        switch(option){
            case 'A':
                System.out.println("Enter the amount to deposite: ");
                double amount = sc.nextDouble();
                deposite(amount);
                System.out.println(+amount +" deposited , your current balance is : "+balance);
                System.out.println();
                break;
                
            case 'B':
                System.out.println("Enter the amount to withdrawl: ");
                double amount2 = sc.nextDouble();
                withdrawl(amount2);
                System.out.println();
                break;
                
            case 'C':
                System.out.println("Your current balance is : " +balance);
                break;
                
            case 'D':
                System.out.println("See you soon...");
                break;
                
            default:
                System.out.println("Invalid Choice, please re-enter your choice..");
                break;
        }
         
        }while(option != 'D');
    }
    
    public static void main(String[] args){
        Bank b = new Bank("Abhishek","Cust001");
        b.startMenu();
    }    
}