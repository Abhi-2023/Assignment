import java.util.*;
interface functions{
    public void deposit(double amt);
    public void withdraw(double amt);
    public void previousTransaction();
    }

class BankFunctionImplementation implements functions{
    private double bal;
    private double prevTrans;
    public double getBal() {
        return bal;
    }
    public void setBal(double bal) {
        this.bal = bal;
    }
   
    public  void deposit(double amt){
        if(amt>0){
            bal += amt;
            prevTrans = amt;
        }
    }
    public void withdraw(double amt){
        if(bal>amt){
            bal -= amt;
            prevTrans =- amt;
        }
        if(bal < amt){
            System.out.println("Your balance is insufficient to withdraw this amount.");
        }
    }
     public void previousTransaction(){
        if(prevTrans>0){
            System.out.println("Your previous transaction was deposit of Rs." +prevTrans);
        }
        else if(prevTrans<0){
            System.out.println("Your previous transaction was withdraw of Rs."+ Math.abs(prevTrans));
        }
    }
}
class BankApplication  extends BankFunctionImplementation {
    String name;
    int pin;
    BankApplication(String name, int pin){
        this.name = name;
        this.pin = pin;
    }
    
    public void menu(){
        System.out.println("Welcome :: " +name);
        Scanner sc = new Scanner(System.in);
        int cmd = 1, option;
        while(cmd == 1){
            System.out.println("Please select below option to proceed");
            System.out.println("Press 1) To Check Balance");
            System.out.println("Press 2) To deposit amount");
            System.out.println("Press 3) To withdraw amount");
            System.out.println("Press 4) To Check Previou Transaction");
            System.out.println("Press 5) To exit.");
            option = sc.nextInt();
            switch(option){
                case 1 :{
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println();
                    System.out.println("Your balance is :: Rs." + getBal());                    
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println();
                    break;
                }
                case 2 :{
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println();
                    System.out.println("Please enter your amount.");
                    double amount = sc.nextDouble();
                    deposit(amount);
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println();
                    break;
                }
                case 3 :{
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println();
                    System.out.println("Please enter your amount.");
                    double amount = sc.nextDouble();
                    withdraw(amount);
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println();
                    break;
                }
                case 4 : {
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println();
                    previousTransaction();
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println();
                    break;
                }
                case 5 : {
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println();
                    System.out.println("We thank to you to using our services.");
                    System.out.println("Please come soon..");
                    System.out.println("Be Safe, Be Healthy..");
                    System.exit(0);
                }
                default :{
                    System.out.println("Please select appropriate option..");
                }
            }
            System.out.println("To Return main menu \n Press 1.\n To exit \n Press 0.");
            cmd = sc.nextInt();
        }
        System.out.println("We thank to you to using our services.");
        System.out.println("Please come soon..");
        System.out.println("Be Safe, Be Healthy..");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Please enter your pin.");
        int pin= sc.nextInt();
       
        BankApplication BA = new BankApplication(name, pin);
        BA.menu();
    }
    
}