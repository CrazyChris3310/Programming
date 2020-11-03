public class Karlson extends Human {
    Karlson() {
        super("Карлсон", "Укротитель домомучительниц", "мужчина в вамом расцвете сил");
        setMood(Mood.KIND);
    }

    public void fly() {
        System.out.println(getNickname() + " влетает в квартиру." );
    }
    public void love() {
        System.out.println(getName() + " любит варенье)" );
    }


    public void help(String a) {
        System.out.println(getName() + defineMood() +" помогает персонажу " + a + ".");
    }

    @Override
    public String defineMood() {
        switch ((int)(Math.round(Math.random()))) {
            case 0:
                return " лениво";
            case 1:
                return " с охотой";
            default:
                return "";
        }
    }
}
