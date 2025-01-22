package com.study.domain.post.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * Created by minkyukim
 * Created on 2025. 1. 21.
 **/

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {
    @Id
    @SequenceGenerator(
            name="post_id_seq_gen",
            sequenceName="post_id_seq",
            allocationSize=50
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_id_seq_gen")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Builder
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
