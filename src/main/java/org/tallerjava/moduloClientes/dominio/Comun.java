package org.tallerjava.moduloClientes.dominio;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

@Table(name = "CLIENTE_COMUN")
public class Comun extends Cliente {

}
