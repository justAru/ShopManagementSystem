package kz.iitu.midtermProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id",updatable = false,insertable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)

    @JsonIgnore
    private User user;
    @Column(name = "user_id")
    private Long userId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "item_id",updatable = false,insertable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)

    @JsonIgnore
    private Item item;
    @Column(name = "item_id")
    private Long itemId;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
