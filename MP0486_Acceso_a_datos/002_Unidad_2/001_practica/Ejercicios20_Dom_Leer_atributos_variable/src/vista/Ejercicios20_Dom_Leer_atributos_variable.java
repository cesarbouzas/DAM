
package vista;


import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Usuario
 */
public class Ejercicios20_Dom_Leer_atributos_variable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        try {
            File f=new File("src/datos/Clase2.xml");
            DocumentBuilderFactory dBFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder dB=dBFactory.newDocumentBuilder();
            Document doc=dB.parse(f);
            doc.normalize();
            
            System.out.println("El root :"+doc.getDocumentElement().getNodeName());
            
            NodeList nodos=doc.getElementsByTagName("alumno");
            for(int i=0;i<nodos.getLength();i++){
                Node nodo=nodos.item(i);
                Element e=(Element)nodo;
                System.out.print("<"+e.getNodeName());
                for (int j=0;j<e.getAttributes().getLength();j++){
                    System.out.print(" "+e.getAttributes().item(j).getNodeName()+" : "+e.getAttributes().item(j).getNodeValue()); 
           
                 }
                System.out.println(">");
                System.out.println("<nombre>"+ e.getElementsByTagName("nombre").item(0).getTextContent()+"</nombre>");
                System.out.println("<apellido>"+e.getElementsByTagName("apellido").item(0).getTextContent()+"</apellido>");
                System.out.println("<apodo>"+e.getElementsByTagName("apodo").item(0).getTextContent()+"<a/podo>");
                System.out.println("<marcas>"+e.getElementsByTagName("marcas").item(0).getTextContent()+"</marcas");
                if(e.getElementsByTagName("admitido").getLength()>0){
                    System.out.println("<admitido>"+e.getElementsByTagName("admitido").item(0).getTextContent()+"</admitido>");  
                }
            }
               
            
            
        } catch (ParserConfigurationException ex) {
            System.out.println("Error de Parser");
        } catch (SAXException ex) {
            System.out.println("Error SAX");
        } catch (IOException ex) {
            System.out.println("File error I/O");
        }
        
        
        
        
    }
    
}
