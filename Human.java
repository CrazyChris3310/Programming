abstract public class Human {
    private String name;
    private String age;
    private String nickname;
    private Mood mood;


    Human(String name, String nickname, String age) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
        System.out.println("В квартиру добавлен " + name + " по кличке " + nickname + ".");
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAge() {
        return age;
    }

    public void walk() {
        System.out.println(name + " ходит...");
    }

    public void hear(String a) {
        System.out.println(name + " слышит " + a + '.');
    }

    public void say(String a) {
        System.out.println(name + " говорит: \"" + a + "\".");
    }

    public void say() {
        System.out.println(name + " говорит.");
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    abstract public String defineMood();

}
