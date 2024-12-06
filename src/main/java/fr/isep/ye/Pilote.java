package fr.isep.ye;

import java.util.List;

public class Pilote extends Employe {
    private String licence;
    private String heuresDeVol;
    private List<Vol> volsAffectes;

    public Pilote(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche, String licence, String heuresDevol) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDevol;
    }

    public String obtenirRole() {
        return "Employé: Pilote";
    }

    public String obtenirInfos() {
        return super.obtenirInfos() + ", Licence: " + licence + ", Heures de vol: " + heuresDeVol;
    }

    public void affecterVol(Vol vol) {
        volsAffectes.add(vol);
        System.out.println("Vol " + vol.getNumeroVol() + " a été affecté à " + obtenirInfos());
    }

    public String obtenirVol(String numeroVol) {
        for (Vol vol : volsAffectes) {
            if (vol.getNumeroVol().equals(numeroVol)) {
                return vol.toString();
            }
        }
        return "Ce vol est introuvable.";
    }
}