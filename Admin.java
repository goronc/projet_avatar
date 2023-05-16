import java.util.*;
import java.io.*;


public class Admin implements Serializable{
    

    private int id_admin;
    private ArrayList<Avatar> List_avatar;
    private ArrayList<Ticket> List_tickets; 

    public Admin(int id_admin) {
        this.id_admin = id_admin;
        this.List_avatar = new ArrayList<Avatar>();
        this.List_tickets = new ArrayList<Ticket>();
    }
    

    public int getId_admin() {
        return id_admin;
    }
    

    public ArrayList<Avatar> getList_avatar() {
        return List_avatar;
    }


    public ArrayList<Ticket> getTickets_pseudo() {
        return List_tickets;
    }


    public void setId_admin(int newId_admin) {
        this.id_admin = newId_admin;
    }


    public void setList_avatar(ArrayList<Avatar> new_list_avatar) {
        this.List_avatar = new_list_avatar;
    }


    public void setTickets_pseudo(ArrayList<Ticket> new_List_tickets) {
        this.List_tickets = new_List_tickets;
    }


    // Ajoute l'avatar à la liste d'avatar
    public void addAvatar_toList_avatar(Avatar avatar) {
        if (List_avatar.contains(avatar)) {
            System.out.println("L'avatar n'existe pas");
        }
        else {
            List_avatar.add(avatar);
            System.out.println("L'avatar a été ajouté à la liste");
        }
    }


    // Ajoute un ticket fait par un avatar
    public void ajout_ticket(Ticket ticket) {
        List_tickets.add(ticket);
    }


    // Supprime un ticket
    public void suppr_ticket(Ticket ticket) {
        if (List_tickets.contains(ticket)) {
            List_tickets.remove(ticket);
            System.out.println("Le ticket a été supprimé");
        }
        else {
            System.out.println("Le ticket n'existe pas");
        }
    }

    // Vérifie si le ticket existe, sinon l'ajouter
    public void recevoir_ticket(Ticket ticket) {
        if (List_tickets.contains(ticket)) {
            System.out.println("Ce ticket a déjà été créer");
        }
        else {
            ajout_ticket(ticket);                                                                                                                                             
            System.out.println("Le ticket a bien été envoyé");
        }
    }


    // Modifie l'avatar selon les tickets
    public void modif_avatar() {
        Ticket ticket = List_tickets.get(0);
        Avatar avatar = ticket.getAvatar();
        if (ticket.getIntitule() == "pseudo") {
            del_avatar(avatar);
            avatar.setPseudo(ticket.getMot());
            addAvatar_toList_avatar(avatar);
        }
        else if (ticket.getIntitule() == "mdp"){
            del_avatar(avatar);
            avatar.setmdp(ticket.getMot());
            addAvatar_toList_avatar(avatar);
        }
        List_tickets.remove(ticket);
    }

    // Supprime l'avatar
    public void del_avatar(Avatar avatar) {
        List_avatar.remove(avatar);
        avatar = null;
    }


    // Ajoute une question à la liste
    public void ajout_question(Question question, ListeQuestion List_question) {
        List_question.AddQuestion(question);
    }


    // Modifie une question en l'a remplaçant avec une nouvelle
    public void modif_question(Question question, ListeQuestion List_question, Question new_question) {
        List_question.ModifQuestion(question, new_question);
    }


    // Supprime une question de la liste
    public void del_question(Question question, ListeQuestion List_question) {
        List_question.SupprQuestion(question);
    }


    // Affichage de l'admin
    public String toString() {
        return "Admin : {" +
                "id_admin = " + id_admin +
                "Liste d'avatar = " + List_avatar +
                "}";
    }    
}
