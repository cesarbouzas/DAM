/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
import org.xml.sax.SAXException;

/**
 *
 * @author Usuario
 */
public class Ejercicio19_Leer_fichero_mostrar_en_horizontal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DocumentBuilderFactory dBFactory=DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        File f=new File("src/datos/Clase.xml");
        
        try {
            dBuilder=dBFactory.newDocumentBuilder();
            Document doc=dBuilder.parse(f);
            doc.getDocumentElement().normalize();
            NodeList nodos=doc.getElementsByTagName("alumno");
            for(int i=0;i<nodos.getLength();i++){
             Node nodo=nodos.item(i);
                if(nodo.getNodeType()==Node.ELEMENT_NODE){
                    Element e=(Element)nodo;
                    System.out.print("número :"+ e.getAttribute("numero")+"             ");
                }
            }
            System.out.println("\n");
             for(int i=0;i<nodos.getLength();i++){
             Node nodo=nodos.item(i);
                if(nodo.getNodeType()==Node.ELEMENT_NODE){
                    Element e=(Element)nodo;
                    System.out.print("nombre :"+ e.getElementsByTagName("nombre").item(0).getTextContent()+"         ");
                }
            }
              System.out.println("\n");
             for(int i=0;i<nodos.getLength();i++){
             Node nodo=nodos.item(i);
                if(nodo.getNodeType()==Node.ELEMENT_NODE){
                    Element e=(Element)nodo;
                    System.out.print("Apellido :"+ e.getElementsByTagName("apellido").item(0).getTextContent()+"        ");
                }
            }
              System.out.println("\n");
             for(int i=0;i<nodos.getLength();i++){
             Node nodo=nodos.item(i);
                if(nodo.getNodeType()==Node.ELEMENT_NODE){
                    Element e=(Element)nodo;
                    System.out.print("Apodo :"+ e.getElementsByTagName("apodo").item(0).getTextContent()+"              ");
                }
            }
              System.out.println("\n");
             for(int i=0;i<nodos.getLength();i++){
             Node nodo=nodos.item(i);
                if(nodo.getNodeType()==Node.ELEMENT_NODE){
                    Element e=(Element)nodo;
                    System.out.print("marca :"+ e.getElementsByTagName("marcas").item(0).getTextContent()+"              ");
                }
            }
            
            
            
            
            
            
            
            
        } catch (ParserConfigurationException ex) {
            System.out.println("error de Parser");
        } catch (SAXException ex) {
            System.out.println("error de Sax");
        } catch (IOException ex) {
            System.out.println("Error de entrada Salida");
        }
        
        
        
        
        
        
        
    }
    
}
