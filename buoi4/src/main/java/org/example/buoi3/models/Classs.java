package org.example.buoi3.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "class")
public class Classs {
    //danh dau la 1 id
    @Id
    // dinh nghia cac thuoc tinh cho id do, vi du ten, unique
    @Column(name = "id",unique = true)
    // giup id tu dong tang
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @Nationalized
    private String name;

    @Column(name = "grade")
    @Nationalized
    private String grade;
}
