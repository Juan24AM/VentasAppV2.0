
package com.example.ventas.dao;

import com.example.ventas.entity.Categoria;
import java.util.List;

public interface DaoCategoria {
    List<Categoria> categoriaSel();
    Categoria categoriaGet(Integer id);
    String categoriaIns(Categoria categoria);
    String categoriaUpd(Categoria categoria);
    String categoriaDel(Integer id);
    String getMensaje();
}
