
package apartado3_dom;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class Apartado3_DOM {

    public static void main(String[] args) {
        
        try {
            File f= new File("src/datos/libros.xml");
            System.out.println(f.exists());
            DocumentBuilderFactory dBFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder dB=dBFactory.newDocumentBuilder();
            Document doc=dB.parse(f);
            doc.getDocumentElement().normalize();
            NodeList nList=doc.getElementsByTagName("libro");
            System.out.println("<Libros>");
            for(int i=0;i<nList.getLength();i++){
                Node n=nList.item(i);
                if(n.getNodeType()==Node.ELEMENT_NODE){
                    Element e=(Element) n;
                    System.out.println("<Libro año="+e.getAttribute("año")+">");                
                    System.out.println(" <titulo>"+e.getElementsByTagName("titulo").item(0).getTextContent()+"</titulo>");
                    NodeList autorDatos=e.getElementsByTagName("autor");
                    
                        for(int j=0;j<autorDatos.getLength();j++){
                            System.out.println(" <autor>");
                                Node a=autorDatos.item(j);
                               if(a.getNodeType()==Node.ELEMENT_NODE){
                                   Element e2=(Element)a;
                                   System.out.println(" <apellido>"+e2.getElementsByTagName("apellido").item(0).getTextContent()+"</apellido>");
                                   System.out.println(" <nombre>"+e2.getElementsByTagName("nombre").item(0).getTextContent()+"</nombre>");
                               }
                               System.out.println(" </autor>");
                        }
                    
                    System.out.println(" <editorial>"+e.getElementsByTagName("editorial").item(0).getTextContent()+"</editorial>");
                    System.out.println(" <precio>"+e.getElementsByTagName("precio").item(0).getTextContent()+"€</precio>");
                }
            }
            System.out.println("</libros>");
        } catch (ParserConfigurationException ex) {
            System.out.println("Error de Parseador ");
        } catch (SAXException ex) {
            System.out.println("Error de SAX");
        } catch (IOException ex) {
            System.out.println("Error de Entrada Salida I/O");
        }
               
    }
    
}
