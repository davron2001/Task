package uz.ages.task.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 10)
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(name = "description", length = 20)
    private String description;

    @Column(name = "price", nullable = false, precision = 5, scale = 4)
    private Double price;

    @Column(name = "photo", length = 1024)
    private String photo;

    @OneToMany(mappedBy = "product")
    private Set<Detail> details;
}
