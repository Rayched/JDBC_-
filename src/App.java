//JDBC 기본 logic 관리

import java.util.Scanner;

public class App {
    public void run(){
        System.out.println("=== 프로그램 실행 ===");
        System.out.println("=== 게시판 v 0.1 ===");
        Scanner sc = Container.scanner;
        //Container Class의 맴버 변수 scanner를 호출하고
        //그거를 변수 sc에 담는다.
        //scanner에 Scanner 객체가 담겨있다.

        while(true){
            System.out.printf("명령) ");
            String cmd = sc.nextLine();
            //입력된 명령어를 cmd 변수에 저장

            if(cmd.equals("command")){
                System.out.println("== 명령어 목록 ==");
                System.out.println("exit: 프로그램 종료");
            }
            else if(cmd.equals("Article list")){
                System.out.println("== 게시물 목록 ==");
            }
            else if(cmd.equals("exit")){
                System.out.println("=== 프로그램 종료 ===");
                break;
            }
            else {
                System.out.println("존재하지 않는 명령어입니다.");
                System.out.println("명령어 목록을 확인해주세요.");
                System.out.println("command: 명령어 목록 표시");
            }

        }
    }
}
/* 작업 내용
 * 1. 기본적인 게시판 logic 구현 (게시물 작성 logic 미구현)
 * /
