package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Foyer")
@Data
public class Foyer implements Serializable {

    @Id

    private long idFoyer;

    @Column(name="nomFoyer")
    private String nomFoyer;

    @Column(name="capaciteFoyer")
    private long capaciteFoyer;

    @OneToMany ( cascade = CascadeType.ALL)
    private Set<Bloc> blocs;
}
