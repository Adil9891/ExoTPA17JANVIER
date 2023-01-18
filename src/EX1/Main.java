package EX1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Profil profil1 = new Profil(1,"CP","Chef de projet");
        Profil profil2 = new Profil(2,"Manager","Manager");
        Profil profil3 = new Profil(3,"DP","Développeur");

        ArrayList<Profil> listProfil = new ArrayList();
        listProfil.add(profil1);
        listProfil.add(profil2);
        listProfil.add(profil3);

        User user1 = new User(1,"ALAMI","Karim", "Casablanca","k.alami@gmail.com",profil2);
        User user2 = new User(2,"MOHAMED","ABDERRAHIM", "FES","n.naciri@gmail.com",profil2);
        User user3 = new User(3,"TARIK","MOSTAFA", "MEKNES","t.mostafa@gmail.com",profil3);

        for(Profil profil:listProfil){
            for (User user:profil.getListUsers()){
                System.out.println(user);
            }
        }

    }
}