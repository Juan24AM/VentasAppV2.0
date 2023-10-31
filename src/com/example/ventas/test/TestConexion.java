package com.example.ventas.test;

import com.example.ventas.util.ConexionBD;

public class TestConexion {
    public static void main(String[] args) {
        try {
            ConexionBD con = new ConexionBD();
            con.getConexion();
            System.out.println("Exito");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
