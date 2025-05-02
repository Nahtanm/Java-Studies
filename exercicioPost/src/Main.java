import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Post post1 = new Post(LocalDateTime.parse("2018-06-21T13:05:44"), "Traveling New Zealand", "I'm going to visit this wonderful contry!", 12);
        Post post2 = new Post(LocalDateTime.parse("2018-07-28T23:14:41"), "Good night guys", "See you tomorrow", 5);

        Comment comment1 = new Comment("Have a rice trip");
        Comment comment2 = new Comment("Wow that's awesome");
        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the force be with you");

        post1.setComment(comment1);
        post1.setComment(comment2);
        post2.setComment(comment3);
        post2.setComment(comment4);

        System.out.println(post1);
        System.out.println(post2);

    }
}