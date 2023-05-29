import java.util.*;
import java.io.*;

/**
 * La classe Admin représente un administrateur.
 * Elle contient les fonctionnalités permettant de gérer les avatars, les tickets et les questions.
 */
public class Admin implements Serializable {

    private int id_admin;
    private ArrayList<Avatar> List_avatar;
    private ArrayList<Ticket> List_tickets;

    /**
     * Constructeur de la classe Admin.
     *
     * @param id_admin l'identifiant de l'administrateur
     */
    public Admin(int new_id_admin) {
        this.id_admin = new_id_admin;
        this.List_avatar = new ArrayList<Avatar>();
        this.List_tickets = new ArrayList<Ticket>();
    }

    /**
     * Constructeur de la classe Admin.
     *
     * @param id_admin l'identifiant de l'administrateur
     */
    public Admin(int new_id_admin, ArrayList<Avatar> new_List_avatar , ArrayList<Ticket> new_List_tickets) {
        this.id_admin = new_id_admin;
        this.List_avatar = new_List_avatar;
        this.List_tickets = new_List_tickets;
    }

    /**
     * Obtient l'identifiant de l'administrateur.
     *
     * @return l'identifiant de l'administrateur
     */
    public int getId_admin() {
        return id_admin;
    }

    /**
     * Obtient la liste des avatars.
     *
     * @return la liste des avatars
     */
    public ArrayList<Avatar> getList_avatar() {
        return List_avatar;
    }

    /**
     * Obtient la liste des tickets.
     *
     * @return la liste des tickets
     */
    public ArrayList<Ticket> getTickets_pseudo() {
        return List_tickets;
    }

    /**
     * Définit l'identifiant de l'administrateur.
     *
     * @param newId_admin le nouvel identifiant de l'administrateur
     */
    public void setId_admin(int newId_admin) {
        this.id_admin = newId_admin;
    }

    /**
     * Définit la liste des avatars.
     *
     * @param new_list_avatar la nouvelle liste des avatars
     */
    public void setList_avatar(ArrayList<Avatar> new_list_avatar) {
        this.List_avatar = new_list_avatar;
    }

    /**
     * Définit la liste des tickets.
     *
     * @param new_List_tickets la nouvelle liste des tickets
     */
    public void setTickets_pseudo(ArrayList<Ticket> new_List_tickets) {
        this.List_tickets = new_List_tickets;
    }

    /**
     * Ajoute un avatar à la liste des avatars.
     *
     * @param avatar l'avatar à ajouter
     */
    public void addAvatar_toList_avatar(Avatar avatar) {
        if (List_avatar.contains(avatar)) {
            System.out.println("L'avatar n'existe pas");
        } else {
            List_avatar.add(avatar);
            System.out.println("L'avatar a été ajouté à la liste");
        }
    }

    /**
     * Ajoute un ticket à la liste des tickets.
     *
     * @param ticket le ticket à ajouter
     */
    public void ajout_ticket(Ticket ticket) {
        List_tickets.add(ticket);
    }

    /**
     * Supprime un ticket de la liste des tickets.
     *
     * @param ticket le ticket à supprimer
     */
    public void suppr_ticket(Ticket ticket) {
        if (List_tickets.contains(ticket)) {
            List_tickets.remove(ticket);
            System.out.println("Le ticket a été supprimé");
        } else {
            System.out.println("Le ticket n'existe pas");
        }
    }

    /**
     * Vérifie si un ticket existe dans la liste des tickets, sinon l'ajoute.
     *
     * @param ticket le ticket à vérifier ou à ajouter
     */
    public void recevoir_ticket(Ticket ticket) {
        if (List_tickets.contains(ticket)) {
            System.out.println("Ce ticket a déjà été créé");
        } else {
            ajout_ticket(ticket);
            System.out.println("Le ticket a bien été envoyé");
        }
    }

    /**
     * Modifie l'avatar en fonction des tickets.
     */
    public void modif_avatar() {
        Ticket ticket = List_tickets.get(0);
        Avatar avatar = ticket.getAvatar();
        if (ticket.getIntitule().equals("pseudo")) {
            del_avatar(avatar);
            avatar.setPseudo(ticket.getMot());
            addAvatar_toList_avatar(avatar);
        } else if (ticket.getIntitule().equals("mdp")) {
            del_avatar(avatar);
            avatar.setmdp(ticket.getMot());
            addAvatar_toList_avatar(avatar);
        }
        List_tickets.remove(ticket);
    }

    /**
     * Supprime un avatar de la liste des avatars.
     *
     * @param avatar l'avatar à supprimer
     */
    public void del_avatar(Avatar avatar) {
        List_avatar.remove(avatar);
        avatar = null;
    }

    /**
     * Ajoute une question à la liste des questions.
     *
     * @param question      la question à ajouter
     * @param List_question la liste des questions
     */
    public void ajout_question(Question question, ListeQuestion List_question) {
        List_question.AddQuestion(question);
    }

    /**
     * Modifie une question en la remplaçant par une nouvelle question.
     *
     * @param question      l'ancienne question à remplacer
     * @param List_question la liste des questions
     * @param new_question  la nouvelle question
     */
    public void modif_question(Question question, ListeQuestion List_question, Question new_question) {
        List_question.ModifQuestion(question, new_question);
    }

    /**
     * Supprime une question de la liste des questions.
     *
     * @param question      la question à supprimer
     * @param List_question la liste des questions
     */
    public void del_question(Question question, ListeQuestion List_question) {
        List_question.SupprQuestion(question);
    }

    /**
     * Retourne une chaîne de caractères représentant l'objet Admin.
     *
     * @return une chaîne de caractères représentant l'objet Admin
     */
    @Override
    public String toString() {
        return "Admin : {" +
                "id_admin = " + id_admin +
                ", Liste d'avatar = " + List_avatar +
                "}";
    }
}