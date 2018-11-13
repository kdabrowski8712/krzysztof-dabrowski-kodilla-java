package com.kodilla.testing.forum;

public class ForumPost {
    private String postBody;
    private String aurhor;

    public ForumPost(String postBody, String aurhor) {
        this.postBody = postBody;
        this.aurhor = aurhor;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return aurhor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumPost forumPost = (ForumPost) o;

        if (!postBody.equals(forumPost.postBody)) return false;
        return aurhor.equals(forumPost.aurhor);
    }

    @Override
    public int hashCode() {
        int result = postBody.hashCode();
        result = 31 * result + aurhor.hashCode();
        return result;
    }
}
