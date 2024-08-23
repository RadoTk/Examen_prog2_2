package org.example;

import java.util.ArrayList;
import java.util.List;

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
}
