package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.annotation.processing.Generated;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "utilisateurs")
public class User {
    @Id

    private long id;
    @Column(name="First name")
    private String nom;

    @Column(name="Last name")
    private String prenom;

    private LocalDate dateNaissance; //YYYY-MM-JJ

    @Enumerated(EnumType.STRING)
    private Sexe sexe;

    @Temporal(TemporalType.DATE)
    private Date dateInscription;//java.util

}
