package br.com.bancocomfiliais.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_cliente")
    private String nomeCliente;

    //Telefone/Celular
    @Column(name = "numero_cliente")
    private String numeroCliente;

    @Column(name = "email_cliente")
    private String emailCliente;

    @Column(name = "data_entrada_cliente")
    @Temporal(TemporalType.DATE)
    private Date dataEntradaCliente;

    @Column(name = "outros_detalhes")
    private String outrosDetalhes;

    @OneToMany(mappedBy = "cliente")
    private List<Conta> contas;

    @ManyToOne
    @JoinColumn(name = "ref_tipos_de_cliente")
    private RefTiposDeCliente refTiposDeCliente;
}
