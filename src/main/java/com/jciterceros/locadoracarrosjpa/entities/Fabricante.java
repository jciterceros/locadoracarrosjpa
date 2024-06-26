package com.jciterceros.locadoracarrosjpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString(exclude = {"modelos", "carro"})
@Table(name = "tb_fabricante")
public class Fabricante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL", unique = true)
    private String nome;

    @OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Modelo> modelos = new ArrayList<>();

    @OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Carro> carro = new HashSet<>();

}
