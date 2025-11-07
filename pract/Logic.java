// import cs2030s.fp.InfiniteList;
import java.util.stream.Stream;

public class Logic {
    public static String incrementSquare(int n) {
        String s = "";
            for (int i = 1; i <= n; i++) {
                int j = i;
                for (int count = 1; count <= n; count++) {
                    s = s + j + " ";
                    j = j + 1;
                }
                s = s + "\n";
            }
        return s;
    }

    public static String triangle(int n) {
        String s = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                s = s + "* ";
            }
        s = s + "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(Logic.incrementSquare(5));
        System.out.println(Logic.triangle(5));
    }
}
