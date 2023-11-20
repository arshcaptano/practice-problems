package other;

public class Exam {
    /*
    Character -> 'a'
    String -> "aa"
     */
    public static int staticScore = 20;
    public int score = 30;

    public static void main(String args[]){
        assignGrade(20);

    }

    public static String assignGrade(Integer score){
        System.out.println("Score is " + score);
        return "";
    }

    public String assignGrade(Integer score, String student){
        System.out.println("Score for " + student + " is " + score);
        return "";
    }
}
