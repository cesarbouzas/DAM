
package vista;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
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

/**
 *
 * @author Usuario
 */
public class Ejercicio21 {

   
    public static void main(String[] args) {
        try{
           File f=new File("src/datos/archivo.xml");
           if(!f.exists()){
               if(!f.getParentFile().exists()){
                   System.out.println((f.getParentFile().mkdir())?"directorio creado":"error de creacion de directorio");
                   System.out.println(f.createNewFile()?"fichero creado":"Error de creacion de fichero");
               }else{
                   System.out.println(f.createNewFile()?"fichero creado":"Error de creacion de fichero");
               }
           }
           
           
        DocumentBuilderFactory dBFactory =DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder=dBFactory.newDocumentBuilder();
        Document doc=dBuilder.newDocument();
        Element root=doc.createElement("root");
        doc.appendChild(root);
        Element e1=doc.createElement("Elemento1");
        
        Attr atributo1 =doc.createAttribute("id");
        atributo1.setTextContent("Valor del atributo");
        e1.setAttributeNode(atributo1);
        Element e2=doc.createElement("Elemento2");
        e2.setTextContent("contendio del elemento dos");
        root.appendChild(e1);
        root.appendChild(e2);
            TransformerFactory tFactory=TransformerFactory.newInstance();
            Transformer t=tFactory.newTransformer();
            DOMSource source=new DOMSource(doc);
            StreamResult result=new StreamResult(f);
            t.transform(source, result);
            StreamResult console=new StreamResult(System.out);
            t.transform(source, console);
            
        
        }catch(ParserConfigurationException ePCE){
            System.out.println("Error de parser");
        } catch (TransformerConfigurationException ex) {
            System.out.println("Error de transformer");
            
        } catch (IOException ex) {
            System.out.println("Error de fichero I/O");
        } catch (TransformerException ex) {
            System.out.println("Error de transformer");
        }
        }
    
}
