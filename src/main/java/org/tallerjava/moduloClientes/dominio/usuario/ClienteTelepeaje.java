package org.tallerjava.moduloClientes.dominio.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tallerjava.moduloClientes.dominio.PostPaga;
import org.tallerjava.moduloClientes.dominio.PrePaga;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "gestion_clienteTelepeaje")
public class ClienteTelepeaje{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClienteTelepeaje;

    @OneToOne
    private PrePaga ctaPrepaga;
    @OneToOne
    private PostPaga ctaPostPaga;

    public ClienteTelepeaje(PrePaga prePaga, PostPaga postPaga) {
        this.ctaPrepaga = prePaga;
        this.ctaPostPaga = postPaga;
    }

    public void cargarSaldo(double importe) {
        this.ctaPrepaga.cargarSaldo(importe);
    }

    public double consultarSaldo() {
        return this.ctaPrepaga.getSaldo();
    }
}
