import java.security.PublicKey;
import java.util.Scanner;

public class MiVector {
    private int[] v;
    private int tam = 0;

    //Practica 1:
    public MiVector() {
        tam = 0;
    }

    public MiVector(int tA) {
        setTam(tA);
        v = new int[tam];
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public MiVector(int[] x) {
        this.v = new int[tam];
        this.v = x;
    }


    /* public MiVector(int t) {
         v = new int[t];
     }
 */
    public boolean vacio() {
        if (tam == 0) {
            return true;
        }
        return false;
    }

    public void teclado() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < tam; i++) {
            System.out.println("Por favor, introduzca el valor");
            v[i] = scan.nextInt();

        }

    }
    //ejercicio 2
    public void añadir (int añade){
        int[] aux  = new int [this.tam];
        for (int i=0; i > this.tam; i++) {
            aux [i] = this.v[i];
                    }
        this.tam ++;

        //dd
    }

    public void muestraContenido() {
        for (int i = 0; i < tam; i++) {
            System.out.println("introduzca el valor de la array" + v[i]);

        }

    }

    public int muestraTamaño() {
        return tam;
    }

    public void vaciarArray() {
        v = new int[0];
    }
}



