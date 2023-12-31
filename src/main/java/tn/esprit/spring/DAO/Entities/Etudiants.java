package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Etudiant")
@Data
public class Etudiants {

    @Id

    private long idEtudiant;

    @Column(name="nomEt")
    private String nomEtuduant;

    @Column(name="prenomEt")
    private String prenomEtuduant;

    @Column(name="cin")
    private long cin;

    @Column(name="ecole")
    private String ecole;




}
