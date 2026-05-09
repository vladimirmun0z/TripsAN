package com.trips.services;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.trips.models.Rol;

@Service
public class RolServiceImpl implements IRolService {

    private List<Rol> lista = null;

    public RolServiceImpl() {
        lista = new LinkedList<>();
        
        Rol r1 = new Rol();
        r1.setId(1);
        r1.setNomRol("Administrador");
        r1.setDescripcion("Persona designada para la supervisión de los vendedores");
        r1.setActivo(true);
        r1.setFechaRegistro(new Date());

        Rol r2 = new Rol();
        r2.setId(2);
        r2.setNomRol("Vendedor");
        r2.setDescripcion("Encargado de gestionar las ventas de los trips");
        r2.setActivo(true);
        r2.setFechaRegistro(new Date());
        
        Rol r3 = new Rol();
        r3.setId(2);
        r3.setNomRol("Visitante");
        r3.setDescripcion("Usuario que solo puede ver las ofertas disponibles");
        r3.setActivo(true);
        r3.setFechaRegistro(new Date());

        lista.add(r1);
        lista.add(r2);
        lista.add(r3);
    }

    @Override
    public List<Rol> buscarTodos() {
        return lista;
    }

    @Override
    public Rol buscarPorId(Integer idRol) {
        for (Rol r : lista) {
            if (r.getId().equals(idRol)) return r;
        }
        return null;
    }
}
