package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Universite")
public class Universite {

    @Id

    private long idUniversite;

    @Column(name="nomUniversite")
    private String nomUniversite;

    @Column(name="adress")
    private String adress;
}
