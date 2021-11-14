package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "t_comment")
public class Discuss {

    @Id
    private Integer id;
    private String content;
    private String author;
    @Column(name = "a_id")
    private Integer aId;


}