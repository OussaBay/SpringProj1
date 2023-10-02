package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Foyer")
public class Foyer {

    @Id

    private long idFoyer;

    @Column(name="nomFoyer")
    private String nomFoyer;

    @Column(name="capaciteFoyer")
    private long capaciteFoyer;
}
