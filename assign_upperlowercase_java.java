import java.util.Scanner;

public class assign_upperlowercase_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enterany character" );

        char c = sc.next().charAt(0);
        int alpha = c;

        if(alpha >= 65 && alpha <= 90){
            System.out.println("UPPERCASE");
        }
        else if(alpha >= 97 && alpha <= 122){
            System.out.println("LOWERCASE");
        }
    }
}
