package org.example;

import java.util.List;

public class Chambres {
    private String idChambre, numeroDeChambre;
    private double tarifNuite;
    private List<Avis> avis;


    public Chambres(String idChambre, String numeroDeChambre, double tarifNuite, List<Avis> avis) {
        this.idChambre = idChambre;
        this.numeroDeChambre = numeroDeChambre;
        this.tarifNuite = tarifNuite;
        this.avis = avis;
    }

    public String getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(String idChambre) {
        this.idChambre = idChambre;
    }

    public String getNumeroDeChambre() {
        return numeroDeChambre;
    }

    public void setNumeroDeChambre(String numeroDeChambre) {
        this.numeroDeChambre = numeroDeChambre;
    }

    public double getTarifNuite() {
        return tarifNuite;
    }

    public void setTarifNuite(double tarifNuite) {
        this.tarifNuite = tarifNuite;
    }

    public List<Avis> getAvis() {
        return avis;
    }

    public void setAvis(List<Avis> avis) {
        this.avis = avis;
    }

    public void ajouterAvis(Avis avis) {
        this.avis.add(avis);
    }

    @Override
    public String toString() {
        return "Chambres{" +
                "idChambre='" + idChambre + '\'' +
                ", numeroDeChambre='" + numeroDeChambre + '\'' +
                ", tarifNuite=" + tarifNuite +
                ", avis=" + avis +
                '}';
    }

    public static void afficherAvisChambre(Chambres chambre) {
        List<Avis> avis = chambre.getAvis();
        System.out.println("Avis pour la chambre " + chambre.getNumeroDeChambre() + " :");
        for (Avis a : avis) {
            System.out.println(a);
        }
    }
}


