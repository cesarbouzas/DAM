package apartado3_sax;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;





/**
 *
 * @author Usuario
 */
public class Apartado3_Sax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        
        try {
            SAXParserFactory saxPF =SAXParserFactory.newInstance();
            SAXParser saxP=saxPF.newSAXParser();
            InputStream fileXML=new FileInputStream("src/datos/libros.xml");
            GestorContenido gestor=new GestorContenido();
            saxP.parse(fileXML, gestor);
        } catch (ParserConfigurationException ex) {
            System.out.println("Error de Parser");
        }catch(IOException e){
            System.out.println("Error de Fichero");
        } catch (SAXException ex) {
            System.out.println("Sax exception");
        }  
    }  
    
}



class GestorContenido extends DefaultHandler{

    String cadena="";
    
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
       String caracteres=new String(ch, start, length);
       caracteres=caracteres.replace("[\t\n]","");
       cadena=caracteres.trim();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
       
        if(qName.equalsIgnoreCase("precio"))
            System.out.println(cadena.trim());
            cadena="";
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        
        
        if(qName.equalsIgnoreCase("libro")){
                cadena+=qName + " : ";
       }
       if(qName.equalsIgnoreCase("titulo")){
                cadena+="titulo :"+ qName ;
        }
        if(qName.equalsIgnoreCase("editorial")){
                cadena+="editorial :"+attributes.getValue(attributes.getQName(0));
        }
        if(qName.equalsIgnoreCase("precio")){
                cadena+="Precio :"+ attributes.getValue(attributes.getQName(0));
        }
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Final de XML");
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Principio XML");
    }




}