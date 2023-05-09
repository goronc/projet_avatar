import java.io.*;
import java.util.*;
public class main {
    public static void main(String[] args) {
        // On lit le fichier pour recuperer les avatars

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
