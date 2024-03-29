package com.ottugi.curry.domain.recipe;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Recipe {

    @Id
    @Column(name = "Recipe_Id")
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(nullable = false)
    private String thumbnail;

    @Column(length = 100, nullable = false)
    private String time;

    @Column(length = 100, nullable = false)
    private String difficulty;

    @Column(length = 100, nullable = false)
    private String composition;

    @Column(nullable = false)
    private String ingredients;

    @Column(nullable = false)
    private String seasoning;

    @Column(length = 1000, nullable = false)
    private String orders;

    @Column(length = 1000)
    private String photo;

    @Builder
    public Recipe(Long id, String name, String thumbnail, String time, String difficulty, String composition, String ingredients, String seasoning, String orders, String photo) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.time = time;
        this.difficulty = difficulty;
        this.composition = composition;
        this.ingredients = ingredients;
        this.seasoning = seasoning;
        this.orders = orders;
        this.photo = photo;
    }
}
