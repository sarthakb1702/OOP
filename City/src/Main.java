//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        City[] arr;
        int size = 5;
        //Allocating memory for 5 objects
        arr = new City[size];

        //Creating actual city obs
        for (int i = 0; i < size; i++){
            arr[i] = new City();
            arr[i].accept();
        }

        //Assigning data to city objects;


        //displaying the data
        System.out.println("SR.NO  " + " Name  " + " Population  ");
        for(int i=0; i<size; i++){
            System.out.print(i+1);
            arr[i].display();
        }
    }
}