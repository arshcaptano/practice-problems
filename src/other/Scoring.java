package other;

public class Scoring {
    public static void main(String args[]){
        System.out.println("First " + Exam.staticScore);

        System.out.println("Second " + new Exam().score);
    }
}
