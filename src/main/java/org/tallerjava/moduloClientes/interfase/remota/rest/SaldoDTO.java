package org.tallerjava.moduloClientes.interfase.remota.rest;

import lombok.Data;

@Data
public class SaldoDTO {
    private long idCliente;
    private double importe;
}
