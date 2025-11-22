/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica8;

import java.util.*;

/**
 *
 * @author marga
 */
public class LaboratorioColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    System.out.println("\t\t== ArrayList: Exhibicion ==");
    ArrayList<Producto> listaExhibicion = new ArrayList<>();
    
    listaExhibicion.add(new Producto(1, "Teclado", "Perifericos"));
    listaExhibicion.add(new Producto(2, "Mouse", "Perifericos"));
    listaExhibicion.add(new Producto(3, "Monitor", "Pantallas"));
    listaExhibicion.add(new Producto(4, "Cable HDMI", "Oferta"));
    
    for (Producto p : listaExhibicion)
        System.out.println(p);
    
    System.out.println("\n\t\t== LinkedList: Reabastecer ==");
    LinkedList<Producto> colaReabastecer = new LinkedList<>();
    colaReabastecer.addLast(new Producto(5, "Laptop", "Computo"));
    colaReabastecer.addFirst(new Producto(6, "Webcam", "Perifericos"));

    for (Producto p : colaReabastecer)
        System.out.println(p);
    
    System.out.println("\n\t== HashSet: Categorias unicas ==");
    HashSet<String> categorias = new HashSet<>();

    for (Producto p : listaExhibicion)
        categorias.add(p.getCategoria());
    
    for (Producto p : colaReabastecer)
        categorias.add(p.getCategoria());

    System.out.println(categorias); 

    System.out.println("\n\t\t== HashMap: Consulta por id ==");
    HashMap<Integer, Producto> mapaPorId = new HashMap<>();

    for (Producto p : listaExhibicion)
        mapaPorId.put(p.getId(), p);
    
    for (Producto p : colaReabastecer)
        mapaPorId.put(p.getId(), p);

    int idBuscar = 3;
    if (mapaPorId.containsKey(idBuscar))
        System.out.println("id=" + idBuscar + " -> " + mapaPorId.get(idBuscar));
    
    System.out.println("\n\t\tRecorriendo HashMap (entrySet):");
    for (Map.Entry<Integer, Producto> entry : mapaPorId.entrySet())
        System.out.println(entry.getKey() + " -> " + entry.getValue());

    System.out.println("\n== Iterator: eliminar categoria 'Oferta' en listaExhibicion ==");

    Iterator<Producto> iterador = listaExhibicion.iterator();
    while (iterador.hasNext()) {
        Producto p = iterador.next();
        if (p.getCategoria().equals("Oferta"))
            iterador.remove(); 
    }

    System.out.println("Despues de eliminar:");
    for (Producto p : listaExhibicion)
        System.out.println(p);
    
    }
}
