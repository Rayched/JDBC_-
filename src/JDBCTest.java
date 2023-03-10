
//JDBC 연결 테스트

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

        public class JDBCTest {
            public static void main(String[] args) {

                Connection conn = null; //'import class'(클래스 추가) - java.sql 선택

                try{
                    Class.forName("com.mysql.jdbc.Driver");

                    String url = "jdbc:mysql://127.0.0.1:3306/text_board?useUnicode=true&characterEncoding=utf8&autoReconnect=true&serverTimezone=Asia/Seoul&useOldAliasMetadataBehavior=true&zeroDateTimeNehavior=convertToNull";

                    //conn = DriverManager.getConnection(url, "sbsst", "sbs123414");
                    conn = DriverManager.getConnection(url, "root", "");
                    //SQLyog에서 생성한 Database 계정
                    //해당 계정이 없으면 user를 root로 수정

                    System.out.println("연결 성공");
                }
                catch(ClassNotFoundException e){
                    System.out.println("드라이버 로딩 실패");
                }
                catch(SQLException e){
                    System.out.println("에러: " + e);
                }
                finally{
                    try{
                        if( conn != null && !conn.isClosed()){
                            conn.close();
                        }
                    }
                    catch( SQLException e){
                        e.printStackTrace();
                    }
                }
            }
        }
