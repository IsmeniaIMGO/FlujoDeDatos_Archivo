package Archivo.test;

import java.io.File;

import javax.swing.JOptionPane;

public class CrearCarpeta {
	//crear el lugar donde vamos a guardar la carpeta y de ultimo el nombre EJ: "C:/ruta/nombreCarpeta"
	static File carpeta1 = new File ("C:/Users/marce/OneDrive/Documents/MARCELA/Ing. Sistemas/5to Semestre/programacion 3/Archivo/info/Mujeres");
	static File carpeta2 = new File ("C:/Users/marce/OneDrive/Documents/MARCELA/Ing. Sistemas/5to Semestre/programacion 3/Archivo/info/Hombres");
	static File carpeta3 = new File ("C:/Users/marce/OneDrive/Documents/MARCELA/Ing. Sistemas/5to Semestre/programacion 3/Archivo/info/Animaless");

	/**
	 * crear carpetas y mostrar su contenido
	 * @param args
	 */
	public static void main(String[] args) {
			
		//verificar que no haya una carpeta igual, si no lo hay entonces creamos la carpeta1
		if (!carpeta1.exists()) {
			if (carpeta1.mkdirs()) {	
			}else {
				System.out.println("Error al crear directorio");
			}
		}
		//verificar que no haya una carpeta igual, si no lo hay entonces creamos la carpeta1
		if (!carpeta2.exists()) {
			if (carpeta2.mkdirs()) {	
			}else {
				System.out.println("Error al crear directorio");
			}
		}
		
		//verificar que no haya una carpeta igual, si no lo hay entonces creamos la carpeta1
		if (!carpeta3.exists()) {
			if (carpeta3.mkdirs()) {	
			}else {
				System.out.println("Error al crear directorio");
			}
		}
		//llamamos al menu de opciones
		menu();
	}
	
	/**
	 * mostrar opciones de que carpeta quiere imprimir
	 */
	private static void menu() {
		//escribimos las opciones
		 int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que carpeta quiere imprimir?\n" 
                 + "1. "+ carpeta1.getName()+"\n"
                 + "2. "+ carpeta2.getName()+"\n"
                 + "3. "+ carpeta3.getName()+"\n"));
		 //segun la opcion elegida se ejecuta el metodo correspondiente
		 switch (opcion) {
		case 1:
			mostrarContenidoM(0);
			break;
		case 2:
			mostrarContenidoH(0);
			break;
		case 3:
			mostrarContenidoA(0);
			break;
		default:
			break;
		}
	}

	/**
	 * mostrar el contenido de la carpeta de Mujeres
	 * @param i
	 */
	private static void mostrarContenidoM(int i){	
		//almacenamos los archivos de la carpeta en un arreglo
		File[] lista = carpeta1.listFiles();
		
		//caso base en caso de que no hayan archivos en la carpeta
		if (lista.length == i) {
			return;
		}
		else {//caso recursivo recorrer el arreglo e imprimir el nombre de cada archivo
			System.out.println(lista[i].getName());
			mostrarContenidoM(i+1);
		}
	}
	
	/** 
	 * mostrar el contenido de la carpeta de hombres
	 * @param i
	 */
	private static void mostrarContenidoH(int i){	
		//almacenamos los archivos de la carpeta en un arreglo
		File[] lista = carpeta2.listFiles();
		
		//caso base en caso de que no hayan archivos en la carpeta
		if (lista.length == i) {
			return;
		}
		else {//caso recursivo recorrer el arreglo e imprimir el nombre de cada archivo
			System.out.println(lista[i].getName());
			mostrarContenidoH(i+1);
		}
	}
	/**
	 * mostrar el contenido de la carpeta de animales
	 * @param i
	 */
	private static void mostrarContenidoA(int i){	
		//almacenamos los archivos de la carpeta en un arreglo
		File[] lista = carpeta3.listFiles();
		
		//caso base en caso de que no hayan archivos en la carpeta
		if (lista.length == i) {
			return;
		}
		else {//caso recursivo recorrer el arreglo e imprimir el nombre de cada archivo
			System.out.println(lista[i].getName());
			mostrarContenidoA(i+1);
		}
	}
	
}
