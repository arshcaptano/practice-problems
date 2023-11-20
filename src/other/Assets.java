package other;

public class Assets {
   private Desk desk = new Desk("Red", "12");
   private Desk desk2 = new Desk("Red", "12");

    private class Desk{
        String color;
        String size;

        Desk(String color, String size){
            this.color = color;
            this.size = size;
        }
    }
}
