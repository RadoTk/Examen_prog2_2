package org.example;

import java.util.List;

public class Parc extends Lieux{
    private String idParc;
    private List<Hotels> hotels;
    private Avis avis;

    public Parc(String id, String nom, double longitudeMinimale, double latitudeMinimale, double longitudeMaximale, double latitudeMaximale, String description, String idParc, List<Hotels> hotels, Avis avis) {
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

    public Avis getAvis() {
        return avis;
    }

    public void setAvis(Avis avis) {
        this.avis = avis;
    }

    @Override
    public String toString() {
        return "Parc{" +
                "idParc='" + idParc + '\'' +
                ", hotels=" + hotels +
                ", avis=" + avis +
                '}';
    }
}
