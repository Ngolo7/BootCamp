public class Movie {
    public static void main(String[] args) {
        WatchMovie MyMovies = new WatchMovie();

        MyMovies.Movie();
        double time = 43.45;
        MyMovies.Movie(time);

        double time1 = 45;
        String str = "Phatan";
        MyMovies.Movie(time1,str);

        MyMovies.Movie(str,time);


    }
}

class WatchMovie{
void Movie(){
    System.out.println(" Watching movie :");

}
void Movie(double Duration){
    System.out.println("Watching movie for :" +Duration);
}
void Movie(String name, double Duration){
    System.out.println("Watching movie " + " " +name+ "for" +Duration );
}
void Movie(double Duration, String name){
    System.out.println("Watching movie " + " " +name+ "for" +Duration );

}
}