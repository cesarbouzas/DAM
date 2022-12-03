
package pkg01_productor_consumidor_buffer;
public class Producer extends Thread {
    private Buffer buffer;
    private final String letters="abcdefghikklmnopqrstuvxyz";
    
    public Producer(Buffer buffer){
    this.buffer=buffer;
    }
    public void run(){
    while(true){
        char c=letters.charAt((int)(Math.random()*letters.length()));
        buffer.produce(c);
        System.out.println("Producido el caracter "+Character.toString(c).toUpperCase()  +" del buffer");
        try{
            sleep((int)(Math.random()*4000));
            
        }catch(InterruptedException e){
        
        }
       }
     }
    }
    
    
    

