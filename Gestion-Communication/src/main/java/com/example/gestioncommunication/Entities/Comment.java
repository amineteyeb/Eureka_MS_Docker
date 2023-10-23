package com.example.gestioncommunication.Entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;




@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Comment")
public class Comment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComm;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    private LocalDate createdAt;
    private String description;
    private String sujet;

    private int upvotes;

    private int downvotes;

    private int reports;
    private Boolean archive;
    private Boolean is_a_post;

    private Boolean is_parent;
    @Column(insertable = false, updatable = false)
    private Long parent_id;

    private boolean is_edited;

    private Long id_previous;
    @JsonIgnore
    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> subComments;
 private long iduser;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    @JsonIgnore
    private Comment parent;
    @JsonIgnore


    public void like() {
        this.upvotes++;
    }

    public void dislike() {
        this.downvotes++;
    }
    public void report() {
        this.reports++;
    }
    public boolean containsBadWords() {
        return BadWordsFilter.containsBadWords(description);
    }
    // constructors, getters, and setters


}
