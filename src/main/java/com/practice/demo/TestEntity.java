package com.practice.demo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_2")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer value;
}
