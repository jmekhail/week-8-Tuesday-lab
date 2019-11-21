import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }
        Scanner keyboard = new Scanner(System.in);
        Trivia object1 = new Trivia();



        object1.setQuestion("What is the state capital of Hawaii");
        object1.setAnswer("Honolulu");
        System.out.println(object1.getQuestion());
        String answer1 = keyboard.nextLine();

        if(object1.getAnswer().equalsIgnoreCase(answer1)){
            System.out.println("Right Answer");
        }

        else{
            System.out.println("Wrong Answer");
        }


        Trivia object2 = new Trivia();

        object2.setQuestion("In what state is Cloud Gate (the bean) located?");
        object2.setAnswer("Chicago");

        System.out.println(object2.getQuestion());
        String answer2 = keyboard.nextLine();
        if(object2.getAnswer().equalsIgnoreCase(answer2)){
            System.out.println("Right Answer");
        }
        else{
            System.out.println("Wrong Answer");
        }


        System.out.println();


        System.out.println(object1.toString());
        System.out.println(object2.toString());


    }
