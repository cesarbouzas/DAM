
package pkg01_productor_consumidor_buffer;


public class Main {


    
    public static void main(String[] args) {
        Buffer b=new Buffer(10);
        Producer producer=new Producer(b);
        Consumer consumer=new Consumer(b);
        producer.start();
        consumer.start();
    }
    
}
