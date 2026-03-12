public class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }


    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Something Funny Happens",
                "Something event funnier happens",
                "Happy Ending"
        );
    }
}
