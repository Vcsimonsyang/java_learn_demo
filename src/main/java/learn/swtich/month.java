package learn.swtich;
import java.util.Scanner;
public class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int mon = sc.nextInt();
        switch(mon){
            case 1:
            case 2:
            case 12:
                System.out.println(mon + "月是冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(mon + "月是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(mon + "月是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(mon + "月是秋季");
                break;
            default:
                System.out.println("输入的可能不是一个月份");
        }
    }
}
