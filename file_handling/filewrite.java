import java.io.FileWriter;
import java.io.IOException;

public class filewrite {

    public void filewriter(String filename , String data){
        try(FileWriter writer=new FileWriter(filename)){
            writer.write(data);
            writer.close();
            System.out.println("Data written successfully "+ filename);
        }
        catch(IOException e){
            System.out.println("Error to write "+ e.getMessage());
            e.printStackTrace();
        }
    }
}