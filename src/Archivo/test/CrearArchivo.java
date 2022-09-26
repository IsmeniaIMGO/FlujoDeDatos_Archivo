package Archivo.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CrearArchivo {

	//creamos el lugar donde vamos a guardar el archivo con su nombre
	static String ruta = "C:/Users/marce/OneDrive/Documents/MARCELA/Ing. Sistemas/5to Semestre/programacion 3/Archivo/info/Mujeres/Patricia.txt";
	//creamos el contenido del archivo
	static String contenido = "Nombre: Patricia"+"\n"+"Edad: 40";
	//creamos el archivo y le agregamos la ruta
	static File file1 = new File(ruta);
	
	static String ruta2 = "C:/Users/marce/OneDrive/Documents/MARCELA/Ing. Sistemas/5to Semestre/programacion 3/Archivo/info/Mujeres/Alexa.txt";
	static String contenido2 = "Nombre: Alexandra"+"\n"+"Edad: 31";
	static File file2 = new File(ruta2);

	static String ruta3 = "C:/Users/marce/OneDrive/Documents/MARCELA/Ing. Sistemas/5to Semestre/programacion 3/Archivo/info/Mujeres/Maria.txt";
	static String contenido3 = "Nombre: Maria"+"\n"+"Edad: 20";
	static File file3 = new File(ruta3);
	
	
	static String ruta4 = "C:/Users/marce/OneDrive/Documents/MARCELA/Ing. Sistemas/5to Semestre/programacion 3/Archivo/info/Hombres/Carlos.txt";
	static String contenido4 = "Nombre: Carlos"+"\n"+"Edad: 34";
	static File file4 = new File(ruta4);

	/**
	 * Crear archivos con contenido y mostrar su contenido
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//verificar que un archivo igual no exista, si no existe lo creamos
			if (!file1.exists()) {
				file1.createNewFile();
			}
			//FileWriter definicion: construye el escritor de archivos cuando se proporciona
			//el archivo y el conjunto de caracteres y un booleano que indica si agregar los datos escritos o no.
			FileWriter fw = new FileWriter(file1);
			//escribe de forma eficiente el filewriter creado y almacena en buffer(cache)
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Creamos otro archivo
		try {			
			
			if (!file2.exists()) {
				file2.createNewFile();
			}
			FileWriter fw = new FileWriter(file2);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido2);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Creamos otro archivo
		try {					
			if (!file3.exists()) {
				file3.createNewFile();
			}
			FileWriter fw = new FileWriter(file3);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido3);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Creamos otro archivo
		try {
			
			if (!file4.exists()) {
				file4.createNewFile();
			}
			FileWriter fw = new FileWriter(file4);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido4);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//llamamos al menu de opciones
		menu();
	}
	/**
	 * metodo que me muestra los archivos como opciones para mostrar su contenido
	 */
	private static void menu() {
		//escribimos las opciones
		 int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija el numero del archivo para imprimir su contenido\n" 
				 //recordemos que si creamos un archivo, podemos acceder a su nombre con .getName()
                + "1."+file1.getName() +"\n"
                + "2."+file2.getName() +"\n"
                + "3."+file3.getName()+ "\n"
                + "4."+file4.getName() +"\n"));
		 //segun la opcion elegida se ejecuta el metodo correspondiente
		 switch (opcion) {
		case 1:
			try {
				//BufferReader sirve para leer un filereader del archivo que le enviemos
				BufferedReader txt1 = new BufferedReader(new FileReader(ruta));
				String contenido;
				try {//aqui recorre cada caracter y lo agrega al string: Contenido
					while ((contenido = txt1.readLine())!=null) {
						//imprime elcontenido
						System.out.println(contenido);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			break;
			
		case 2:
			try {
				BufferedReader txt1 = new BufferedReader(new FileReader(ruta2));
				String contenido;
				try {
					while ((contenido = txt1.readLine())!=null) {
						System.out.println(contenido);
						
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				BufferedReader txt1 = new BufferedReader(new FileReader(ruta3));
				String contenido;
				try {
					while ((contenido = txt1.readLine())!=null) {
						System.out.println(contenido);
						
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			break;
		case 4:
			try {
				BufferedReader txt1 = new BufferedReader(new FileReader(ruta4));
				String contenido;
				try {
					while ((contenido = txt1.readLine())!=null) {
						System.out.println(contenido);
						
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
		
	}

}
