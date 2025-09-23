public class WorkerThread extends Thread {
    int rows;
    int columns;
     int [][] A,B,C;
     WorkerThread(int row,int column,int[][] A,int[][] B,int[][] C){
         this.rows=row;
         this.columns=column;
         this.A=A;
         this.B=B;
         this.C=C;
     }

    public void run(){
        try{
            C[rows][columns]=A[rows][0]*B[0][columns]+A[rows][1]*B[1][columns];
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
    }
}
