/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author NATANAEL MORENO
 */
public class materiales {
      conexion cn = new conexion();
      
public ResultSet prueBa() {
        return (cn.getValores("SELECT descripcion FROM material"));
        
    }
      
    public ResultSet llenarMateriales() {
        return (cn.getValores("SELECT descripcion FROM material"));
        
    }
      
    public ResultSet llenarMarcas() {
        return (cn.getValores("SELECT descripcion FROM marca"));
    }

    public ResultSet llenarTallas() {
        return (cn.getValores("SELECT descripcion FROM talla"));
    }
      
    public ResultSet llenarPaises() {
        return (cn.getValores("SELECT descripcion FROM pais"));
    }
}
