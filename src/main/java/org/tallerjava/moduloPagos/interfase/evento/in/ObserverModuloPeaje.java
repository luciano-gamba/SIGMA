package org.tallerjava.moduloPagos.interfase.evento.in;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;
import org.tallerjava.moduloClientes.interfase.evento.out.GestionNuevoVehiculo;
import org.tallerjava.moduloClientes.interfase.evento.out.GestionPagoCuentaPostPaga;
import org.tallerjava.moduloClientes.interfase.evento.out.GestionPagoCuentaPrePaga;
import org.tallerjava.moduloCargas.infraestructura.RegistradorDeMetricas;
import org.tallerjava.moduloPagos.aplicacion.ServicioPeaje;
import org.tallerjava.moduloPagos.dominio.Identificador;
import org.tallerjava.moduloPagos.dominio.Nacionalidad;
import org.tallerjava.moduloPagos.dominio.Vehiculo;

@ApplicationScoped
public class ObserverModuloPeaje {
    private static final Logger log = Logger.getLogger(ObserverModuloPeaje.class);

    @Inject
    private ServicioPeaje servicioPeaje;

    public void accept(@Observes GestionNuevoVehiculo event) {
        log.infof("Evento procesado: GestionNuevoVehiculo: %s", event.toString());
        Identificador identificador = new
                Identificador(event.getMatricula(), event.getTag());
        Vehiculo vehiculo = new Vehiculo(
                identificador,
                event.getMarca(),
                event.getModelo(),
                Nacionalidad.getById(event.getNacionalidad()));

        servicioPeaje.altaVehiculo(vehiculo);
    }

}
