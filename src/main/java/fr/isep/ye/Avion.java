package fr.isep.ye;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private boolean disponible;

    public Avion(String immatriculation,String modele,int capacite){
        this.immatriculation=immatriculation;
        this.modele=modele;
        this.capacite=capacite;
        this.disponible=true;
    }
    public boolean verifierDisponibilite(){
        return disponible;
    }
    public void affecterVol(String numeroVol){
        if(disponible){
            disponible=false;
            System.out.println("Avion "+immatriculation+" affecté au vol "+numeroVol);
        }else{
            System.out.println("Avion non disponible.");
        }
    }
}
