
package vista;


import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Semaforo {
    
    public final static int  LIBRE=0;
    public final static int CON_LECTORES=1;
    public final static int CON_ESCRITOR=2;
    private int estado;
    private int totalLectores;
    
    public Semaforo(){
     estado=Semaforo.LIBRE;
     totalLectores=0;
    }
    
    public synchronized void accesoLeer(){
    String nombre=Thread.currentThread().getName();
    if(estado==Semaforo.LIBRE){
        System.out.println("BD: "+estado+" "+totalLectores+"L"+ nombre +" entra a Leer");
        estado=Semaforo.CON_LECTORES;
    }else if( estado!=Semaforo.CON_LECTORES){
          while(estado==Semaforo.CON_ESCRITOR){
              try {
                  wait();
                  System.err.println("BD: "+estado+" "+totalLectores+"L"+ nombre +" trata de Leer ,espara");
              } catch (InterruptedException ex) {
                  JOptionPane.showMessageDialog(null,"error de espera de hilo lectura "+nombre);
              }
             }
          System.out.println("BD: "+estado+" "+totalLectores+"L"+ nombre +" entra a Leer");
            
            
    }else{
            System.out.println("BD: "+estado+" "+totalLectores+"L"+ nombre +" entra a Leer");
    }       
       totalLectores++;
        System.out.println("BD:"+estado+" "+ totalLectores+"L"+ nombre+" Leyendo ....");
    }
    
    public synchronized void accesoEscribir(){
            String nombre=Thread.currentThread().getName();
        if(estado==Semaforo.LIBRE){
            System.out.println("BD: "+estado+" "+totalLectores+"L"+ nombre +" entra a escribir");
            estado=Semaforo.CON_ESCRITOR;
        }else{
            while(estado!=Semaforo.LIBRE){
                try {
                    
                    wait();
                     System.err.println("BD: "+estado+" "+totalLectores+"L"+ nombre +" TRATA a escribir , espara");
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null,"error de espara en el hilo de escritura");
                }
             }
            System.out.println("BD: "+estado+" "+totalLectores+"L"+ nombre +" entra a escribir");
            estado=Semaforo.CON_ESCRITOR;
        }
        System.out.println("BD:"+estado+" "+ totalLectores+"L"+ nombre+" Escribiendo ....");
    }
    public synchronized void escrituraFinalizada(){
        estado=Semaforo.LIBRE;
        System.out.println(Thread.currentThread().getName()+":ya ha escrito ");
        notify();
    }
    public synchronized void lecturaFinalizada(){
         System.out.println(Thread.currentThread().getName()+":ya ha leido ");
        totalLectores--;
        if(totalLectores==0){
            estado=Semaforo.LIBRE;
            notify();
        }
        
    }
    
    }
            
    
    
    
    
    
    
    
    

