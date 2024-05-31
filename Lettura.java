import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class XMLCreator {
    public static void main(String[] args) {
        try {
            // Creare una fabbrica di costruttori di documenti
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            // Creare un costruttore di documenti
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            // Definire un nuovo documento
            Document document = documentBuilder.newDocument();

            // Creare l'elemento radice
            Element root = document.createElement("company");
            document.appendChild(root);

            // Creare un elemento figlio
            Element employee = document.createElement("employee");

            root.appendChild(employee);

            // Aggiungere un attributo all'elemento employee
            employee.setAttribute("id", "1");

            // Creare e aggiungere i sotto-elementi a employee
            Element firstName = document.createElement("firstname");
            firstName.appendChild(document.createTextNode("John"));
            employee.appendChild(firstName);

            Element lastName = document.createElement("lastname");
            lastName.appendChild(document.createTextNode("Doe"));
            employee.appendChild(lastName);

            Element email = document.createElement("email");
            email.appendChild(document.createTextNode("john.doe@example.com"));
            employee.appendChild(email);

            // Creare l'istanza di TransformerFactory
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            // Creare il file XML
            StreamResult streamResult = new StreamResult(new File("employees.xml"));

            // Trasformare il DOM in un file XML
            transformer.transform(domSource, streamResult);

            System.out.println("File XML creato con successo!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}
