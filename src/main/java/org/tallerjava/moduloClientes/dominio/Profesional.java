package org.tallerjava.moduloClientes.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

@Table(name = "CLIENTE_PROFESIONAL")
public class Profesional extends Cliente {

    private Float porcentajeDescuento;
    private EnumTipoProfesional tipo;

}
