import java.io.*;
import java.util.*;

public class Fichier2 {
    public static void main(String[] args) {
        // Création d'un objet
        Avatar avatar = new Avatar();
        Avatar avatar2 = new Avatar();
        Avatar avatar3 = new Avatar();
        Avatar avatar4 = new Avatar();
        avatar2.setPseudo("george");
        avatar3.setPseudo("palpatine");
        avatar4.setPseudo("lucas");

        
        // Sérialisation de l'objet
        // try {
        //     FileOutputStream fileOut = new FileOutputStream("avatar.ser");
        //     ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //     out.writeObject(avatar);
        //     out.writeObject(avatar2);
        //     out.writeObject(avatar3);
        //     out.writeObject(avatar4);
        //     out.close();
        //     fileOut.close();
        // } catch (IOException i) {
        //     i.printStackTrace();
        // }

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

