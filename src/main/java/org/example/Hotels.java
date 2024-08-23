package org.example;

import java.util.List;

public class Hotels extends Lieux {
    private String idHotel;
    private String emails;
    private String telephone;
    private List<Avis> avisHotel;
    private List<Chambres> chambres;
    private List<Parc> parcs;


    public Hotels(String id, String nom, double longitudeMinimale, double latitudeMinimale, double longitudeMaximale, double latitudeMaximale, String description, String idHotel, String telephone, String emails, List<Avis> avisHotel, List<Chambres> chambres, List<Parc> parcs) {
        super(id, nom, longitudeMinimale, latitudeMinimale, longitudeMaximale, latitudeMaximale, description);
        this.idHotel = idHotel;
        this.telephone = telephone;
        this.emails = emails;
        this.avisHotel = avisHotel;
        this.chambres = chambres;
        this.parcs = parcs;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Avis> getAvisHotel() {
        return avisHotel;
    }

    public void setAvisHotel(List<Avis> avisHotel) {
        this.avisHotel = avisHotel;
    }

    public List<Chambres> getChambres() {
        return chambres;
    }

    public void setChambres(List<Chambres> chambres) {
        this.chambres = chambres;
    }

    public List<Parc> getParcs() {
        return parcs;
    }

    public void setParcs(List<Parc> parcs) {
        this.parcs = parcs;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "idHotel='" + idHotel + '\'' +
                ", emails='" + emails + '\'' +
                ", telephone='" + telephone + '\'' +
                ", avisHotel=" + avisHotel +
                ", chambres=" + chambres +
                ", parcs=" + parcs +
                '}';
    }

    public void ajouterAvis(Avis avis) {
        this.avisHotel.add(avis);
    }




}
