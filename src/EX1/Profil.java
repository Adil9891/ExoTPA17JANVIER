package EX1;

import java.util.ArrayList;

public class Profil {

    private int id;
    private String code;
    private String libelle;
    private ArrayList<User> listUsers;

    protected Profil(int id, String code, String libette) {
        this.id = id;
        this.code = code;
        this.libelle = libette;
        listUsers= new ArrayList();
    }
    public void addUser(User user) {
        this.listUsers.add(user);
    }

    public ArrayList<User> getListUsers() {
        return listUsers;
    }

    @Override
    public String toString() {
        return libelle;
    }
}
