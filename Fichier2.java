import java.io.*;
import java.util.*;

/**
 * La classe Fichier2 contient le point d'entrée du programme.
 */
public class Fichier2 {
    /**
     * Le point d'entrée du programme.
     *
     * @param args les arguments de ligne de commande
     */
    public static void main(String[] args) {


        ArrayList<String> reponses1 = new ArrayList<String>(3);
        reponses1.add("Russie");
        reponses1.add("Canada");
        reponses1.add("Chine");
        Question q1 = new Question("Quel est le plus grand pays du monde ?", reponses1, 0, 9, 4);
    

        ArrayList<String> reponses2 = new ArrayList<String>(3);
        reponses2.add("O");
        reponses2.add("Ox");
        reponses2.add("O2");
        Question q2 = new Question("Quel est le symbole chimique de l'oxygène ?", reponses2, 0, 8, 2);


        ArrayList<String> reponses3 = new ArrayList<>(3);
        reponses3.add("Madrid");
        reponses3.add("Barcelone");
        reponses3.add("Valence");
        Question q3 = new Question("Quelle est la capitale de l'Espagne ?", reponses3, 0, 7, 2);


        ArrayList<String> reponses4 = new ArrayList<>(4);
        reponses4.add("Neptune");
        reponses4.add("Uranus");
        reponses4.add("Mercure");
        reponses4.add("Pluton");
        Question q4 = new Question("Quelle est la planète la plus éloignée du Soleil dans notre système solaire ?", reponses4, 0, 5, 8);


        ArrayList<String> reponses5 = new ArrayList<>(3);
        reponses5.add("Lion");
        reponses5.add("Tigre");
        reponses5.add("Ours");
        Question q5 = new Question("Quel est le plus grand félin ?", reponses5, 0, 6, 3);


        ArrayList<String> reponses6 = new ArrayList<>(3);
        reponses6.add("Jaune");
        reponses6.add("Bleu");
        reponses6.add("Vert");
        Question q6 = new Question("Quelle est la couleur du soleil ?", reponses6, 0, 5, 1);


        ArrayList<String> reponses7 = new ArrayList<>(4);
        reponses7.add("Europe");
        reponses7.add("Asie");
        reponses7.add("Afrique");
        reponses7.add("Amérique");
        Question q7 = new Question("Sur quel continent se trouve la France ?", reponses7, 0, 6, 3);


        ArrayList<String> reponses8 = new ArrayList<>(4);
        reponses8.add("Lion");
        reponses8.add("Tigre");
        reponses8.add("Éléphant");
        reponses8.add("Girafe");
        Question q8 = new Question("Quel animal est surnommé le roi de la jungle ?", reponses8, 0, 3, 5);

        ArrayList<String> reponses9 = new ArrayList<>(4);
        reponses9.add("Python");
        reponses9.add("Java");
        reponses9.add("C++");
        reponses9.add("JavaScript");
        Question q9 = new Question("Quel est le langage de programmation le plus populaire ?", reponses9, 0, 8, 4);


        ArrayList<String> reponses10 = new ArrayList<>(4);
        reponses10.add("Cacatoès");
        reponses10.add("Poule");
        reponses10.add("Cagou");
        Question q10 = new Question("Quel est le seul animal capable de voler ?", reponses10, 0, 5, 1);


        ArrayList<String> reponses11 = new ArrayList<>(4);
        reponses11.add("Football");
        reponses11.add("Tennis");
        reponses11.add("Basketball");
        reponses11.add("Volleyball");
        Question q11 = new Question("Quel est le sport le plus populaire dans le monde ?", reponses11, 0, 8, 5);


        ArrayList<String> reponses12 = new ArrayList<>(4);
        reponses12.add("Rome");
        reponses12.add("Venise");
        reponses12.add("Milan");
        reponses12.add("Florence");
        Question q12 = new Question("Quelle est la capitale de l'Italie ?", reponses12, 0, 6, 2);


        ArrayList<String> reponses13 = new ArrayList<>(3);
        reponses13.add("New York");
        reponses13.add("Los Angeles");
        reponses13.add("Chicago");
        Question q13 = new Question("Quelle est la plus grande ville des États-Unis ?", reponses13, 0, 7, 3);


        ArrayList<String> reponses14 = new ArrayList<>(3);
        reponses14.add("Espagnol");
        reponses14.add("Français");
        reponses14.add("Allemand");
        Question q14 = new Question("Quelle est la langue officielle de l'Argentine ?", reponses14, 0, 4, 2);


        ArrayList<String> reponses15 = new ArrayList<>(3);
        reponses15.add("Dumbo");
        reponses15.add("Éléphant d'Afrique");
        reponses15.add("Éléphant d'Asie");
        Question q15 = new Question("Quel est le plus gros animal terrestre ?", reponses15, 1, 6, 3);


        ArrayList<String> reponses16 = new ArrayList<>(4);
        reponses16.add("Java");
        reponses16.add("C#");
        reponses16.add("Python");
        reponses16.add("Ruby");
        Question q16 = new Question("Quel est un langage de programmation orienté objet ?", reponses16, 0, 5, 2);


        ArrayList<String> reponses17 = new ArrayList<>(3);
        reponses17.add("Brésil");
        reponses17.add("Argentine");
        reponses17.add("Chili");
        Question q17 = new Question("Quel pays est connu pour le tango ?", reponses17, 1, 6, 3);


        ArrayList<String> reponses18 = new ArrayList<>(4);
        reponses18.add("Gazelle");
        reponses18.add("Léopard");
        reponses18.add("Zèbre");
        reponses18.add("Crocodile");
        Question q18 = new Question("Quel animal est souvent associé à la savane africaine ?", reponses18, 2, 5, 1);


        ArrayList<String> reponses19 = new ArrayList<>(3);
        reponses19.add("Jupiter");
        reponses19.add("Vénus");
        reponses19.add("Saturne");
        Question q19 = new Question("Quelle planète est connue pour ses anneaux ?", reponses19, 2, 8, 4);


        ArrayList<String> reponses20 = new ArrayList<>(4);
        reponses20.add("Basketball");
        reponses20.add("Football américain");
        reponses20.add("Baseball");
        reponses20.add("Hockey sur glace");
        Question q20 = new Question("Quel sport est populaire aux États-Unis ?", reponses20, 1, 7, 3);


        ArrayList<String> reponses21 = new ArrayList<>(4);
        reponses21.add("Rouge");
        reponses21.add("Vert");
        reponses21.add("Bleu");
        reponses21.add("Jaune");
        Question q21 = new Question("Quelle est la couleur complémentaire du vert ?", reponses21, 0, 4, 2);


        ArrayList<String> reponses22 = new ArrayList<>(3);
        reponses22.add("Australie");
        reponses22.add("Nouvelle-Zélande");
        reponses22.add("Afrique du Sud");
        Question q22 = new Question("Quel pays est réputé pour ses kangourous ?", reponses22, 0, 6, 3);


        ArrayList<String> reponses23 = new ArrayList<>(4);
        reponses23.add("Singe");
        reponses23.add("Crocodile");
        reponses23.add("Dauphin");
        reponses23.add("Pelican");
        Question q23 = new Question("Quel animal vit principalement dans l'océan ?", reponses23, 2, 5, 2);


        ArrayList<String> reponses24 = new ArrayList<>(3);
        reponses24.add("La Joconde");
        reponses24.add("La Nuit étoilée");
        reponses24.add("Les Tournesols");
        Question q24 = new Question("Quelle peinture célèbre a été réalisée par Vincent van Gogh ?", reponses24, 1, 7, 3);


        ArrayList<String> reponses25 = new ArrayList<>(4);
        reponses25.add("Brésil");
        reponses25.add("Argentine");
        reponses25.add("France");
        reponses25.add("Espagne");
        Question q25 = new Question("Quel pays a remporté la Coupe du Monde de football en 2018 ?", reponses25, 2, 7, 3);


        ArrayList<String> reponses26 = new ArrayList<>(3);
        reponses26.add("Rome");
        reponses26.add("Paris");
        reponses26.add("Athènes");
        Question q26 = new Question("Quelle est la capitale de la Grèce ?", reponses26, 2, 4, 2);


        ArrayList<String> reponses27 = new ArrayList<>(4);
        reponses27.add("Mars");
        reponses27.add("Vénus");
        reponses27.add("Jupiter");
        reponses27.add("Mercure");
        Question q27 = new Question("Quelle est la deuxième planète la plus proche du Soleil ?", reponses27, 1, 7, 3);


        ArrayList<String> reponses28 = new ArrayList<>(4);
        reponses28.add("Basket-ball");
        reponses28.add("Tennis");
        reponses28.add("Football");
        reponses28.add("Golf");
        Question q28 = new Question("Quel sport se pratique avec une raquette ?", reponses28, 1, 5, 2);


        ArrayList<String> reponses29 = new ArrayList<>(3);
        reponses29.add("Espagne");
        reponses29.add("Portugal");
        reponses29.add("Etats-Unis");
        Question q29 = new Question("Quel pays est voisin de la France ?", reponses29, 0, 6, 3);


        ArrayList<String> reponses30 = new ArrayList<>(4);
        reponses30.add("Beethoven");
        reponses30.add("Mozart");
        reponses30.add("Bach");
        reponses30.add("Chopin");
        Question q30 = new Question("Quel compositeur est connu pour sa Symphonie n°5 en ut mineur ?", reponses30, 0, 8, 4);


        ArrayList<String> reponses31 = new ArrayList<>(3);
        reponses31.add("Java");
        reponses31.add("Python");
        reponses31.add("C++");
        Question q31 = new Question("Quel langage de programmation est souvent utilisé pour le développement d'applications Android ?", reponses31, 0, 7, 3);


        ArrayList<String> reponses32 = new ArrayList<>(4);
        reponses32.add("Vincent van Gogh");
        reponses32.add("Pablo Picasso");
        reponses32.add("Léonard de Vinci");
        reponses32.add("Claude Monet");
        Question q32 = new Question("Quel artiste a peint la Joconde ?", reponses32, 2, 9, 4);


        ArrayList<String> reponses33 = new ArrayList<>(4);
        reponses33.add("La Joconde");
        reponses33.add("La Nuit étoilée");
        reponses33.add("La Cène");
        reponses33.add("Guernica");
        Question q33 = new Question("Quelle est l'œuvre d'art célèbre peinte par Léonard de Vinci ?", reponses33, 0, 8, 4);

        ArrayList<String> reponses34 = new ArrayList<>(4);
        reponses34.add("Allemagne");
        reponses34.add("Italie");
        reponses34.add("Espagne");
        reponses34.add("Royaume-Uni");
        Question q34 = new Question("Dans quel pays se trouve la Tour de Pise ?", reponses34, 1, 6, 3);


        ArrayList<String> reponses35 = new ArrayList<>(3);
        reponses35.add("Égypte");
        reponses35.add("Brésil");
        reponses35.add("Australie");
        Question q35 = new Question("Dans quel pays se trouve le Sphinx ?", reponses35, 0, 8, 4);


        ArrayList<String> reponses36 = new ArrayList<>(4);
        reponses36.add("Mozart");
        reponses36.add("Bach");
        reponses36.add("Beethoven");
        reponses36.add("Chopin");
        Question q36 = new Question("Quel compositeur est connu pour sa Symphonie n°9 en ré mineur, également appelée 'Ode à la joie' ?", reponses36, 2, 10, 5);


        ArrayList<String> reponses37 = new ArrayList<>(3);
        reponses37.add("Cinéma");
        reponses37.add("Théâtre");
        reponses37.add("Musique");
        Question q37 = new Question("Quel est l'art de la scène qui met en jeu la voix, le geste et le jeu d'acteur ?", reponses37, 1, 7, 3);


        ArrayList<String> reponses38 = new ArrayList<>(4);
        reponses38.add("Amazon");
        reponses38.add("Facebook");
        reponses38.add("Instagram");
        Question q38 = new Question("Quel site internet est connu pour être une plateforme de vente en ligne ?", reponses38, 0, 6, 3);


        ArrayList<String> reponses39 = new ArrayList<>(4);
        reponses39.add("Lion");
        reponses39.add("Éléphant");
        reponses39.add("Girafe");
        reponses39.add("Rhinocéros");
        Question q39 = new Question("Quel est l'animal terrestre le plus grand ?", reponses39, 2, 8, 4);


        ArrayList<String> reponses40 = new ArrayList<>(4);
        reponses40.add("Le Petit Prince");
        reponses40.add("Guerre et Paix");
        reponses40.add("1984");
        reponses40.add("Orgueil et Préjugés");
        Question q40 = new Question("Quel est le titre du roman écrit par Antoine de Saint-Exupéry ?", reponses40, 0, 7, 3);


        ArrayList<String> reponses41 = new ArrayList<>(3);
        reponses41.add("Rouge");
        reponses41.add("Vert");
        reponses41.add("Bleu");
        Question q41 = new Question("Quelle est la couleur du ciel par temps clair ?", reponses41, 2, 4, 2);


        ArrayList<String> reponses42 = new ArrayList<>(3);
        reponses42.add("Tennis");
        reponses42.add("Football");
        reponses42.add("Escrime");
        Question q42 = new Question("Quel sport se joue avec un ballon rond ?", reponses42, 1, 6, 3);


        ArrayList<String> reponses43 = new ArrayList<>(3);
        reponses43.add("Oiseau");
        reponses43.add("Chien");
        reponses43.add("Chat");
        Question q43 = new Question("Quel animal miaule ?", reponses43, 2, 3, 1);


        ArrayList<String> reponses44 = new ArrayList<>(3);
        reponses44.add("Lundi");
        reponses44.add("Jeudi");
        reponses44.add("Mercredi");
        Question q44 = new Question("Quel jour de la semaine vient après le mardi ?", reponses44, 2, 2, 1);


        ArrayList<String> reponses45 = new ArrayList<>(3);
        reponses45.add("Paris");
        reponses45.add("Londres");
        reponses45.add("Rome");
        Question q45 = new Question("Quelle est la capitale de la France ?", reponses45, 0, 5, 2);


        ArrayList<String> reponses46 = new ArrayList<>(4);
        reponses46.add("Orange");
        reponses46.add("Banane");
        reponses46.add("Pomme");
        reponses46.add("Poire");
        Question q46 = new Question("Quel fruit est jaune ?", reponses46, 1, 4, 2);


        ArrayList<String> reponses47 = new ArrayList<>(4);
        reponses47.add("Guitare");
        reponses47.add("Piano");
        reponses47.add("Violon");
        reponses47.add("Trompette");
        Question q47 = new Question("Quel instrument se joue en appuyant sur des touches ?", reponses47, 1, 6, 3);


        ArrayList<String> reponses48 = new ArrayList<>(4);
        reponses48.add("Paris");
        reponses48.add("Londres");
        reponses48.add("New York");
        reponses48.add("Tokyo");
        Question q48 = new Question("Quelle est la capitale du Japon ?", reponses48, 3, 5, 2);


        ArrayList<String> reponses49 = new ArrayList<>(4);
        reponses49.add("Football américain");
        reponses49.add("Cricket");
        reponses49.add("Rugby");
        reponses49.add("Baseball");
        Question q49 = new Question("Quel sport se joue avec une batte et une balle ?", reponses49, 3, 7, 3);


        ArrayList<String> reponses50 = new ArrayList<>(3);
        reponses50.add("Mercure");
        reponses50.add("Venus");
        reponses50.add("Mars");
        Question q50 = new Question("Quelle est la planète la plus proche du soleil ?", reponses50, 0, 8, 4);


        ArrayList<String> reponse_possible3 = new ArrayList<String>(4);
        reponse_possible3.add("Paris");
        reponse_possible3.add("Londres");
        reponse_possible3.add("Madrid");
        reponse_possible3.add("Berlin");
        Question question1 = new Question("Quel est le nom de la capitale de la France ?", reponse_possible3, 0, 1, 1);


        ArrayList<String> reponse_possible4 = new ArrayList<String>(4);
        reponse_possible4.add("L'océan Atlantique");
        reponse_possible4.add("L'océan Pacifique");
        reponse_possible4.add("L'océan Indien");
        reponse_possible4.add("L'océan Arctique");
        Question question2 = new Question("Quel est le plus grand océan ?", reponse_possible4, 1, 2, 1);
        

        ArrayList<String> reponse_possible5 = new ArrayList<String>(3);
        reponse_possible5.add("6 millions");
        reponse_possible5.add("8 millions");
        reponse_possible5.add("7 millions");
        Question question3 = new Question("Quel est la population modiale ?", reponse_possible5, 1, 6, 1);

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

        Admin admin = new Admin(1);
        Ticket ticket = new Ticket(admin, avatar, "pseudo", "UnNouveauPseudo");

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

        //Sérialisation de l'objet
        try {
            FileOutputStream fileOut = new FileOutputStream("tickets.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(ticket);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }

        ArrayList<Ticket> tickets = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tickets.ser"))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Ticket) {
                        tickets.add((Ticket) obj);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


         //Sérialisation de l'objet
         try {
            FileOutputStream fileOut = new FileOutputStream("question.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(q1);
            out.writeObject(q2);
            out.writeObject(q2);
            out.writeObject(q3);
            out.writeObject(q4);
            out.writeObject(q5);
            out.writeObject(q6);
            out.writeObject(q7);
            out.writeObject(q8);
            out.writeObject(q9);
            out.writeObject(q10);
            out.writeObject(q11);
            out.writeObject(q12);
            out.writeObject(q13);
            out.writeObject(q14);
            out.writeObject(q15);
            out.writeObject(q16);
            out.writeObject(q17);
            out.writeObject(q18);
            out.writeObject(q19);
            out.writeObject(q20);
            out.writeObject(q21);
            out.writeObject(q22);
            out.writeObject(q23);
            out.writeObject(q24);
            out.writeObject(q25);
            // out.writeObject(q26);
            // out.writeObject(q27);
            // out.writeObject(q28);
            // out.writeObject(q29);
            // out.writeObject(q30);
            // out.writeObject(q31);
            // out.writeObject(q32);
            // out.writeObject(q33);
            // out.writeObject(q34);
            // out.writeObject(q35);
            // out.writeObject(q36);
            // out.writeObject(q37);
            // out.writeObject(q38);
            // out.writeObject(q39);
            // out.writeObject(q40);
            // out.writeObject(q41);
            // out.writeObject(q42);
            // out.writeObject(q43);
            // out.writeObject(q44);
            // out.writeObject(q45);
            // out.writeObject(q46);
            // out.writeObject(q47);
            // out.writeObject(q48);
            // out.writeObject(q49);
            // out.writeObject(q50);
            // out.writeObject(question1);
            // out.writeObject(question2);
            // out.writeObject(question3);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }

        ArrayList<Question> questions = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("question.ser"))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Question) {
                        questions.add((Question) obj);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(avatars);
        System.out.println(questions);
        System.out.println(tickets);
    }
}