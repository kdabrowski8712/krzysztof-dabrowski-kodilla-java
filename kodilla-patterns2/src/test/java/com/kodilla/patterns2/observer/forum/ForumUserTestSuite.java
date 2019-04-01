package com.kodilla.patterns2.observer.forum;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {

    @Test
    public void testUpdate() {

        //Given
        ForumTopic javaHelperForum = new JavaHelperForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();

        //When

        ForumUser johnSmirh = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Icone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelperForum.registerObserver(johnSmirh);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelperForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //Then

        javaHelperForum.addPost("post1");
        javaHelperForum.addPost("post2");
        javaToolsForum.addPost("post3");
        javaHelperForum.addPost("post4");
        javaToolsForum.addPost("post5");

        Assert.assertEquals(2,ivoneEscobar.getUpdateCount());


    }
}
