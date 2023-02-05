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
@Table(name = "roles", schema = "store_db")
public class Role {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "created_date", nullable = false)
    private Instant createdDate;

    @NotNull
    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;

    @Size(max = 60)
    @NotNull
    @Column(name = "role_description", nullable = false, length = 60)
    private String roleDescription;

    @Size(max = 25)
    @NotNull
    @Column(name = "role_name", nullable = false, length = 25)
    private String roleName;

    @Column(name = "role_number", columnDefinition = "TINYINT UNSIGNED not null")
    private Short roleNumber;
}