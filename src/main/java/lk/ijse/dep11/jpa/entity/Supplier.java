package lk.ijse.dep11.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "supplier")
public class Supplier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, length = 500)
    private String address;

    @ManyToMany
    @JoinTable(name = "supplier_item",
            joinColumns = @JoinColumn(name = "supplier_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "code", referencedColumnName = "code"))
    private Set<Item> itemSet;

    public Supplier(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
