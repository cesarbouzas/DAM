
package vista;


import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author Usuario
 */
public class Ejercicio_18_leer_xml {

   
    public static void main(String[] args) {
     
        //La clase Abstracta DocumentBuilder se crea con la intencion de instanciar estructuras DOM a partir de un docuemnto XML
        //Como no se pude instancia se utiiza la calse DocumentBuiderFactory
        DocumentBuilderFactory dBFactory=DocumentBuilderFactory.newInstance() ;
        DocumentBuilder dB ;
        File f=new File("src/datos/Clase.xml");
        if(f.exists()){
        
        try {
            dB = dBFactory.newDocumentBuilder();         
            Document doc=dB.parse(f);
            doc.getDocumentElement().normalize();
            
            NodeList nList=doc.getElementsByTagName("alumno");
            
                 System.out.println("----------------------------");
            for(int i=0;i<nList.getLength();i++){
                Node node=nList.item(i);
               
                if(node.getNodeType()==Node.ELEMENT_NODE){
                Element e=(Element)node;
                    System.out.println("Número de Alumno :"+e.getAttribute("numero"));
                    System.out.println("----------------------------");
                    System.out.println("Nombre:"+e.getElementsByTagName("nombre").item(0).getTextContent());
                    System.out.println("Apellido"+e.getElementsByTagName("apellido").item(0).getTextContent());
                    System.out.println("Apodo"+e.getElementsByTagName("apodo").item(0).getTextContent());
                    System.out.println("Marcas"+e.getElementsByTagName("marcas").item(0).getTextContent());
                    System.out.println("----------------------------");
                }
            }
        } catch (ParserConfigurationException ex) {
            System.out.println("Error de Parser");
        }catch(IOException iOE ){
            System.out.println("Error de Entrada Salida");
        }catch(Exception e){
            System.out.println("Error general");
        }
        }else{
            System.out.println("Error de ruta de fichero");
        }
    
        
        
      
        
        
        
        
        
        
        
        
    }
    
}
