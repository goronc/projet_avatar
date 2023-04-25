import java.util.Random;

public class Test {
    
    private Avatar avatar1;
    
    public Test(Avatar new_avatar1) {
        this.avatar1 = new_avatar1;
    }
    
    public Avatar getAvatar1() {
        return avatar1;
    }
    
    public void setAvatar1(Avatar new_avatar1) {
        this.avatar1 = new_avatar1;
    }

    public Question choix_Question(ListeQuestion liste) {
        Random rand = new Random();
        int indice = rand.nextInt(liste.size());
        return liste.getListeQuestions(indice);
    }

    public void startTest() {
        
    }
}

