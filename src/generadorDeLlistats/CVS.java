package generadorDeLlistats;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CVS {
    
    //CVS obj = new CVS();
    //obj.run();
    
    public void run() {

        String csvFile = "./src/arxiu.csv"; // cuidado amb el nom
        BufferedReader buffer = null;
        String line = "";
        String cvsSplit = ",";

        try {

            buffer = new BufferedReader(new FileReader(csvFile));
            while ((line = buffer.readLine()) != null) {
                String[] csv = line.split(cvsSplit);
                System.out.println("Alumne = Nom: " + csv[1] + csv[2]);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Ok");
    }
    
}
