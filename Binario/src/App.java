import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Insira o número para a conversão (em decimal)");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        String numstr = Integer.toString(num);
        System.out.println(numstr.charAt(0));
        in.close();
        String ordem = "";
        for(int i = 1; i <= numstr.length(); i++);
        {
            int len = numstr.length();
            if ((len % 2) == 0)
            {
                for(int i = 0; i<len; i++)
                {
                    char s = numstr.charAt(i);
                    char b = s;
                    ordem = Character.toString(b);
                }
            }   


        }

    }
}
