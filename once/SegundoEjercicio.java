package once;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class SegundoEjercicio {
	 public static void main(String[] args) {	       
	        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();        
	    
	        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números desea ingresar?"));	        
	     
	        for (int i = 0; i < cantidad; i++) {
	            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número en la posición " + i));
	            listaNumeros.add(numero);
	        }
	        	        
	        System.out.println("Números ingresados:");
	        for (int i = 0; i < listaNumeros.size(); i++) {
	            System.out.println("Pos " + i + " = " + listaNumeros.get(i));
	        }
	    }
	}

