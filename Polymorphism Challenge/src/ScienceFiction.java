public class ScienceFiction extends Movie{

    public ScienceFiction(String title) {
        super(title);
    }


    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Bad Aliens do bad stuff",
                "Space Guys chase aliens",
                "Planet Blows Up"
        );
    }
}
