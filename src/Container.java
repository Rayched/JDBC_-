//Scanner 객체 관리
import java.util.Scanner;
public class Container {
    public static Scanner scanner;
    //Scanner 변수 scanner 생성
    //static 키워드 사용

    static {
        scanner = new Scanner(System.in);
        //Scanner 객체 생성
    }
    //여러 번 실행되지 않고, 한번만 실행되어야 할때
    //프로그램이 실행될 때
    //입력한 데이터가 계속 남아있어야 하므로
    //static method 사용함
}
