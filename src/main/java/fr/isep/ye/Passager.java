package fr.isep.ye;

import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {
    private String passeport;
    private List<Reservation> reservations;

    public Passager(String identifiant, String nom, String adresse, String contact, String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    public String obtenirInfos() {
        return super.obtenirInfos() + ", Passport: " + passeport;
    }

    public Reservation reserverVol(String numeroReservation, String dateReservation) {
        Reservation reservation = new Reservation(numeroReservation, dateReservation, "Confirmée");
        reservations.add(reservation);
        System.out.println("Réservation " + numeroReservation + " est effectuée par " + nom);
        return reservation;
    }

    public void annulerReservation(String numeroReservation) {
        for (Reservation reservation : reservations) {
            if (reservation.numeroReservation.equals(numeroReservation)) {
                reservation.annulerReservation(numeroReservation);
                return;
            }
        }
        System.out.println("Cette réservation est annulée.");
    }

    public List<Reservation> obtenirReservations() {
        return reservations;
    }
}