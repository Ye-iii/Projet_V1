package fr.isep.ye;

public class Main {
    public static void main(String[] args) {
        Passager passager = new Passager("0789", "Ye", "Nantes", "07xxxxxxxx", "EG123456");
        Pilote pilote = new Pilote("0456", "Li", "Lyon", "06xxxxxxxx", "EMP001", "2020-01-01", "Licence123", "5000");
        PersonnelCabine personnel = new PersonnelCabine("0123", "Tian", "Paris", "07xxxxxxxx", "EM002", "02/07/2022", "Qualifié");
        Vol vol1 = new Vol("AF123", "Paris", "Beijing", "05/10/2024 00:30", "06/10/2024 06:30");
        Vol vol2 = new Vol("AF456", "Paris", "Londre", "05/10/2024 23:00", "06/10/2024 05:00");
        Avion avion = new Avion("A006", "Boeing 737", 180);

        String infopassager = passager.obtenirInfos();
        System.out.println(infopassager);
        String infopilote = pilote.obtenirInfos();
        System.out.println(infopilote);
        String infopercabine = personnel.obtenirInfos();
        System.out.println(infopercabine);
        String role = personnel.obtenirRole();
        System.out.println(role);
        vol1.annulerVol("AF123");
        vol2.modifierVol("Newyork", "16:45");
        avion.affecterVol("AF456");
    }
}