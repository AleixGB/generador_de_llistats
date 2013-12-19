package xml_dom;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/*
 * @author Aleix
 */
public class XML_DOM {

    public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException, TransformerException {

        //public static void generaXML() {
        try {
            Document doc = (Document) DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element rootElement = doc.createElement("llistes");
            doc.appendChild(rootElement);

            String materia = "Programació";
            String cogsNom = "Guix Buxeda, Aleix";
            String grup = "2DAM";
            rootElement.appendChild(crearLlista(doc, materia, cogsNom, grup));

            materia = "Threads";
            cogsNom = "Reixach Cargol, Jordi";
            grup = "2DAM";
            rootElement.appendChild(crearLlista(doc, materia, cogsNom, grup));

            materia = "Threads";
            cogsNom = "Guix Buxeda, Aleix";
            grup = "2DAM";
            rootElement.appendChild(crearLlista(doc, materia, cogsNom, grup));

            TransformerFactory transformerFactory = TransformerFactory
                    .newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("llista_alumnes.xml"));

            transformer.transform(source, result);

            System.out.println("Arxiu enregistrat!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        }
    }
//}

    static private Element crearLlista(Document doc, String materia, String cogsNom, String grup) {

        Element list = doc.createElement("llista"); // atribut(s) per llista
        Attr attr = doc.createAttribute("materia"); // Manera llarga d'afegir un atribut
        attr.setValue(materia);
        list.setAttributeNode(attr);
        
        Element alumn = doc.createElement("alumne");
        list.appendChild(alumn);

        Element e = doc.createElement("cognomsNom"); // Nom
        e.appendChild(doc.createTextNode(cogsNom));
        alumn.appendChild(e);

        e = doc.createElement("grup"); // Grup
        e.appendChild(doc.createTextNode(grup));
        alumn.appendChild(e);

        return list;
    }
}
