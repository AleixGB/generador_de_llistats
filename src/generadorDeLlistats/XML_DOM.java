package generadorDeLlistats;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/*
 * @author Aleix i Jordi
 */
public class XML_DOM {

    private static List llistaMateries;
    private static AlumnesMap alumnesMap;
    private static boolean creat;
    private static String nomFitxer;

    public XML_DOM(List llistaMateries, AlumnesMap alumnesMap, String nomFitxer) {
        this.llistaMateries = llistaMateries;
        this.alumnesMap = alumnesMap;
        creat = false;
        this.nomFitxer = nomFitxer;
    }

    public void crearXML() {
        Document doc;
        try {
            doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element rootElement = doc.createElement("llistes");
            doc.appendChild(rootElement);

            for (Object materia : llistaMateries) {
                Element alumnesMateria = doc.createElement("llista");
                alumnesMateria.setAttribute("materia", materia.toString());
                rootElement.appendChild(alumnesMateria);

                Iterator<Map.Entry<String, Alumne>> llistatAlumnes = alumnesMap.obtenirAlumnes(materia.toString()).entrySet().iterator();
                Map.Entry<String, Alumne> dades;
                while (llistatAlumnes.hasNext()) {
                    dades = llistatAlumnes.next();
                    alumnesMateria.appendChild(inserir(doc, dades));
                }
            }
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.transform(new DOMSource(doc), new StreamResult(new File(nomFitxer)));
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XML_DOM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(XML_DOM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(XML_DOM.class.getName()).log(Level.SEVERE, null, ex);
        }
        creat = true;
    }

    public Element inserir(Document doc, Map.Entry<String, Alumne> dades) {
        Element alumne = doc.createElement("alumne");
        Alumne alumneDades = dades.getValue();

        Element e = doc.createElement("cognomsNom");
        e.appendChild(doc.createTextNode(alumneDades.getCognoms() + "," + alumneDades.getNom()));
        alumne.appendChild(e);

        e = doc.createElement("grup");
        e.appendChild(doc.createTextNode(alumneDades.getGrup()));
        alumne.appendChild(e);

        return alumne;
    }

    public boolean getCreat(){
        return creat;
    }
}
