/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenciaadministradorclaves;

import java.util.Scanner;
import com.administradorclaves.persistencia.dao.UsuarioDAO;
import com.administradorclaves.persistencia.entidad.Usuario;

/**
 *
 * @author abecerra
 */
public class PersistenciaAdministradorClaves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = usuarioDAO.getUsuarioPorIdUsuario(2L);
        System.out.println(usuario.getFechaActualizacion().toString());
    }
    
}
