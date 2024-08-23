package org.example;

public abstract class Lieux {
    private String id, nom;
    private double longitudeMinimale;
    private double latitudeMinimale;
    private double longitudeMaximale;
    private double latitudeMaximale;
    private String description;

    public Lieux(String id, String nom, double longitudeMinimale, double latitudeMinimale, double longitudeMaximale, double latitudeMaximale, String description) {
        this.id = id;
        this.nom = nom;
        this.longitudeMinimale = longitudeMinimale;
        this.latitudeMinimale = latitudeMinimale;
        this.longitudeMaximale = longitudeMaximale;
        this.latitudeMaximale = latitudeMaximale;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLongitudeMinimale() {
        return longitudeMinimale;
    }

    public void setLongitudeMinimale(double longitudeMinimale) {
        this.longitudeMinimale = longitudeMinimale;
    }

    public double getLatitudeMinimale() {
        return latitudeMinimale;
    }

    public void setLatitudeMinimale(double latitudeMinimale) {
        this.latitudeMinimale = latitudeMinimale;
    }

    public double getLongitudeMaximale() {
        return longitudeMaximale;
    }

    public void setLongitudeMaximale(double longitudeMaximale) {
        this.longitudeMaximale = longitudeMaximale;
    }

    public double getLatitudeMaximale() {
        return latitudeMaximale;
    }

    public void setLatitudeMaximale(double latitudeMaximale) {
        this.latitudeMaximale = latitudeMaximale;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
