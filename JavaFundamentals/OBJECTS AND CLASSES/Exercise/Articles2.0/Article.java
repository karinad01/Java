package Articles2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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

        String getTitle(){
            return title;
    }

    String getContent(){
            return content;
    }

    String getAuthor(){
            return author;
    }

    @Override
    public String toString(){
        //object -> text
        return String.format("%s - %s: %s", title, content, author);
    }
}
