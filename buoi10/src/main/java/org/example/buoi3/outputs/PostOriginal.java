package org.example.buoi3.outputs;

public class PostOriginal {
    private String content;
    private Long id;
    private UserDataOutput userOriginal;

    public PostOriginal() {
    }

    public PostOriginal(String content, Long id, UserDataOutput userOriginal) {
        this.content = content;
        this.id = id;
        this.userOriginal = userOriginal;
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

    public UserDataOutput getUserOriginal() {
        return userOriginal;
    }

    public void setUserOriginal(UserDataOutput userOriginal) {
        this.userOriginal = userOriginal;
    }
}
