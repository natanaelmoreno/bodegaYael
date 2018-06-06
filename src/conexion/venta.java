/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.ResultSet;

/**
 *
 * @author NATANAEL MORENO
 */
public class venta {
    conexion cn=new conexion();
  /** public void insertar(String codigo,String articulo,String estilo ,String material ,String marca ,String color ,String talla,String pais) {
        cn.UID("INSERT INTO catalogo(codigo,articulo,estilo,material,marca,color,talla,pais) VALUES('" + codigo + "','" + articulo + "','" + estilo + "','" + material + "','" + marca + "','" + color + "','" + talla + "','" + pais + "')");
   }*/
    public void insertar(String codigo,String articulo){
    cn.UID("INSERT INTO articulo(codarticulo,descripcion) VALUES ('" + codigo + "','" + articulo + "')"); 
    }
 public void modificar(String codigo, String articulo) {
        cn.UID("UPDATE articulo SET descripcion='" + articulo + "' WHERE codarticulo=" + codigo  ); 
    }
     public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(codarticulo) FROM articulo"));
    }
    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(codarticulo) FROM articulo"));
    }
    public void eliminar(String articulo) {
        cn.UID("DELETE FROM articulo WHERE descripcion='" + articulo + "'");
    }
    public ResultSet buscar(String codigo) {
        return (cn.getValores("SELECT * FROM articulo WHERE codarticulo='" + codigo + "'"));
    }
    
    
    
     
    
    
    
    
    
    public void insertar2(String codigo,String material){
    cn.UID("INSERT INTO material(codmaterial,descripcion) VALUES ('" + codigo + "','" + material + "')"); 
    }
 public void modificar2(String codigo, String material) {
         cn.UID("UPDATE material SET descripcion='" + material + "' WHERE codmaterial=" + codigo  ); 
    }
    public ResultSet contarRegistros2() {
        return (cn.getValores("SELECT COUNT(codmaterial) FROM material"));
    }
    public ResultSet mayorRegistro2() {
        return (cn.getValores("SELECT MAX(codmaterial) FROM material"));
    }
    public void eliminar2(String material) {
        cn.UID("DELETE FROM material WHERE descripcion='" + material + "'");
    }
    public ResultSet buscar2(String codigo) {
        return (cn.getValores("SELECT * FROM material WHERE codmaterial='" + codigo + "'"));
    }
    
    
    
     public void insertar3(String codigo,String marca){
    cn.UID("INSERT INTO marca(codmarca,descripcion) VALUES ('" + codigo + "','" + marca+ "')"); 
    }
 public void modificar3(String codigo, String marca) {
        cn.UID("UPDATE marca SET descripcion='" + marca + "' WHERE codmarca=" + codigo  ); 
    }
    public ResultSet contarRegistros3() {
        return (cn.getValores("SELECT COUNT(codmarca) FROM marca"));
    }
    public ResultSet mayorRegistro3() {
        return (cn.getValores("SELECT MAX(codmarca) FROM marca"));
    }
    public void eliminar3(String marca) {
        cn.UID("DELETE FROM marca WHERE descripcion='" + marca + "'");
    }
   public ResultSet buscar3(String codigo) {
        return (cn.getValores("SELECT * FROM marca WHERE codmarca='" + codigo + "'"));
    }

    
    
    
    
    
    
     public void insertar5(String codigo,String talla){
    cn.UID("INSERT INTO talla(codtalla,tamanio) VALUES ('" + codigo + "','" + talla + "')"); 
    }
 public void modificar5(String codigo, String talla) {
        cn.UID("UPDATE tallas SET tamanio='" + talla + "' WHERE codtalla=" + codigo  ); 
    }
    public ResultSet contarRegistros5() {
        return (cn.getValores("SELECT COUNT(codtalla) FROM talla"));
    }
    public ResultSet mayorRegistro5() {
        return (cn.getValores("SELECT MAX(codtalla) FROM talla"));
    }
    public void eliminar5(String talla) {
        cn.UID("DELETE FROM talla WHERE tamanio='" + talla + "'");
    }
    public ResultSet buscar5(String codigo) {
        return (cn.getValores("SELECT * FROM talla WHERE codtalla='" + codigo + "'"));
    }
    
    
    
    
     public void insertar6(String codigo,String pais){
    cn.UID("INSERT INTO pais(codpais,descripcion) VALUES ('" + codigo + "','" + pais + "')"); 
    }
 public void modificar6(String codigo, String pais) {
         cn.UID("UPDATE pais SET descripcion='" + pais + "' WHERE codpais=" + codigo  ); 
    }
    public ResultSet contarRegistros6() {
        return (cn.getValores("SELECT COUNT(codpais) FROM pais"));
    }
    public ResultSet mayorRegistro6() {
        return (cn.getValores("SELECT MAX(codpais) FROM pais"));
    }
    public void eliminar6(String pais) {
        cn.UID("DELETE FROM pais WHERE descripcion='" + pais + "'");
    }
    public ResultSet buscar6(String codigo) {
        return (cn.getValores("SELECT * FROM pais WHERE codpais='" + codigo + "'"));
    }
    
    
    
    public void insertar7(String codigo,String material ,String marca ,String talla,String pais, String existencias) {
        cn.UID("INSERT INTO inventario(codinventario,material,marca,talla,pais,existencias) VALUES('" + codigo + "','" + material + "','" + marca + "','" + talla + "','" + pais + "','" + existencias+ "')");
    }
    public ResultSet contarRegistros7() {
        return (cn.getValores("SELECT COUNT(cod_catalogo) FROM inventario"));
    }
    public ResultSet mayorRegistro7() {
        return (cn.getValores("SELECT MAX(cod_catalogo) FROM inventario"));
    }
   public void modificar7(String codigo,String material ,String marca ,String talla,String pais){
          cn.UID("Update inventario set codinventario='"+codigo+"',material ='"+material+"' , marca ='"+marca+"',talla ='"+talla+"',pais ='"+pais+"'   where codinventario='"+codigo+"'");
      
}
}