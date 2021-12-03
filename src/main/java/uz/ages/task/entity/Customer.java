package uz.ages.task.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Order> orders;

    @Column(name = "name", nullable = false, length = 14)
    private String name;

    @Column(name = "country", nullable = false, length = 3)
    private String country;

    @Column(name = "text")
    private String text;

    @Column(name = "phone", length = 50)
    private String phone;
}

