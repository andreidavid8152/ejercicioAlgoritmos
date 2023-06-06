import java.util.Random;

public class Algoritmo {

    private int[] arreglo;

    public Algoritmo() {

    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void crearArreglo(int n) {
        Random rand = new Random();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(1000);
        }

        arreglo = array;
    }

    public int[] insertionSort() {
        int[] arr = arreglo.clone();
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int clave = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > clave) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = clave;
        }
        return arr;
    }

    public int[] bubbleSort() {
        int[] arr = arreglo.clone();
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arreglo.length; i++) {
            sb.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                sb.append(", \n");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
