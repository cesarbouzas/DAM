/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
import javax.xml.transform.stream.StreamSource;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author Usuario
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            //Creamos el Fichero , o comprobamos que ya existe
            File f =new File ("src/datos/Clase2.xml");
            createFile(f);
            DocumentBuilderFactory dBFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder dB=dBFactory.newDocumentBuilder();
            Document doc=dB.newDocument();
            Element root=doc.createElement("Clase");
            doc.appendChild(root);
            Element a1=createElement(doc, root, "alumno" ,null);
            Element a2=createElement(doc, root, "alumno",null);
            Element a3=createElement(doc, root,"alumno",null);
            Attr numero=doc.createAttribute("numero");
            Attr dni=doc.createAttribute("Dni");
            dni.setValue("34896415X");
            numero.setValue("393");
            a1.setAttributeNode(numero);
            a1.setAttributeNode(dni);
            createNormalData(doc, a1,"Cesar", "Bouzas", "trou", "10");
            //Elemnto 2
            numero=doc.createAttribute("numero");
            numero.setValue("493");
            a2.setAttributeNode(numero);
            createNormalData(doc, a2,"Javier", "Sopelana", "Transfer", "9.99");
            //Elemento 3
            numero=doc.createAttribute("numero");
            numero.setValue("593");
            a3.setAttributeNode(numero);
            createNormalData(doc, a3,"Jose Antonio", "Castrillon", "Josecho","9,98");
            createElement(doc,a3,"admitido",null);
            DOMSource dS=new DOMSource(doc);
            StreamResult sR=new StreamResult(f);
            
            TransformerFactory tFactroy=TransformerFactory.newInstance();
            Transformer t=tFactroy.newTransformer();
            t.transform(dS, sR);
            
            
        } catch (ParserConfigurationException ex) {
            System.out.println("Error de parseador");
        } catch (IOException ex) {
            System.out.println("error de File I/O");
        } catch (TransformerConfigurationException ex) {
            System.out.println("Error de trasnformer");
        } catch (TransformerException ex) {
            System.out.println("Error de transforme");
        }
    }
    public static Element createElement(Document doc,Element parent,String name,String text){
            Element e=doc.createElement(name);
            e.setTextContent(text);
            parent.appendChild(e);
            return e;
    }
    public static void createNormalData(Document doc,Element e, String name,String surname,String apodo,String score){
            createElement(doc,e, "Nombre", name);
            createElement(doc, e, "Apellidos", surname);
            createElement(doc,e, "Apodo", apodo);
            createElement(doc,e,"marcas",score);
    }
    
    
    public static void createFile(File f ) throws IOException{
        if(!f.exists()){
                if(f.getParentFile().exists()){
                        System.out.println(f.createNewFile()?"Fichero creado OK":"Fichero no creado!");
                        
                }else{
                    System.out.println(f.getParentFile().mkdir()?"Directorio Creado OK":"Directorio no creado!");
                    System.out.println(f.createNewFile()?"Fichero creado OK":"Fichero no creado!");
                }
        }else{
            System.out.println("El ficero ya existe!");
        }
    
    }
    
}
