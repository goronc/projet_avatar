public class test_Matiere {
    public static void main(String[] args) {
        Matiere math = new Matiere("Math", 2);
        Matiere histoire = new Matiere("Histoire", 1);

        System.out.println(math.toString());
        System.out.println(histoire.toString());
        System.out.println(math.getCoef());
        System.out.println(histoire.getCoef());
        System.out.println(math.getNom());
        System.out.println(histoire.getNom());
        math.setCoef(5);
        histoire.setCoef(4);
        math.setNom("PHYSIQUE");
        histoire.setNom("PHILO");
        System.out.println(math.toString());
        System.out.println(histoire.toString());

    }
}
