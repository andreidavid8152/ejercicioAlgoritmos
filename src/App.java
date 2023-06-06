import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JPanel aPanel;
    private JTextField textField1;
    private JButton ingresarDatosButton;
    private JButton insertSortButton;
    private JButton bubbleSortButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    Algoritmo a = new Algoritmo();

    public App() {
        setContentPane(aPanel);
        ingresarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ingresarDatos();
            }
        });
        insertSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertSort();
            }
        });
        bubbleSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bubbleSort();
            }
        });
    }

    public void ingresarDatos() {
        a.crearArreglo(Integer.parseInt(textField1.getText()));
        textArea3.setText(a.toString());
    }

    public void insertSort() {
        long startTime = System.nanoTime();
        int[] arr = a.insertionSort();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        textArea1.setText("La duracion de este algoritmo es de: " + duration + "s\n" + imprimirArreglo(arr));
    }

    public void bubbleSort() {
        long startTime = System.nanoTime();
        int[] arr = a.bubbleSort();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        textArea2.setText("La duracion de este algoritmo es de: " + duration + "s\n" + imprimirArreglo(arr));
    }

    public String imprimirArreglo(int[] arreglo) {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < arreglo.length; i++) {
            sb.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                sb.append(", \n");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }
}
