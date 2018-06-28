package br.com.bancocomfiliais.models;

import br.com.bancocomfiliais.Enums.TiposDeCliente;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "REFTIPOSDECLIENTE")
public class RefTiposDeCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_cliente_codigo")
    private Integer id;

    @Column(name = "descricao_tipos_de_cliente")
    @Enumerated(EnumType.STRING)
    private TiposDeCliente DescricaoTiposDeCliente;

    @OneToMany(mappedBy = "refTiposDeCliente")
    private List<Cliente> clientes;
}
