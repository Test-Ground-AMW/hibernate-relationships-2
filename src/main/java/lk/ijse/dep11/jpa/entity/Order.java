package lk.ijse.dep11.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "`order`")
public class Order implements Serializable {
    @Id
    private int id;
    @Column(nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(nullable = false, name = "customer_id", referencedColumnName = "id")
    private Customer customer;

}
