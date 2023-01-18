package EX1;

public class User {
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private Profil profil;

    public User(int id, String nom, String prenom, String adresse, String email, Profil profil) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.profil = profil;
        this.profil.addUser(this);
    }

    @Override
    public String toString() {
        return "l'email du "+profil+" "+nom+" "+prenom+" est "+email;
    }

}
