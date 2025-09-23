import java.util.Scanner;
public class Main {
    static WorkerThread[][] Threads;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows and columns you want:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix_1= new int[rows][columns];
        int[][] matrix_2= new int[rows][columns];
        int[][] result= new int[rows][columns];


        System.out.println("Please enter the elements you want in the matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix_1[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix_1[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Please enter the elements you want in the matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix_2[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix_2[i][j] + " ");
            }
            System.out.println();
        }

        Threads = new WorkerThread [rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Threads[i][j]=new WorkerThread(i,j,matrix_1,matrix_2,result);
                Threads[i][j].start();
            }
        }
        try{
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    Threads[i][j].join();
                }
            }
        }catch(InterruptedException e){
            System.out.println("Child Interrupted");
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
    }
