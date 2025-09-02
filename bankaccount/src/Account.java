import java.util.Scanner;

public class Account {
    private String name;
    private int acc_no;
    private double balance;
    public Account(){
        this.name = null;
        this.acc_no = 0;
        this.balance = 1000;
    }
    public void display(){
        System.out.println(acc_no+"\t"+name+"\t"+balance);
    }

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Account number: ");
        acc_no = sc.nextInt();

        System.out.println("Balance: ");
        balance += sc.nextDouble();
    }

    public int search(int target_acc,int n,Account[] accounts ){
        for(int i = 0;i<n;i++){
            if(target_acc == acc_no){
                return i;
            }
        }
        return -1;
    }

    public void deposit(double amount){
        balance += amount;
    }

}