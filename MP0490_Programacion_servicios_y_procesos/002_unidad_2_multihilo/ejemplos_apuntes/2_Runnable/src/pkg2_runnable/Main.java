
package pkg2_runnable;
public class Main implements Runnable{

      @Override
    public void run() {
          System.out.println("Saludos desde el hilo runnable");
    }
    public static  void obtenerEstado(Thread hilo){
    System.out.println("Estado del hilo :"+hilo.getState().name());
    }
    
    
    public static void main(String[] args) {
        Main hiloRunabble=new Main();
        Thread hilo1=new Thread(hiloRunabble);
        obtenerEstado(hilo1);
        hilo1.start();
        obtenerEstado(hilo1);
    }

  
}
