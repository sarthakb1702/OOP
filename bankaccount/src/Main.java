import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of acc:");
        int n = scanner.nextInt();
        Account[] accounts = new Account[n];
        Account acc = new Account();
        int choice;
        do {
            System.out.println("Enter which operation to be performed:\n1.Add accounts\n2.Remove an account\n3. Deposit money\n4. Withdraw money\n5. Display all account details\n6. Add an account\n7.. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        accounts[i] = new Account();
                        accounts[i].accept();
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Enter your Account number:");
                    int target_acc = scanner.nextInt();
                    System.out.print("Enter amount: ");
                    int amount = scanner.nextInt();
                    int result = acc.search(target_acc,n,accounts);
                    if(result!=-1){
                        accounts[result].deposit(amount);
                    }
                    else {
                        System.out.println("Acc does not exists");
                    }

                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Acc no.\tName\tBalance");
                    for (int i = 0; i < n; i++) {
                        accounts[i].display();
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (choice!=7);



    }
}

