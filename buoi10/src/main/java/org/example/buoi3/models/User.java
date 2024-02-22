package org.example.buoi3.models;

import jakarta.persistence.*;
import org.example.buoi3.models.base.BaseEntity;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "name")
    @Nationalized
    private String name;

    @Column(name = "avatar")
    private String avatar;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User() {
    }

    public User(String name, String avatar, List<Post> posts) {
        this.name = name;
        this.avatar = avatar;
        this.posts = posts;
    }

    public User(Long id, Long createBy, LocalDateTime createAt, Long updateBy, LocalDateTime updateAt, Boolean status, String name, String avatar, List<Post> posts) {
        super(id, createBy, createAt, updateBy, updateAt, status);
        this.name = name;
        this.avatar = avatar;
        this.posts = posts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
