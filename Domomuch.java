public class Domomuch extends Person {
    Domomuch() {
        super("Фрекен Бок", "Домомучительница", "средний");
    }

    public void sayNothing() {
        System.out.println(getName() + " ничего не говорит.");
    }

    public void stand() {
        System.out.println(getName() + " стоит.");
    }

    public void think() {
        System.out.println(getName() + " думает.");
    }
}
