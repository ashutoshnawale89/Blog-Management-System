package org.bloggerManagementSystem.blogger.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentID")
    private Long commentID;

    @ManyToOne
    @JoinColumn(name = "blogID", referencedColumnName = "blogID")
    private Blog blog;

    @ManyToOne
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    private User user;

    @Column(name = "content", columnDefinition = "TEXT", nullable = false)
    private String content;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    public Comment() {
    }

    public Comment(Long commentID, Blog blogID, User userID, String content, LocalDateTime createdAt) {
        this.commentID = commentID;
        this.blog = blogID;
        this.user = userID;
        this.content = content;
        this.createdAt = createdAt;
    }


}
