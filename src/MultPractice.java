/**
 * Created by Teacher on 4/1/2019.
 */
public class MultPractice implements StudyPractice{
    private int first;
    private int second;

    public MultPractice(int num1, int num2){
        first = num1;
        second = num2;
    }
    public String getProblem() {
        return first + "Times" + second;
    }
    public void nextProblem(){
        second++;
    }
}
