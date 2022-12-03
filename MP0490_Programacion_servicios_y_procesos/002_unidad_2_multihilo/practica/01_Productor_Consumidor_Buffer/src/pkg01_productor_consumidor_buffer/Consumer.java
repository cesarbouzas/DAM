package pkg01_productor_consumidor_buffer;

public class Consumer extends Thread {

    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            char value = buffer.cosume();
            System.out.println("Consumido el caracter " + value + " del buffer");
            try {
                sleep((int) (Math.random() * 4000));
            } catch (InterruptedException e) {
            }
        }
    }
}
