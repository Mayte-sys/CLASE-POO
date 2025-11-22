/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica9;

import java.io.*;
import java.util.*;

/**
 *
 * @author marga
 */
public class RunPractica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int n, id;
        String nombre, categoria;
        
        File folder = new File("datos");
        if (!folder.exists()) {
            folder.mkdir();
            System.out.println("Carpeta 'datos' creada.");
        } else 
            System.out.println("Carpeta 'datos' ya existe.");

        File fl = new File(folder, "productos.txt");
        System.out.println("path: " +  fl.getAbsolutePath());
        try {
            if (fl.createNewFile()) {
                System.out.println("Archivo 'productos.txt' creado.\n");
            }
        } catch (IOException excep) {
            System.out.println("El archivo no se puede crear: " + excep.getMessage());
            return;
        }
        
        System.out.println("\n=== Registro de productos ===");
        System.out.print("¿Cuantos productos quieres agregar?: ");
        n = scanner.nextInt();
        scanner.nextLine();

        try (FileWriter fw = new FileWriter(fl, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {

            for (int i = 1; i <= n; i++) {
                System.out.println("\nProducto #" + i);
                System.out.print("ID: ");
                id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nombre: ");
                nombre = scanner.nextLine();
                System.out.print("Categoria: ");
                categoria = scanner.nextLine();

                pw.println(id + "," + nombre + "," + categoria);
            }

            System.out.println("\nProductos guardados correctamente.");
        } catch (IOException excep){ 
            System.out.println("Error no se pudieron guardar los productos: " + excep.getMessage());
        }
        
        System.out.println("\n=== Lectura del archivo ===");
        try (BufferedReader br = new BufferedReader(new FileReader(fl))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }


        System.out.println("\n=== Archivos en la carpeta 'datos' ===");
        String[] archivo = folder.list();
        if (archivo != null) {
            for (String producto : archivo) {
                System.out.println(producto);
            }
        }
        scanner.close();
    }
}
