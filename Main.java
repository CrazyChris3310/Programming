public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat();
        Child malish = new Child();
        Karlson karlson = new Karlson();
        Domomuch FrekenBok = new Domomuch();
        FrekenBok.gav(malish.getNickname());
        FrekenBok.sayNothing();
        FrekenBok.stand();
        FrekenBok.think();
        malish.hear("стук");
        malish.laugh();
        karlson.fly();
        karlson.love();
        karlson.help(FrekenBok.getNickname());
    }
}
