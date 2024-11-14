import java.util.Scanner;
public class Javaexample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("กรุณาใส่คะแนนของนักเรียน = ");
        int score = input.nextInt();

        if (score >= 80) {
            System.out.println("grad 4");
        }else if (score >= 70){
            System.out.println("grad 3");
        }else if (score >= 60){
            System.out.println("grad 2");
        }else if (score >= 50){
            System.out.println("grad 1");
        }else{
            System.out.println("grad 0");
        }

        input.close();
    }
}
