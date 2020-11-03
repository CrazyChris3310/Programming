public class Domomuch extends Human {
    Domomuch() {
        super("Фрекен Бок", "Домомучительница", "средний");
        setMood(Mood.GRUMPY);
    }

    public void sayNothing() {
        System.out.println(getName() + " ничего не говорит.");
    }

    public void stand() {
        System.out.println(getName() + " стоит.");
    }

    public void gav(String a) {
        System.out.println(getName() + " мучает " + a + "а" + ".");
    }
    @Override
    public String defineMood() {
        switch ((int)(Math.round(Math.random()))) {
            case 0:
                return " молча";
            case 1:
                return " ворчит и";
            default:
                return "";
        }
    }

    public void think() {
        System.out.println(getName() +defineMood() + " думает.");
    }
}
