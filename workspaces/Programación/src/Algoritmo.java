
import javax.swing.JOptionPane;

public class Algoritmo {

public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "La suma es: " + Integer.toBinaryString( Integer.parseInt (JOptionPane.showInputDialog("Ingrese un n�mero binario: "), 2) + Integer.parseInt (JOptionPane.showInputDialog("Ingrese otro n�mero binario: "), 2)));
}

}