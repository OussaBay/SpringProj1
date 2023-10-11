package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Universite")
@Data
public class Universite {

    @Id

    private long idUniversite;

    @Column(name="nomUniversite")
    private String nomUniversite;

    @Column(name="adress")
    private String adress;

    @OneToOne
    private Foyer foyer;
}
