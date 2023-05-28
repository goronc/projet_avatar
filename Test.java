import java.io.Serializable;

/**
 * Cette classe représente un Test.
 */
public class Test implements Serializable {

    private Avatar avatar1;
    private ListeQuestion questions;

    /**
     * Constructeur de la classe Test.
     *
     * @param newAvatar   L'avatar associé au test.
     * @param newQuestions La liste de questions du test.
     */
    public Test(Avatar newAvatar, ListeQuestion newQuestions) {
        this.avatar1 = newAvatar;
        this.questions = newQuestions;
    }

    /**
     * Retourne l'avatar associé au test.
     *
     * @return L'avatar associé au test.
     */
    public Avatar getAvatar1() {
        return avatar1;
    }

    /**
     * Retourne la liste de questions du test.
     *
     * @return La liste de questions du test.
     */
    public ListeQuestion getQuestions() {
        return questions;
    }

    /**
     * Définit l'avatar associé au test.
     *
     * @param newAvatar1 Le nouvel avatar associé au test.
     */
    public void setAvatar1(Avatar newAvatar1) {
        this.avatar1 = newAvatar1;
    }

    /**
     * Définit la liste de questions du test.
     *
     * @param newQuestions La nouvelle liste de questions du test.
     */
    public void setQuestions(ListeQuestion newQuestions) {
        this.questions = newQuestions;
    }

    /**
     * Retourne une représentation textuelle du test.
     *
     * @return Une représentation textuelle du test.
     */
    @Override
    public String toString() {
        return "Test = {" +
                questions.toString() +
                '}';
    }
}
