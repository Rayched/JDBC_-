//JDBC 기본 logic 관리

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run(){
        int lastid = 0;
        System.out.println("=== 프로그램 실행 ===");
        System.out.println("=== 게시판 v 0.2 ===");
        Scanner sc = Container.scanner;
        List<Article> articles = new ArrayList<>();
        //ArrayList: 추가 공부 필요함
        //Container Class의 맴버 변수 scanner를 호출하고
        //그거를 변수 sc에 담는다.
        //scanner에 Scanner 객체가 담겨있다.

        while(true){
            System.out.printf("명령) ");
            String cmd = sc.nextLine();
            //입력된 명령어를 cmd 변수에 저장

            if(cmd.equals("command")){
                System.out.println("== 명령어 목록 ==");
                System.out.println("article add: 게시물 생성");
                System.out.println("article list: 게시물 목록");
                System.out.println("exit: 프로그램 종료");
            }
            else if(cmd.equals("article add")){
                System.out.println("=== 게시물 생성 ===");
                int id = ++lastid;
                //lastid가 while문 외부에 존재하므로
                //lastid에 담긴 값이 초기화되지 않음
                //게시물 번호 역할을 하는 id의 값도
                //게시물이 하나 늘어날 때마다 1 씩 증가함
                System.out.printf("제목: ");
                String title = sc.nextLine();
                System.out.printf("내용: ");
                String body = sc.nextLine();
                //게시물 제목 및 내용 입력 logic

                Article article = new Article(id, title, body);
                articles.add(article);
                System.out.println("생성된 게시물 객체: " + article);
                System.out.printf("%d번 게시물이 생성됐습니다.\n", id);
            }
            else if(cmd.equals("article list")){
                if (articles.size() == 0){
                    System.out.println("게시물이 존재하지 않습니다.");
                    continue;
                }

                System.out.println("== 게시물 목록 ==");
                System.out.println("번호 / 제목 / 내용");
                for (Article article: articles){
                    System.out.printf("%d / %s / %s\n", article.id, article.title, article.body);
                }
            }
            else if(cmd.equals("exit")){
                System.out.println("=== 프로그램 종료 ===");
                break;
            }
            else {
                System.out.println("존재하지 않는 명령어입니다.");
                System.out.println("명령어 목록을 확인해주세요.");
                System.out.println("command: 사용 가능한 명령어 확인");
            }

        }
    }
}


/* 작업 내용
 * 1. 기본적인 게시판 logic 구현
 * 2. 게시물 작성 구현, 다만 게시물 내용이 저장되지 않는 상태
 * 3. 작성했던 게시물 목록 표시하기 (관련 내용 보충 필요)
 */

