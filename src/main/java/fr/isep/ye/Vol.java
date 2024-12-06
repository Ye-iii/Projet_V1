package fr.isep.ye;

import java.util.ArrayList;
import java.util.List;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;
    private List<Passager> passagers;
    private List<Vol> vols;

    public Vol(String numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrivee) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
        this.passagers = new ArrayList<>();
        this.vols = new ArrayList<>();
    }

    public String getNumeroVol() {
        return numeroVol;
    }

    public void planifierVol(Vol vol) {
        vols.add(vol);
        System.out.println("Le vol " + numeroVol + " planifié.");
    }

    public void annulerVol(String numeroVol) {
        this.etat = "Annulé";
        System.out.println("Vol " + numeroVol + " est " + etat);
    }

    public void modifierVol(String nouvelledestination, String nouvelledateHeureDepart) {
        this.destination = nouvelledestination;
        this.dateHeureDepart = nouvelledateHeureDepart;
        System.out.println("Vol " + numeroVol + " modifié: nouvelle destination " + nouvelledestination + ", la nouvelle heure de départ " + nouvelledateHeureDepart);
    }

    public void ListingPassager() {
        System.out.println("Liste des passagers du vol " + numeroVol + ":");
        for (Passager passager : passagers) {
            System.out.println(passager.obtenirInfos());
        }
    }
}