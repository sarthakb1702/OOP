import java.util.Scanner;

public class City {
    private long population;
    private String name;

    //Method to set the data in City objects
//    public void setData(long population, String name){
//        this.population = population;
//        this.name = name;
//    }
    //Method to accept City details
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the city: ");
        name = sc.nextLine();
        System.out.println("Enter the population of the city: ai");
        population = sc.nextLong();
    }

    //Method to display City details
    void display(){
        System.out.print("       "+ name + "   " + population);
        System.out.println();

    }
}
