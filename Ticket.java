import java.io.*;

/**
 * La classe Ticket représente un ticket dans un système de support.
 */
public class Ticket implements Serializable {

    private Admin admin;
    private Avatar avatar;
    private String intitule;
    private String mot;

    /**
     * Constructeur paramétré de la classe Ticket.
     * Initialise les attributs avec les valeurs passées en paramètres.
     * @param newAdmin l'administrateur associé au ticket.
     * @param newAvatar l'avatar associé au ticket.
     * @param newIntitule l'intitulé du ticket.
     * @param newMot le mot du ticket.
     */
    public Ticket(Admin newAdmin, Avatar newAvatar, String newIntitule, String newMot) {
        admin = newAdmin;
        avatar = newAvatar;
        intitule = newIntitule;
        mot = newMot;
    }

    /**
     * Récupère l'administrateur associé au ticket.
     * @return l'administrateur associé au ticket.
     */
    public Admin getAdmin() {
        return admin;
    }

    /**
     * Récupère l'avatar associé au ticket.
     * @return l'avatar associé au ticket.
     */
    public Avatar getAvatar() {
        return avatar;
    }

    /**
     * Récupère l'intitulé du ticket.
     * @return l'intitulé du ticket.
     */
    public String getIntitule() {
        return intitule;
    }

    /**
     * Récupère le mot du ticket.
     * @return le mot du ticket.
     */
    public String getMot() {
        return mot;
    }

    /**
     * Change l'administrateur associé au ticket.
     * @param newAdmin le nouvel administrateur associé au ticket.
     */
    public void setAdmin(Admin newAdmin) {
        admin = newAdmin;
    }

    /**
     * Change l'avatar associé au ticket.
     * @param newAvatar le nouvel avatar associé au ticket.
     */
    public void setAvatar(Avatar newAvatar) {
        avatar = newAvatar;
    }

    /**
     * Change l'intitulé du ticket.
     * @param newIntitule le nouvel intitulé du ticket.
     */
    public void setIntitule(String newIntitule) {
        intitule = newIntitule;
    }

    /**
     * Change le mot du ticket.
     * @param newMot le nouveau mot du ticket.
     */
    public void setMot(String newMot) {
        mot = newMot;
    }

    /**
     * Renvoie une représentation sous forme de chaîne de caractères du ticket.
     * @return la représentation du ticket.
     */
    public String toString() {
        return "Ticket = {" +
                "Avatar = '" + avatar + '\'' +
                ", Intitule = " + intitule +
                ", Mot = " + mot +
                '}';
    }
}
