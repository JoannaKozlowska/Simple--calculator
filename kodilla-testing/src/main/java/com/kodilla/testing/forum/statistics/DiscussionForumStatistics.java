package com.kodilla.testing.forum.statistics;

public class DiscussionForumStatistics {
   private int quantityOfPosts;
   private int quantityOfComments;
   private int numbersOfUsers;
   private double averagePostsForUser;
   private double averageCommentsForUser;
   private double averageCommentsforPost;
   private Statistics statistics;

    public DiscussionForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }
    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }
    public int getQuantityOfComments() {
        return quantityOfComments;
    }
    public int getNumbersOfUsers() {
        return numbersOfUsers;
    }
    public double getAveragePostsForUser() {
        return averagePostsForUser;
    }
    public double getAverageCommentsForUser() {
        return averageCommentsForUser;
    }
    public double getAverageCommentsforPost() {
        return averageCommentsforPost;
    }
    public void calculateAdvStatistics() {

        numbersOfUsers = statistics.usersNames().size();
        quantityOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();
        if (numbersOfUsers > 0) {
            averagePostsForUser = quantityOfPosts / numbersOfUsers;
            averageCommentsForUser = statistics.commentsCount() / numbersOfUsers;
        } else {
            averagePostsForUser =0;
            averageCommentsForUser =0;
        }
        if (quantityOfPosts>0) {
            averageCommentsforPost = quantityOfComments / quantityOfPosts;
        }else {
            averageCommentsforPost =0;
        }
    }
    public void showStatistics() {
        System.out.println("Number of users is: " + numbersOfUsers);
        System.out.println(" Number of posts is: " + quantityOfPosts);
        System.out.println(" Number of comments is:" + quantityOfComments);
        System.out.println("Average number of posts per user: " + averagePostsForUser);
        System.out.println("Average number of comments per user: " + averageCommentsForUser);
    }
}
