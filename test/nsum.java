import java.util.Scanner;

public class nsum {
    public static void main(String[] args) {
/* Note that scanner can be very slow on large inputs. Consider using a buffered reader such as the KattIO library if the problem has large inputs*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += sc.nextInt();
        }
        System.out.println(answer);
    }
}
