package org.example;

import java.time.LocalDate;
import java.util.List;

public class Avis {
    private String idAvis;
    public Utilisateur utilisateur;
    private int score;
    private String avis;
    private LocalDate date;

    public Avis(String idAvis, Utilisateur utilisateur, int score, String avis, LocalDate date) {
        this.idAvis = idAvis;
        this.utilisateur = utilisateur;
        this.score = score;
        this.avis = avis;
        this.date = date;
    }

    public String getIdAvis() {
        return idAvis;
    }

    public void setIdAvis(String idAvis) {
        this.idAvis = idAvis;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAvis() {
        return avis;
    }

    public void setAvis(String avis) {
        this.avis = avis;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}
