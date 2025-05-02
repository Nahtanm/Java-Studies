package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private LocalDateTime dateTime;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> commentList = new ArrayList<>();

    public Post(LocalDateTime dateTime, String title, String content, Integer likes) {
        this.dateTime = dateTime;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Post() {
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title + "\n");
        stringBuilder.append(likes + " likes - " + dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
        stringBuilder.append(content + "\n" );
        stringBuilder.append("Comments: \n"  );

        for(Comment x : commentList){
            stringBuilder.append(x.getText() + "\n");
        }

        return  stringBuilder.toString();
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setComment(Comment comment) {
        this.commentList.add(comment);
    }
}
