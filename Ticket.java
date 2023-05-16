import java.util.*;
import java.io.*;

public class Ticket implements Serializable{
    

    private Admin admin;
    private Avatar avatar;
    private String intitule;
    private String mot;


    public Ticket(Admin newAdmin, Avatar newAvatar, String newIntitule, String newMot) {
        admin = newAdmin;
        avatar = newAvatar;
        intitule = newIntitule;
        mot = newMot;
    }


    public Admin getAdmin() {
        return admin;
    }


    public Avatar getAvatar() {
        return avatar;
    }


    public String getIntitule() {
        return intitule;
    }


    public String getMot() {
        return mot;
    }


    public void setAdmin(Admin newAdmin) {
        admin = newAdmin;
    }


    public void setAvatar(Avatar newAvatar) {
        avatar = newAvatar;
    }


    public void setIntitule(String newIntitule) {
        intitule = newIntitule;
    }


    public void setMot(String newMot) {
        mot = newMot;
    }


    // Affichage du Ticket
    public String toString() {
        return "Ticket = {" +
                "Avatar = '" + avatar + '\'' +
                ", Intitule = " + intitule +
                '}';
    }
}