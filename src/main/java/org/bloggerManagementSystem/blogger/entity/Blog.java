package org.bloggerManagementSystem.blogger.entity;

import jakarta.persistence.*;
import org.bloggerManagementSystem.blogger.entity.enums.BlogStatus;
import org.bloggerManagementSystem.blogger.entity.enums.blogCategory;

import java.time.LocalDateTime;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blogID")
    private Long blogID;

    @ManyToOne
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    private User user;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content" , columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(name = "category", length = 100)
    @Enumerated(EnumType.STRING)
    private blogCategory category;

    @Lob
    @Column(name = "image", columnDefinition = "LONGBLOB")
    private byte[] image;

    @Column(name = "status", length = 50)
    @Enumerated(EnumType.STRING)
    private BlogStatus status; // DRAFT, PUBLISHED, ARCHIVED


    @Column(name = "publicationDate")
    private LocalDateTime publicationDate;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    public Blog() {
    }

    public Blog(Long blogID, User user, String title, String content, blogCategory category, byte[] image, BlogStatus status, LocalDateTime publicationDate, LocalDateTime updatedAt) {
        this.blogID = blogID;
        this.user = user;
        this.title = title;
        this.content = content;
        this.category = category;
        this.image = image;
        this.status = status;
        this.publicationDate = publicationDate;
        this.updatedAt = updatedAt;
    }

    public Long getBlogID() {
        return blogID;
    }

    public void setBlogID(Long blogID) {
        this.blogID = blogID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public blogCategory getCategory() {
        return category;
    }

    public void setCategory(blogCategory category) {
        this.category = category;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public BlogStatus getStatus() {
        return status;
    }

    public void setStatus(BlogStatus status) {
        this.status = status;
    }

    public LocalDateTime getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDateTime publicationDate) {
        this.publicationDate = publicationDate;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
