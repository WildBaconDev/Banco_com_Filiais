package br.com.bancocomfiliais.models;

import br.com.bancocomfiliais.Enums.TiposDeConta;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "REFTIPOSDECONTA")
public class RefTiposDeConta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_conta_codigo")
    private Integer id;

    @Column(name = "descricao_tipo_de_conta")
    @Enumerated(EnumType.STRING)
    private TiposDeConta DescricaoTiposDeConta;

    @OneToMany(mappedBy = "refTiposDeConta")
    private List<Conta> contas;
}
