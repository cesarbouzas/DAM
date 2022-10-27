package ordenarnumero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Cesar bouzas
 */
public class OrdenarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }
        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i != (numbers.size() - 1)) {
                System.out.print(numbers.get(i) + ",");
            }
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i) + "]");
            }

        }
    }
}
    

