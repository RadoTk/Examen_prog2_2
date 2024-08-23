package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.Chambres.afficherAvisChambre;
import static org.example.Hotels.afficherAvisHotel;
import static org.example.Parc.afficherAvisParc;

public class CarteMadagascar {
    private List<Hotels> hotels;
    private List<Parc> parcs;
    private List<Avis> avis;

    public CarteMadagascar(List<Hotels> hotels, List<Parc> parcs, List<Avis> avis) {
        this.hotels = hotels;
        this.parcs = parcs;
        this.avis = new ArrayList<>();
    }

    public List<Hotels> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotels> hotels) {
        this.hotels = hotels;
    }

    public List<Parc> getParcs() {
        return parcs;
    }

    public void setParcs(List<Parc> parcs) {
        this.parcs = parcs;
    }

    public List<Avis> getAvis() {
        return avis;
    }

    public void setAvis(List<Avis> avis) {
        this.avis = avis;
    }


    public static Hotels getHotelAvecLePlusDeParcs(List<Hotels> hotels) {
        if (hotels == null || hotels.isEmpty()) {
            return null;
        }
        Hotels hotelAvecLePlusDeParcs = hotels.get(0);
        for (Hotels hotel : hotels) {
            if (hotel.getParcs().size() > hotelAvecLePlusDeParcs.getParcs().size()) {
                hotelAvecLePlusDeParcs = hotel;
            }
        }
        return hotelAvecLePlusDeParcs;
    }

    public static void afficherTousLesAvis(List<Hotels> hotels) {
        for (Hotels hotel : hotels) {
            afficherAvisHotel(hotel);
            for (Chambres chambre : hotel.getChambres()) {
                afficherAvisChambre(chambre);
            }
            for (Parc parc : hotel.getParcs()) {
                afficherAvisParc(parc);
            }
        }
    }
}
