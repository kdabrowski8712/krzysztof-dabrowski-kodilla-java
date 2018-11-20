package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Forum {
    private final List<ForumUser> users = new LinkedList<>();

    public  Forum() {
        users.add(new ForumUser( 1,"johny1",'M',LocalDate.of(1990,11,17),10 ));
        users.add(new ForumUser( 2,"adam1",'M',LocalDate.of(2000,7,1),0 ));
        users.add(new ForumUser( 3,"jan4",'M',LocalDate.of(1995,1,10),5 ));
        users.add(new ForumUser( 4,"anna1",'K',LocalDate.of(2001,6,20),0 ));
        users.add(new ForumUser( 5,"beata1",'K',LocalDate.of(1991,2,15),10 ));
    }

    public List<ForumUser> getUserList(){
        return new LinkedList<>(users);
    }
}
