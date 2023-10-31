package com.example.ventas.test;

import com.example.ventas.dao.DaoCategoria;
import com.example.ventas.dao.impl.DaoCategoriaImpl;
import com.example.ventas.entity.Categoria;

public class TestDao {

    public static void main(String[] args) {
        DaoCategoria dao = new DaoCategoriaImpl();
        //Select (ver todos los datos)
        /*try {
            dao.categoriaSel().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(dao.getMensaje());
        }*/
        
        //GET (ver el dato con el id indicado)
        /*try {
            System.out.println(dao.categoriaGet(6));
        } catch (Exception e) {
            System.out.println(dao.getMensaje());
        }*/
        
        //INSERT
        /*Categoria catIns = new Categoria();
        catIns.setNombre("Computadoras");
        catIns.setDescripcion("Tecnologia");
        try {
            System.out.println(dao.categoriaIns(catIns));
        } catch (Exception e) {
            System.out.println(dao.getMensaje());
        }  */
        
        
        //UPDATE
        /*Categoria catUpd = new Categoria();
        catUpd.setId(5);
        catUpd.setNombre("Laptops");
        catUpd.setDescripcion("Tecnologia");
        try {
            System.out.println(dao.categoriaUpd(catUpd));
        } catch (Exception e) {
            System.out.println(dao.getMensaje());
        }  */
        
        //Delete
        try {
            System.out.println(dao.categoriaDel(5));
        } catch (Exception e) {
            System.out.println(dao.getMensaje());
        }  
    }
}
