package pkg5_1_ejecucion_hilos_thread_runnable;

/**
 *
 * @author Usuario
 */
public class ExtendsThread extends Thread{
        
    public ExtendsThread(String nombre) {
        super(nombre);
    }
    public ExtendsThread(){
        super("hilo tipo thread");
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("Esta es la clase extiende a thread con nombre"+getName());
    }}
}
