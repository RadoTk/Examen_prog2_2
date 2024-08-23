package org.example;

import java.util.List;

public class Parc extends Lieux{
    private String idParc;
    private List<Hotels> hotels;
    private List<Avis> avis;

    public Parc(String id, String nom, double longitudeMinimale, double latitudeMinimale, double longitudeMaximale, double latitudeMaximale, String description, String idParc, List<Hotels> hotels, List<Avis> avis) {
        super(id, nom, longitudeMinimale, latitudeMinimale, longitudeMaximale, latitudeMaximale, description);
        this.idParc = idParc;
        this.hotels = hotels;
        this.avis = avis;
    }


    public String getIdParc() {
        return idParc;
    }

    public void setIdParc(String idParc) {
        this.idParc = idParc;
    }

    public List<Hotels> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotels> hotels) {
        this.hotels = hotels;
    }

    public List<Avis> getAvis() {
        return avis;
    }

    public void setAvis(List<Avis> avis) {
        this.avis = avis;
    }

    public static void afficherAvisParc(Parc parc) {
        List<Avis> avis = parc.getAvis();
        System.out.println("Avis pour le parc " + parc.getNom() + " :");
        for (Avis a : avis) {
            System.out.println(a);
        }
    }
}
