/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaadministradorclaves;

import java.util.Scanner;
import com.administradorclaves.persistencia.dao.UsuarioDAO;

/**
 *
 * @author abecerra
 */
public class PersistenciaAdministradorClaves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        String cadena = "";
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        Pila<String> pila = new Pila();
        
        do {
            System.out.println("1. Agregar cadena.");
            System.out.println("2. Quitar cadena.");
            System.out.println("3. Mostrar todas las cadenas.");
            System.out.println("4. Obtener cadena.");
            System.out.println("5. Salir.");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Nombre de la cadena:");
                    cadena = scanner.next();
                    pila.agregar(cadena);
                    break;
                case 2: 
                    System.out.println("Nombre de la cadena a borrar:");
                    cadena = scanner.next();
                    pila.quitar(cadena);
                    break;
                case 3:
                    System.out.println("Mostrando las cadenas agregadas:");
                    System.out.println(pila.total());
                    break;
                case 4:
                    System.out.println("Posición donde se encuentra la cadena (0 es la posición inicial):");
                    cadena = pila.get(scanner.nextInt());
                    System.out.println(cadena);
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        } while (opcion != 5) ;
        /*
         * Agregar cadena
         * Quitar cadena
         * Mostrar todas
         * Salir
         */
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.crearUsuario();
    }
    
}
