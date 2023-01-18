package EX2;

import EX2BIS.Profil;

public class Utilisateur extends Personne {
    private String login;
    private String password;
    private String service;
    private Profil profil;

    public Utilisateur(String nom, String prenom, String mail, String telephone, double salaire, String login, String password, String service, Profil profil) {
        super(nom, prenom, mail, telephone, salaire);
        this.login = login;
        this.password = password;
        this.service = service;
        this.profil = profil;
        //this.profil.addUtilisateur(this);
           }

    @Override
    public double calculerSalaire() {
            if(this.profil.getLibelle().equals("Manager")){
                return getSalaire()+(getSalaire()*0.1);
            } else if (this.profil.getLibelle().equals("Directeur général")){
                return getSalaire()+(getSalaire()*0.4);
            }
             return this.getSalaire();
    }
    public  void afficher(){
        System.out.println( getNom() +" " + getPrenom()+ " - Salaire : " + calculerSalaire());
    }

    public Profil getProfil() {
        return profil;
    }
}
