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
@Table(name = "`return`")
public class Return implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false, length = 500)
    private String reason;

    @OneToOne
    @JoinColumn(name = "order_id", nullable = false, referencedColumnName = "id", unique = true)
    private Order order;

    public Return(Date date, String reason, Order order) {
        this.date = date;
        this.reason = reason;
        this.order = order;
    }
}
