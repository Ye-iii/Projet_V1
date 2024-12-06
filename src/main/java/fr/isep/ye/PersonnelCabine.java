package fr.isep.ye;

import java.util.List;

public class PersonnelCabine extends Employe {
    private String qualification;
    private List<Vol> volsAffectes;

    public PersonnelCabine(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche, String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }

    public String obtenirRole() {
        return "Employé: Personnel de Cabine";
    }

    public String obtenirInfos() {
        return super.obtenirInfos() + ", Qualification: " + qualification;
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
