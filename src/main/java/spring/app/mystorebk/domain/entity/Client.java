package spring.app.mystorebk.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clients", schema = "store_db")
public class Client {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "born_date", nullable = false)
    private Instant bornDate;

    @Size(max = 16)
    @NotNull
    @Column(name = "code", nullable = false, length = 16)
    private String code;

    @NotNull
    @Column(name = "created_date", nullable = false)
    private Instant createdDate;

    @Size(max = 60)
    @NotNull
    @Column(name = "email", nullable = false, length = 60)
    private String email;

    @Size(max = 30)
    @NotNull
    @Column(name = "first_name", nullable = false, length = 30)
    private String firstName;

    @Size(max = 25)
    @NotNull
    @Column(name = "identity_number", nullable = false, length = 25)
    private String identityNumber;

    @Size(max = 25)
    @NotNull
    @Column(name = "identity_type", nullable = false, length = 25)
    private String identityType;

    @NotNull
    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;

    @Size(max = 30)
    @NotNull
    @Column(name = "last_name", nullable = false, length = 30)
    private String lastName;

    @Size(max = 60)
    @NotNull
    @Column(name = "password", nullable = false, length = 60)
    private String password;
}