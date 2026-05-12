package org.tallerjava.moduloPagos.aplicacion;

import org.tallerjava.moduloPagos.dominio.Vehiculo;

public interface ServicioPeaje {
    public boolean estaHabilitadoSincronico(int tag, String matricula);

    public void actualizarTarifaComun(double importe);
    public void actualizarTarifaPreferencial(double importe);

    void altaVehiculo(Vehiculo vehiculo);
}
