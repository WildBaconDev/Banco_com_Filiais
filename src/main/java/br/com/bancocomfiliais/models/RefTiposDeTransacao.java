package br.com.bancocomfiliais.models;

import br.com.bancocomfiliais.Enums.TiposDeTransacao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "REFTIPOSDETRANSACAO")
public class RefTiposDeTransacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_transacao_codigo")
    private Integer id;

    @Column(name = "tipos_de_transacao")
    @Enumerated(EnumType.STRING)
    private TiposDeTransacao tiposDeTransacao;

    @OneToMany(mappedBy = "refTiposDeTransacao")
    private List<MensagensTransacao> mensagensTransacao;
}
