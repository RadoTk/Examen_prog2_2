package org.example;


public abstract class Yangus {
    private String id, nom;

    public Yangus(String id, String nom) {
        this.id = id;
        this.nom = "Yangus";
    }

    public String informationHotel(Hotels hotel) {
        return "Hotels{" +
                ", emails='" + hotel.getEmails() + '\'' +
                ", telephone='" + hotel.getTelephone() + '\'' +
                ", avis=" + hotel.getAvisHotel() +
                '}';
    }





}
