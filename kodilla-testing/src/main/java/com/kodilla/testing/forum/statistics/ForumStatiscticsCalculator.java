package com.kodilla.testing.forum.statistics;

public class ForumStatiscticsCalculator {
    private int userCount = 0;
    private int postCount = 0;
    private int commentCount = 0;
    private double averagePostCountPerUser = 0.0;
    private double averageCommentCountPerUser = 0.0;
    private double averageCommentCountPerPost = 0.0;



    public void calculateAdvStatistics(Statistics statistics) {
        this.userCount = statistics.usersNames().size();
        this.commentCount = statistics.commentsCount();
        this.postCount = statistics.postsCount();

        if(this.userCount !=0 ) {
            this.averagePostCountPerUser = (double)postCount/(double)userCount;
            this.averageCommentCountPerUser = (double)commentCount/(double)userCount;
        }
        if(postCount!=0) {
            this.averageCommentCountPerPost = (double)commentCount/(double)postCount;
        }
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAveragePostCountPerUser() {
        return averagePostCountPerUser;
    }

    public double getAverageCommentCountPerUser() {
        return averageCommentCountPerUser;
    }

    public double getAverageCommentCountPerPost() {
        return averageCommentCountPerPost;
    }

    @Override
    public String toString() {
        return "Post count: " + postCount + "\n" +
                "Comment count: " + commentCount + "\n" +
                "Users count: " + userCount + "\n" +
                "Average posts per user: " + averagePostCountPerUser + "\n" +
                "Average comments per user: " + averageCommentCountPerUser + "\n" +
                "Average comments per post: " + averageCommentCountPerPost ;
    }
}
