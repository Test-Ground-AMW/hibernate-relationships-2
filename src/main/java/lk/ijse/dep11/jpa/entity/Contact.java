package lk.ijse.dep11.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contact")
public class Contact implements Serializable {
    @Id
    @Column(nullable = false, length = 15)
    private String telephone;

    @ManyToOne
    @JoinColumn(nullable = false, name = "supplier_id", referencedColumnName = "id")
    private Supplier supplier;


}
