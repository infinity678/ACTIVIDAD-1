/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Cargar 10 productos predefinidos
        for (int i = 1; i <= 10; i++) {
            Producto p = new Producto("Producto" + i, "COD" + i, 10.0 * i, i * 5);
            listaProductos.add(p);
        }

        System.out.println("10 productos han sido agregados automáticamente.\n");

        // Menú principal
        do {
            System.out.println("--- Menú Principal ---");
            System.out.println("1. Crear producto");
            System.out.println("2. Imprimir productos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    Producto p = new Producto();
                    System.out.print("Ingrese nombre del producto: ");
                    p.setNombre(scanner.nextLine());

                    System.out.print("Ingrese código del producto: ");
                    p.setCodigo(scanner.nextLine());

                    System.out.print("Ingrese precio del producto: ");
                    p.setPrecio(scanner.nextDouble());

                    System.out.print("Ingrese cantidad del producto: ");
                    p.setCantidad(scanner.nextInt());
                    scanner.nextLine(); // Limpiar buffer

                    listaProductos.add(p);
                    System.out.println("Producto creado exitosamente.\n");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Productos ---");
                    if (listaProductos.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        for (Producto prod : listaProductos) {
                            prod.imprimirProducto();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}
