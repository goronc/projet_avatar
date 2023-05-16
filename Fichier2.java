import java.io.*;
import java.util.*;


public class Fichier2 {
    public static void main(String[] args) {

        ArrayList<String> reponse_possible = new ArrayList<String>(3);
        reponse_possible.add("Russie");
        reponse_possible.add("Canada");
        reponse_possible.add("Chine");
        Question q1 = new Question("Quel est le plus grand pays du monde ?", reponse_possible, 1, 9, 4);
    

        ArrayList<String> reponse_possible2 = new ArrayList<String>(3);
        reponse_possible2.add("O");
        reponse_possible2.add("Ox");
        reponse_possible2.add("O2");
        Question q2 = new Question("Quel est le symbole chimique de l'oxygène ?", reponse_possible2, 1, 8, 2);

        Bulletin bulletin = new Bulletin();

        Matiere math = new Matiere("Math", 2);
        Matiere histoire = new Matiere("Histoire", 1);


        bulletin.ajout_note(12, math,5);
        bulletin.ajout_note(18, math,1);
        bulletin.ajout_note(14, histoire,2);

        // Création d'un objet
        Avatar avatar = new Avatar();
        Avatar avatar2 = new Avatar();
        Avatar avatar3 = new Avatar();
        Avatar avatar4 = new Avatar();
        avatar2.setPseudo("george");
        avatar3.setPseudo("palpatine");
        avatar4.setPseudo("lucas");
        avatar2.setBulletin(bulletin);


        //Sérialisation de l'objet
        try {
            FileOutputStream fileOut = new FileOutputStream("avatar.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(avatar);
            out.writeObject(avatar2);
            out.writeObject(avatar3);
            out.writeObject(avatar4);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }

        ArrayList<Avatar> avatars = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("avatar.ser"))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Avatar) {
                        avatars.add((Avatar) obj);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(avatars);
    }
}