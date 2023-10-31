package com.example.ventas.dao.impl;

import com.example.ventas.dao.DaoAutor;
import com.example.ventas.entity.Autor;
import com.example.ventas.util.ConexionBD;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
        
        
public class DaoAutorImpl implements DaoAutor{

    private ConexionBD conexion;
    private String mensaje;

    public DaoAutorImpl() {
        conexion = new ConexionBD();
    }    
    
    @Override
    public List<Autor> autorSel() {
        List<Autor> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id,")
                .append("nombre")
                .append(" FROM autor");
        try(Connection c = conexion.getConexion()) {
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {                
                Autor autor = new Autor();
                autor.setId(rs.getInt(1));
                autor.setNombre(rs.getString(2));
                lista.add(autor);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }     
        return lista;
    }

    @Override
    public Autor autorGet(Integer id) {
        Autor autor = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id,")
                .append("nombre")
                .append(" FROM autor")
                .append(" WHERE id = ?");
        try(Connection c = conexion.getConexion()) {
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();            
            if (rs.next()) {                
                autor = new Autor();
                autor.setId(rs.getInt(1));
                autor.setNombre(rs.getString(2));
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }     
        return autor;
    }

    @Override
    public String autorIns(Autor autor) {        
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO autor(")
                .append("nombre")
                .append(") VALUES (?,?)");
        try(Connection c = conexion.getConexion()) {
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setString(1, autor.getNombre());
            int cont = ps.executeUpdate(); 
            mensaje = (cont == 0) ? "No se insertó" : null;
        } catch (Exception e) {
            mensaje = e.getMessage();
        }     
        return mensaje;
    }

    @Override
    public String autorUpd(Autor autor) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE autor SET ")
                .append("nombre = ?")
                .append(" WHERE id = ?");
        try(Connection c = conexion.getConexion()) {
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setString(1, autor.getNombre());
            ps.setInt(2, autor.getId());
            int cont = ps.executeUpdate(); 
            mensaje = (cont == 0) ? "No se actualizó" : null;
        } catch (Exception e) {
            mensaje = e.getMessage();
        }     
        return mensaje;
    }

    @Override
    public String autorDel(Integer id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM autor")
                .append(" WHERE id = ?");
        try(Connection c = conexion.getConexion()) {
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setInt(1, id);
            int cont = ps.executeUpdate(); 
            mensaje = (cont == 0) ? "No se eliminó" : null;
        } catch (Exception e) {
            mensaje = e.getMessage();
        }     
        return mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }
    
}
