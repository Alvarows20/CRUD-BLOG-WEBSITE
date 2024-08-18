package com.backend.model.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleContentDTO {

    private Long id;
    private String content;

    @JsonBackReference
    @JsonIgnore// Indica que esta es la parte 'hija' de la relación
    private ArticlesDTO article;
}