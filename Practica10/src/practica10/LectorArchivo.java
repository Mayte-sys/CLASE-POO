/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica10;

import java.io.*;

/**
 *
 * @author marga
 */
public class LectorArchivo extends Thread{
    private String Archivo;
    private int Hilo;
    private Contador contador;
    
    public LectorArchivo(String Archivo, int Hilo, Contador contador) {
        this.Archivo = Archivo;
        this.Hilo = Hilo;
        this.contador = contador;
    }

    @Override
    public void run() {
        int lineas = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(Archivo))) {
            String linealeida;
            while ((linealeida = br.readLine()) != null) {
                System.out.println("Hilo-" + Hilo + " leyendo: " + linealeida);
                lineas++;
                Thread.sleep(500); 
            }
        } catch (IOException | InterruptedException excep) {
            excep.printStackTrace();
        }
        contador.agregarLineas(lineas);
    }
}
