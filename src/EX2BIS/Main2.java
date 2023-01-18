package EX2BIS;

import EX2.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Profil cp = new Profil("CP","Chef de projet");
        Profil mn = new Profil("MN","Manager");
        Profil dp = new Profil("DP","Directeur de projet");
        Profil drh = new Profil("DRH","Directeur des ressources humaines");
        Profil dg = new Profil("DG","Directeur général");
        ArrayList<Profil> listProfil = new ArrayList<Profil>();

        Utilisateur u1 = new Utilisateur("Mohamed","Amine","amine@gmail.com","0666666666",50000,"login1","123","Finance",mn);
        Utilisateur u2 = new Utilisateur("Tarik","Ahmed","ahmed@gmail.com","07777777",60000,"login2","456","RH",dp);
        Utilisateur u3 = new Utilisateur("Jamal","Said","jamal@gmail.com","099999999",80000,"login3","789","SI",dg);
        Utilisateur u4 = new Utilisateur("Samir","Said","jamal@gmail.com","099999999",80000,"login3","789","SI",dg);

        ArrayList<Utilisateur> listUtilisateur = new ArrayList<Utilisateur>(List.of(u1,u2,u3,u4));


        System.out.println("Liste utilisateur");
        for (Utilisateur u : listUtilisateur
             ) {
            u.afficher();;
        }

        System.out.println("Liste Managers");
        for (Utilisateur u : listUtilisateur
        ) {
            if(u.getProfil().getLibelle().equals("Manager"))u.afficher();;
        }






    }
}
