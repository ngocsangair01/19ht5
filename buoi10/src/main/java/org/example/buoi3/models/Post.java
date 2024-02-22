package org.example.buoi3.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.example.buoi3.models.base.BaseEntity;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDateTime;

@Entity
@Table(name = "post")
public class Post extends BaseEntity {


    @Column(name = "content")
    @Nationalized
    private String content;///

    @Column(name = "content_original")
    @Nationalized
    private String contentOriginal;///


    @Column(name = "id_user_original")
    private Long idUserOriginal;

    @Column(name = "id_original")
    private Long idOriginal;///

    @Column(name = "is_post")
    private Boolean isPost;///

    @ManyToOne
    @JoinColumn(name = "id_user")
    @JsonIgnore
    private User user;


    public Post() {
    }

    public Post(String content, String contentOriginal, Long idUserOriginal, Long idOriginal, Boolean isPost, User user) {
        this.content = content;
        this.contentOriginal = contentOriginal;
        this.idUserOriginal = idUserOriginal;
        this.idOriginal = idOriginal;
        this.isPost = isPost;
        this.user = user;
    }

    public Post(Long id, Long createBy, LocalDateTime createAt, Long updateBy, LocalDateTime updateAt, Boolean status, String content, String contentOriginal, Long idUserOriginal, Long idOriginal, Boolean isPost, User user) {
        super(id, createBy, createAt, updateBy, updateAt, status);
        this.content = content;
        this.contentOriginal = contentOriginal;
        this.idUserOriginal = idUserOriginal;
        this.idOriginal = idOriginal;
        this.isPost = isPost;
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentOriginal() {
        return contentOriginal;
    }

    public void setContentOriginal(String contentOriginal) {
        this.contentOriginal = contentOriginal;
    }

    public Long getIdUserOriginal() {
        return idUserOriginal;
    }

    public void setIdUserOriginal(Long idUserOriginal) {
        this.idUserOriginal = idUserOriginal;
    }

    public Boolean getIsPost() {
        return isPost;
    }

    public void setIsPost(Boolean post) {
        isPost = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getIdOriginal() {
        return idOriginal;
    }

    public void setIdOriginal(Long idOriginal) {
        this.idOriginal = idOriginal;
    }

}

