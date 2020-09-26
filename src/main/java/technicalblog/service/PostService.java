package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

    public PostService() {
        System.out.println("Post Service");
    }

    public ArrayList<Post> getAllPosts() {
        Post post1 = new Post();
        post1.setTitle("Post1");
        post1.setBody("Post1 Body");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post2");
        post2.setBody("Post2 Body");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post3");
        post3.setBody("Post3 Body");
        post3.setDate(new Date());

        ArrayList<Post> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }

    public ArrayList<Post> getOnePost() {
        ArrayList<Post> posts = new ArrayList<>();
        Post post = new Post();
        post.setTitle("Technical Analysis");
        post.setBody("Very Important");
        post.setDate(new Date());
        posts.add(post);
        return posts;
    }
}
