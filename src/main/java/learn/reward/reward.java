package learn.reward;
import java.util.Scanner;
public class reward {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a score less than 100");
        int score = sc.nextInt();
        if(score >= 95 && score <= 100){
            System.out.println(score + "A+");
        }else if(score >= 90 && score < 95){
            System.out.println(score + "A");
        }else if(score >= 85 && score <= 90){
            System.out.println(score + "B+");
        }
        else if(score >= 80 && score < 85){
            System.out.println(score + "B");
        }else if( score < 80){
            System.out.println(score + "C");
        }
        else{
            System.out.println("please check your score");
        }
    }
}
