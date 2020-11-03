public class Someone extends Human {
    Someone() {
        super("кто-то", "кто-то", "неизвестно");
    }

    @Override
    public String defineMood() {
        switch ((int)(Math.round(Math.random()))) {
            case 0:
                return " ";
            case 1:
                return "  ";
            default:
                return "";
        }
    }
}
