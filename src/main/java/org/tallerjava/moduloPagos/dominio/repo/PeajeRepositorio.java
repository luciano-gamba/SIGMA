package org.tallerjava.moduloPagos.dominio.repo;

import org.tallerjava.moduloPagos.dominio.Comun;
import org.tallerjava.moduloPagos.dominio.Preferencial;
import org.tallerjava.moduloPagos.dominio.Vehiculo;

/**
 * Eventualmente, si esta clase crece mucho, puedo tener más de un repositorio
 */
public interface PeajeRepositorio {
    public Vehiculo findByTag(int tag);
    public Vehiculo findByMatricula(String matricula);

    public Preferencial obtenerTarifaPreferencial();
    public Comun obtenerTarifaComun();

    void saveVehiculo(Vehiculo vehiculo);
}
