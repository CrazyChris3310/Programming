public class Karlson extends Person{
    Karlson() {
        super("Карлсон", "Укротитель домомучительниц", "мужчина в вамом расцвете сил");
    }

    public void fly() {
        System.out.println(getNickname() + " влетает в квартиру." );
    }

    public void help(String a) {
        System.out.println(getName() + " помогает персонажу " + a + ".");
    }
}
