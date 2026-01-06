import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "size of int", "14", "19", "24", "29", "34");
        questions[1] = new Question(2, "size of double", "15", "20", "25", "30", "35");
        questions[2] = new Question(3, "size of float", "16", "21", "26", "31", "36");
        questions[3] = new Question(4, "size of long", "17", "22", "27", "32", "37");
        questions[4] = new Question(5, "size of boolean", "18", "23", "28", "33", "38");
    }

    public void playQuiz() {
        int i= 0;
        for (Question q : questions) {
            System.out.println("Question no : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("Option 1 : " + q.getOpt1());
            System.out.println("Option 2 : " + q.getOpt2());
            System.out.println("Option 3 : " + q.getOpt3());
            System.out.println("Option 4 : " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }

        for(String str : selection){
            System.out.println(str);
        }
    }
}
