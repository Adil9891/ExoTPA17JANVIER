package EX2;

public class Personne {
    private static int idPersonne;
    protected int id;
    protected String nom;
    protected String prenom;
    protected String mail;
    protected String telephone;
    protected double salaire;

    public double calculerSalaire(){
        return this.salaire;
    }
    public  void afficher(){
        System.out.println( nom +" " + prenom+ " - Salaire : " + salaire);
    }

    public Personne(String nom, String prenom, String mail, String telephone, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.salaire = salaire;
        this.id=++idPersonne;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
