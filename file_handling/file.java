import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {
    public void filereader(String filename ){
        try{
            FileReader read=new FileReader(filename);
            Scanner myReader=new Scanner(read);
            while(myReader.hasNextLine()){
                String data= myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}