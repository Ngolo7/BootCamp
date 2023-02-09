public class MoviesTime {
        public static void main(String[] args) {
            Movie myMovies = new Movie();

            myMovies.watchMovie();
            double time = 43.45;
            myMovies.watchMovie(time);

            double time1 = 45;
            String str = "Phatan";
            myMovies.watchMovie(time1,str);

            myMovies.watchMovie(str,time);


        }
    }

    class Movie{
        void watchMovie(){
            System.out.println(" Watching movie :");

        }
        void watchMovie(double Duration){
            System.out.println("Watching movie for :" +Duration);
        }
        void watchMovie(String name, double Duration){
            System.out.println("Watching movie " + " " +name+ "for" +Duration );
        }
        void watchMovie(double Duration, String name){
            System.out.println("Watching movie " + " " +name+ "for" +Duration );

        }
    }

