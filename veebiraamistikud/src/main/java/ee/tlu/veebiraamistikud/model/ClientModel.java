package ee.tlu.veebiraamistikud.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.*;

import java.time.Instant;


@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "client" , schema = "public")
@Where(clause = "deleted = false")
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "deleted")
    private Boolean deleted;

    @CreationTimestamp
    @Column(name = "created", updatable = false)
    private Instant created;

    //@JsonIgnore
    @UpdateTimestamp
    @Column(name = "edited")
    private Instant edited;

//    @PrePersist
//    protected void onCreate() { deleted = false; created = Instant.now(); edited = Instant.now(); }
//
//    @PreUpdate
//    protected void onUpdate() { edited = Instant.now(); }

}
