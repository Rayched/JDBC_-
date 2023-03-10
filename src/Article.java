//작성할 게시물을 담을 Article 객체가 필요함
//Article class 생성

public class Article {
    public int id;
    public String title;
    public String body;

    public Article(int id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("[id: %d, title: \"%s\", body: \"%s\"]", id,title,body);
    }
}
