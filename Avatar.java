import java.util.*;

public class Avatar {
    
    private int pts_vie;
    private String pseudo;
    private Bulletin note;
    private int level;

    public Avatar() {
        pts_vie = 0;
        pseudo = "Inconnue";
        note = new Bulletin();
        level = 0;
    }

    public Avatar(int newPts_vie, String newPseudo, Bulletin newNote, int newLevel) {
        pts_vie = newPts_vie;
        pseudo = newPseudo;
        note = newNote;
        level = newLevel;
    }

    public int getPtsVie() {
        return pts_vie;
    }

    public String getPseudo() {
        return pseudo;
    }

    public Bulletin getNote() {
        return note;
    }

    public int getLevel() {
        return level;
    }

    public void setPtsVie(int newPts_Vie) {
        pts_vie = newPts_Vie;
    }

    public void setPseudo(String newPseudo) {
        pseudo = newPseudo;
    }

    public void setNote(Bulletin newNote) {
        note = newNote;
    }

    public void setLevel(int newLevel) {
        level = newLevel;
    }

    public void Ajouter_Note(float newNote, Matiere matiere) {
        this.Ajouter_Note(newNote, matiere);
    }

    public void defier() {
        this.startDefi();
    }

    public void test() {
        this.startTest();
    }

    public String toString() {
        return "Avatar{" +
                "pseudo='" + pseudo + '\'' +
                ", pts_vie=" + pts_vie +
                ", level=" + level +
                ", notes=" + note.toString() +
                '}';
    }
    
}
