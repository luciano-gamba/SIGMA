package org.tallerjava.moduloClientes.aplicacion.impl;

import jakarta.enterprise.context.ApplicationScoped;
import org.tallerjava.moduloClientes.aplicacion.ServicioClientes;
import org.tallerjava.moduloClientes.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ServicioClientesImpl implements ServicioClientes {

    // aca iria todo los @Inject que se precisen

    @Override
    public void registrarCliente(String cedula, String nombreCompleto, String telefono, String contrasenia){
        //aca va la implementacion
    }

    @Override
    public void altaMedioPago(Cliente cliente, String medioPago){
        //aca va la implementacion
    }

    @Override
    public List<Cliente> obtenerClientes(){
        List<Cliente> listaClientes = new ArrayList<>();

        //aca se rellenaria la lista

        return listaClientes;
    }

    @Override
    public void realizarReclamo(){
        //aca va la implementacion
    }

}
