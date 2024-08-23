package once;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class TercerEjercicio {
	public static void main(String[] args) {
     
        ArrayList<String> listaNombres = new ArrayList<String>();       
        
        for (int i = 0; i < 5; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre en la posición " + i);
            listaNombres.add(nombre);
        }       
       
        System.out.println("Nombres ingresados:");
        for (int i = 0; i < listaNombres.size(); i++) {
            System.out.println("Pos " + i + " = " + listaNombres.get(i));
        }       
       
        String nombreAEliminar = JOptionPane.showInputDialog("Ingrese el nombre que desea eliminar:");
        if (listaNombres.remove(nombreAEliminar)) {
            System.out.println("Nombre '" + nombreAEliminar + "' eliminado.");
        } else {
            System.out.println("Nombre '" + nombreAEliminar + "' no encontrado.");
        }
         
        System.out.println("Lista de nombres actualizada:");
        for (int i = 0; i < listaNombres.size(); i++) {
            System.out.println("Pos " + i + " = " + listaNombres.get(i));
        }
    }
}

