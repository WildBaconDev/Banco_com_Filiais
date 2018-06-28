package br.com.bancocomfiliais.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CONTA")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "conta_nome")
    private String contaNome;

    @Column(name = "data_abrimento")
    @Temporal(TemporalType.DATE)
    private Date dataAbrimento;

    @Column(name = "data_fechamento")
    @Temporal(TemporalType.DATE)
    private Date dataFechamento;

    @Column(name = "saldo_atual", precision = 19, scale = 2)
    private BigDecimal saldoAtual;

    @Column(name = "outros_detalhes_da_conta")
    private String outrosDetalhesDaConta;

    @ManyToOne
    @JoinColumn(name = "cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "ref_tipos_de_conta")
    private RefTiposDeConta refTiposDeConta;

    @OneToMany(mappedBy = "conta")
    private List<MensagensTransacao> mensagensTransacaos;
}
