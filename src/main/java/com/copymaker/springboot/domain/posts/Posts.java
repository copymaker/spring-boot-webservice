package com.copymaker.springboot.domain.posts;

import com.copymaker.springboot.domain.BaseTimeEntity;

import javax.persistence.*;

@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    public Posts() {
    }

    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static Posts.PostsBuilder builder() {
        return new Posts.PostsBuilder();
    }

    public static class PostsBuilder {
        private String title;
        private String content;
        private String author;

        public PostsBuilder() {
        }

        public Posts.PostsBuilder title(String title) {
            this.title = title;
            return this;
        }

        public Posts.PostsBuilder content(String content) {
            this.content = content;
            return this;
        }

        public Posts.PostsBuilder author(String author) {
            this.author = author;
            return this;
        }

        public Posts build() {
            return new Posts(title, content, author);
        }
    }
}
