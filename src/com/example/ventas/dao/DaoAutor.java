
package com.example.ventas.dao;

import com.example.ventas.entity.Autor;
import java.util.List;

public interface DaoAutor {
    List<Autor> autorSel();
    Autor autorGet(Integer id);
    String autorIns(Autor autor);
    String autorUpd(Autor autor);
    String autorDel(Integer id);
    String getMensaje();
}
