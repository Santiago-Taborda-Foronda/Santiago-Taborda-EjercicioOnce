package once;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		ArrayList<String> listaNombres=new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			listaNombres.add(JOptionPane.showInputDialog("Ingrese el nombre en la pos:"+i));
		}
		
		System.out.println(listaNombres);
		System.err.println();
		
		
		for (int i = 0; i < listaNombres.size(); i++) {
			System.out.println("Pos "+i+"="+listaNombres.get(i));
		}
		
/*		
		listaNombres.add("Cristian");
		listaNombres.add("Maria");
		listaNombres.add("Juan");
		listaNombres.add("Pepe");
		listaNombres.add("Camila");
		
		System.out.println("Carlos");
		
		listaNombres.add("Carlos");
		
		System.out.println(listaNombres);
		
		listaNombres.add(2, "Pedro");
		
		System.out.println(listaNombres);
		
		String nombre= listaNombres.get(2);
		System.out.println();*/
	}

}
