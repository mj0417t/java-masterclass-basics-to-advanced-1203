import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Movie movie= new Adventure("Star Wars");
//        Movie movie = Movie.getMovie("Comedy", "Last Men on Earth");
//        movie.watchMovie();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter Type(A for Adventure, C for Comedy," +
                    " S for Science or Q to quit): ");
            String type=sc.nextLine();
            if("Qq".contains(type))
                break;
            System.out.println("Enter Movie title: ");
            String title = sc.nextLine();
            Movie movie =Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}