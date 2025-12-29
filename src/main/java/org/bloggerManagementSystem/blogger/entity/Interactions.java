package org.bloggerManagementSystem.blogger.entity;

import jakarta.persistence.*;
import org.bloggerManagementSystem.blogger.entity.enums.InteractionType;

import java.time.LocalDateTime;

@Entity
@Table(name = "interactions")
public class Interactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interactionID")
    private Long interactionID;

    @ManyToOne
    @JoinColumn(name = "blogID", referencedColumnName = "blogID")
    private Blog blog;

    @ManyToOne
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "commentID", referencedColumnName = "commentID")
    private Comment comment; // Nullable, for interactions on comments

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private InteractionType type; // e.g., "LIKE", "SHARE"

    @Column(name = "reactionTimestamp")
    private LocalDateTime reactionTimestamp;


    public Interactions() {
    }

    public Interactions(Long interactionID, Blog blog, User user, Comment comment, InteractionType type, LocalDateTime reactionTimestamp) {
        this.interactionID = interactionID;
        this.blog = blog;
        this.user = user;
        this.comment = comment;
        this.type = type;
        this.reactionTimestamp = reactionTimestamp;
    }

}
