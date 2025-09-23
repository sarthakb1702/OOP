public class Main {
    public static void main(String[] args){
        try{
            Throwdemo.demoproc();
        }catch (NullPointerException e){
            System.out.println("Recaught");
        }
    }
}

