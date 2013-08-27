
import javax.swing.JOptionPane;

public class Algoritmo {

public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "La suma es: " + Integer.toBinaryString( Integer.parseInt (JOptionPane.showInputDialog("Ingrese un número binario: "), 2) + Integer.parseInt (JOptionPane.showInputDialog("Ingrese otro número binario: "), 2)));
}

}