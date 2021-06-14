package api.desafio.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity(name = "Pauta")
@NoArgsConstructor
@AllArgsConstructor
public class PautaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private long id;

    @Column(name="Titulo")
    private String titulo;

    @Column(name="Descricao")
    private String descricao;

}
