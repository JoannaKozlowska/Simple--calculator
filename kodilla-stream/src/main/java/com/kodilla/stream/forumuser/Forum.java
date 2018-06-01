package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser>users = new ArrayList<>();
    public Forum (){
        users.add(new ForumUser(1, "Joanna", 'F',
                1997 , 10, 11, 21));
        users.add(new ForumUser(2, "Krzysztof", 'M',
                1994, 11, 3, 5));
        users.add(new ForumUser(3, "Jan", 'M',
                1980,1,1, 50));
        users.add(new ForumUser(4, "Radek", 'M',
                2000, 01, 01, 30));
        users.add(new ForumUser(5, "Wioleta", 'F',
                1980,6,14, 80));
    }
    public List<ForumUser>getUserList(){
        return new ArrayList<>(users);
    }
}
