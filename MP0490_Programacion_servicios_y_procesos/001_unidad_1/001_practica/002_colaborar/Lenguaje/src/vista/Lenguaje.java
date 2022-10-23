
package vista;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/**
 *
 * @author Cesar bouzas
 */
public class Lenguaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        String title="******************PROCESO DE "+n+" PALABRAS***********************";
        System.out.println(title);
        File f = createFile(args[1]);
        writeRAF(f,title,n);     
        }
    
    public static File createFile(String r){
        File f = new File(r);
        String sOname = System.getProperty("os.name").toLowerCase();
        
        if (sOname.contains("win")) {  
            if (!r.isEmpty()) {
                f = new File(r.toLowerCase().replace("//", "\\"));
            } else {
                f = new File("c:\\FicheroDeLenguaje.txt");
            }
        }
        if(!f.exists()){
            try{
                f.createNewFile();
                System.out.println("Fichero creado  :"+f.getCanonicalPath());
            }catch(IOException ieo){
                System.out.println("Error de entrada salida createFile 1");
            }
            
        }else{
            try{
            System.out.println("El fichero"+f.getCanonicalPath()+" ya existe. ");
            }catch(IOException e){
                System.out.println("Error de entrada salida createFile 2");   
            }
        }
    return f;
    }
    public static String createWord(){
        int n = 1 + (int) (Math.random() * 8);
        String word = "";
        for (int i = 0; i < n; i++) {
            word += (ramdomChar());
        }
        return word;
    }

    public static void writeRAF (File f,String title ,int n)  {
        FileLock bloqueo=null;
        String s;
        
        try (
            RandomAccessFile rAF = new RandomAccessFile(f, "rwd");
           
            ) 
            {
                
            bloqueo = rAF.getChannel().lock();
            rAF.seek(f.length()); 
            rAF.writeChars(title+"\n");
            for (int i = 0; i < n; i++) {
                s ="Proceso(" + (i + 1) + "/" + n + ") palabras --->" +createWord();
                rAF.writeBytes(s +"\n");
                System.out.println(s);
            }
            bloqueo.release();
            bloqueo = null;
        } catch (IOException e) {
            System.out.println("Error de entrada/salida(writeRAF)");
            e.printStackTrace();
        } finally {
        }

    }

    public static char ramdomChar(){
        int ramdomInt=(int)(97+Math.random()*(122-97));
        //System.out.println(ramdomInt+" ----> "+(char)(ramdomInt));
        return (char)ramdomInt;
    }
    
    //    public static void writeFile(File f,String s){
//        try (
//                 FileWriter fW = new FileWriter(f, true);
//                 BufferedWriter bW = new BufferedWriter(fW);) {
//            bW.write(s + "\n");
//        } catch (FileNotFoundException eFNFE) {
//            System.err.println("Fichero no encontrado");
//            eFNFE.printStackTrace();
//        } catch (IOException eIOE) {
//            System.err.println("Eror de entrada/salida");
//            eIOE.printStackTrace();
//
//        } finally {
//        }
//
//    }
    
    
    
    
}
