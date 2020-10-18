public class Execute {
    public static void main(String[] args) {
        Game game= new Game();
        game.define();
        while (true) {
            try {
               game.output();
               game.move();
            } catch (Exception e) {
                System.out.println("Your input was not correct");
            }
        }
    }
}
