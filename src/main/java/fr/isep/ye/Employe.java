package fr.isep.ye;

public class Employe extends Personne {
    protected String numeroEmploye;
    protected String dateEmbauche;

    public Employe(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche) {
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    public String obtenirRole() {
        return "Employé";
    }
}
