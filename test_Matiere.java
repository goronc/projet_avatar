public class test_Matiere {
    public static void main(String[] args) {


        // Création des maières
        Matiere math = new Matiere("Math", 2);
        Matiere histoire = new Matiere("Histoire", 1);


        // Affichage des matières et de leurs coeff
        System.out.println(math.toString());
        System.out.println(histoire.toString());


        // Affichage des coeff
        System.out.println(math.getCoef());
        System.out.println(histoire.getCoef());


        // Affichage des matières
        System.out.println(math.getNom());
        System.out.println(histoire.getNom());


        // On définis les coeff pour les matières
        math.setCoef(5);
        histoire.setCoef(4);


        // Changement de nom des matières
        math.setNom("Physique");
        histoire.setNom("Philo");


        // Affichage des matières
        System.out.println(math.toString());
        System.out.println(histoire.toString());
    }
}