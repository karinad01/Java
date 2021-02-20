package Articles;

public class Article {
    //fields
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author){
    this.title = title;
    this.content = content;
    this.author = author;
    }

    //methods
    public void edit(String newContent){
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public void rename(String newTitle){
        this.title = newTitle;
    }

    @Override
    public String toString(){
        //object -> text
        return title + " - " + content + ": " + author;
    }
}
