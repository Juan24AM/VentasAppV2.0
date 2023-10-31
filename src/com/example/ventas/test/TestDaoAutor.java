package com.example.ventas.test;

import com.example.ventas.dao.DaoAutor;
import com.example.ventas.dao.impl.DaoAutorImpl;
import com.example.ventas.entity.Autor;

public class TestDaoAutor {

    public static void main(String[] args) {
        DaoAutor dao = new DaoAutorImpl();
        //Select (ver todos los datos)
        try {
            dao.autorSel().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(dao.getMensaje());
        }
        
        //GET (ver el dato con el id indicado)
        /*try {
            System.out.println(dao.autorGet(6));
        } catch (Exception e) {
            System.out.println(dao.getMensaje());
        }*/
        
        //INSERT
        /*Autor catIns = new Autor();
        catIns.setNombre("Computadoras");
        catIns.setDescripcion("Tecnologia");
        try {
            System.out.println(dao.autorIns(catIns));
        } catch (Exception e) {
            System.out.println(dao.getMensaje());
        }  */
        
        
        //UPDATE
        /*Autor catUpd = new Autor();
        catUpd.setId(5);
        catUpd.setNombre("Laptops");
        catUpd.setDescripcion("Tecnologia");
        try {
            System.out.println(dao.autorUpd(catUpd));
        } catch (Exception e) {
            System.out.println(dao.getMensaje());
        }  */
        
        //Delete
        /*try {
            System.out.println(dao.autorDel(5));
        } catch (Exception e) {
            System.out.println(dao.getMensaje());
        }  */
    }
}
