package spring.app.mystorebk.domain.entity;

import jakarta.persistence.*;
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
@Table(name = "products", schema = "store_db")
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 16)
    @NotNull
    @Column(name = "code", nullable = false, length = 16)
    private String code;

    @NotNull
    @Column(name = "created_date", nullable = false)
    private Instant createdDate;

    @Size(max = 120)
    @NotNull
    @Column(name = "description", nullable = false, length = 120)
    private String description;

    @Size(max = 35)
    @NotNull
    @Column(name = "maker", nullable = false, length = 35)
    private String maker;

    @Size(max = 35)
    @NotNull
    @Column(name = "name", nullable = false, length = 35)
    private String name;

    @NotNull
    @Column(name = "price", nullable = false)
    private Double price;

    @Size(max = 32)
    @NotNull
    @Column(name = "serial", nullable = false, length = 32)
    private String serial;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sub_category_id", nullable = false)
    private SubCategory subCategory;
}