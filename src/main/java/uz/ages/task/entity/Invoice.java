package uz.ages.task.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Invoice")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "ord_id")
    private Order order;

    @Column(name = "amount", nullable = false, precision = 5, scale = 4)
    private Double amount;

    @Column(name = "issued", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date issued;

    @Column(name = "due", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date due;

}

