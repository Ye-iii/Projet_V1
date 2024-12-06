package fr.isep.ye;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
    protected String numeroReservation;
    private String dateReservation;
    private String statut;
    private List<Reservation> reservations;

    public Reservation(String numeroReservation, String dateReservation, String statut) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
        this.reservations = new ArrayList<>();
    }

    public void confirmerReservation() {
        this.statut = "Confirmée";
        System.out.println("Réservation " + numeroReservation + " est " + statut);
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

    public void modifierReservation(String nouvelleDate, String nouveauStatut) {
        this.dateReservation = nouvelleDate;
        this.statut = nouveauStatut;
        System.out.println("Réservation " + numeroReservation + " modifiée: la nouvelledate " + nouvelleDate + ", le nouvel statut " + nouveauStatut);
    }
}