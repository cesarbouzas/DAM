/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01_productor_consumidor_buffer;

/**
 *
 * @author Cesar bouzas soto
 */
public class Buffer {

    private char buffer[];
    private int next;
    private boolean isFull;
    private boolean isEmpy;

    public Buffer(int size) {
        buffer = new char[size];
        next = 0;
        isFull = false;
        isEmpy = true;
    }

    public synchronized char cosume() {
        while (isEmpy) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        next--;
        if (next == 0) {
            isEmpy = true;
        }
        isFull = false;
        notifyAll();
        return (buffer[next]);
    }

    public synchronized void produce(char c) {
        while (isFull) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        buffer[next] = c;
        next++;
        isEmpy = false;
        if (next == this.buffer.length) {
            isFull = true;
        }
        isEmpy = false;
        notifyAll();
    }
}
