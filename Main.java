interface Playable {
    public void play();
}
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing football is very exciting only if you are very good");
    }
}
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing basketball is very exciting if you have a good physique");
    }
}
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing volleyball is always fun if you have a good team");
    }
}
public class Main {
    public static void main(String[] args) {
        Football mostCommonSport = new Football();
        Basketball mostExhaustiveSport = new Basketball();
        Volleyball bestSport = new Volleyball();
        mostCommonSport.play();
        mostExhaustiveSport.play();
        bestSport.play();
    }
}