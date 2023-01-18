package EX2BIS;

import EX2.Utilisateur;

import java.util.ArrayList;

public class Profil {
    private static int idProfil;
    private int id;
    private String code;
    private String  libelle;
   // private ArrayList<Utilisateur> listUtilisateur;

    public Profil(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
        this.id=++idProfil;
     //   this.listUtilisateur=new ArrayList();
    }
   /* public void addUtilisateur(Utilisateur utilisateur) {
        listUtilisateur.add(utilisateur);
    }

    public ArrayList<Utilisateur> getListUtilisateur() {
        return listUtilisateur;
    }*/

    public String getLibelle() {
        return libelle;
    }
}
