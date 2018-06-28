package br.com.bancocomfiliais.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "MENSAGENSDETRANSACAO")
public class MensagensTransacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_mensagem")
    private Integer id;

    @Column(name = "codigo_da_moeda")
    private Integer codigoDaMoeda;

    @Column(name = "numero_IBAN")
    private Integer numeroIban;

    @Column(name = "data_da_transacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDaTransacao;

    @Column(name = "montante",precision = 19,scale = 2)
    private BigDecimal montante;

    @Column(name = "balanco",precision = 19,scale = 2)
    private BigDecimal balanco;

    @Column(name = "local")
    private String local;

    @ManyToOne
    @JoinColumn(name = "conta")
    private Conta conta;

    @ManyToOne
    @JoinColumn(name = "ref_tipos_de_transacao")
    private RefTiposDeTransacao refTiposDeTransacao;


}
