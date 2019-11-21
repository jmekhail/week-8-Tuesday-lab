public class Trivia {

    private String question;
    private String answer;


    public Trivia(String q, String a){

        question = q;
        answer = a;
    }

    public void setQuestion(String q) {
        question = q;
    }


    public String getQuestion(){
        return question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer(){
        return answer;
    }


    public String toString(){

        String ret;
        ret = "Question: " + question + "\n Right answer: " + answer + "\n";
        return ret;

    }

}
