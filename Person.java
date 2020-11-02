abstract public class Person {
    private String name;
    private String age;
    private String nickname;

    Person(String name, String nickname, String age) {
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
}
