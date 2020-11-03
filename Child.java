public class Child extends Human {
    Child() {
        super("Малыш", "Малыш", "юный");
        setMood(Mood.HAPPY);
    }

    public void hear(String a) {
        System.out.println(getName() + " слышит " + a + '.');
    }

    @Override
    public String defineMood() {
        switch ((int)(Math.round(Math.random()))) {
            case 0:
                return " тихо";
            case 1:
                return " громко";
            default:
                return "";
        }
    }



    public void laugh() {
        System.out.println(getName() + defineMood() + " смеётся.");
    }
}
