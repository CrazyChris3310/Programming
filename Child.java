public class Child extends Person{
    Child() {
        super("Малыш", "Малыш", "юный");
    }

    public void hear(String a) {
        System.out.println(getName() + " слышит " + a + '.');
    }

    public void laugh() {
        System.out.println(getName() + " смеётся.");
    }
}
