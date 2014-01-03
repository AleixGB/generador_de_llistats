package generadorDeLlistats;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSV {

    private final String nomFitxer;
    private final AlumnesMap alumnesMap;

    public CSV(File fitxer, AlumnesMap alumnesMap) {
        nomFitxer = fitxer.getAbsolutePath();
        this.alumnesMap = alumnesMap;
    }

    public void llegir() {
        BufferedReader buffer;
        String line = "";
        int i = 0;
        try {
            buffer = new BufferedReader(new InputStreamReader(new FileInputStream(nomFitxer), Charset.forName("ISO-8859-15")));
            while ((line = buffer.readLine()) != null && !(line.equals(""))) {
                if (i != 0) {
                    line = line.replaceAll("\"", "");
                    String[] alumne = line.split(",");
                    for (byte j = 4; j < alumne.length; j++) {
                        alumnesMap.inserir("" + alumne[j], "" + alumne[2], "" + alumne[1], "" + alumne[3]);
                    }
                } else {
                    i++;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}