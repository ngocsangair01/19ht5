package org.example.buoi3.outputs;

public class PostDataOutput {
    private String content;
    private Long id;
    private UserDataOutput user;
    private PostOriginal postOriginal;
    private Boolean isPost;

    public PostDataOutput() {
    }

    public PostDataOutput(String content, Long id, UserDataOutput user, PostOriginal postOriginal, Boolean isPost) {
        this.content = content;
        this.id = id;
        this.user = user;
        this.postOriginal = postOriginal;
        this.isPost = isPost;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDataOutput getUser() {
        return user;
    }

    public void setUser(UserDataOutput user) {
        this.user = user;
    }

    public PostOriginal getPostOriginal() {
        return postOriginal;
    }

    public void setPostOriginal(PostOriginal postOriginal) {
        this.postOriginal = postOriginal;
    }

    public Boolean getIsPost() {
        return isPost;
    }

    public void setIsPost(Boolean post) {
        isPost = post;
    }


}
