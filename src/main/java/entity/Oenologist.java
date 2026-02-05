package entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

@Entity
@Table(name = "oenologue")
public class Oenologist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nom", nullable = false, length = 120, unique = true)
    @Size(min = 3, max = 120)
    private String name;

    @Column(name = "indice_confiance")
    @DecimalMin("0.0")
    @DecimalMax("1.0")
    private BigDecimal trustIndex;

    @Column(name = "cotation_minimale")
    @Min(0)
    @Max(1000)
    private int minimumQuotation;

    @Min(0)
    @Max(1000)
    @Column(name = "cotation_maximale")
    private int maximumQuotation;

    public Oenologist() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTrustIndex() {
        return trustIndex;
    }

    public void setTrustIndex(BigDecimal trustIndex) {
        this.trustIndex = trustIndex;
    }

    public int getMinimumQuotation() {
        return minimumQuotation;
    }

    public void setMinimumQuotation(int minimumQuotation) {
        this.minimumQuotation = minimumQuotation;
    }

    public int getMaximumQuotation() {
        return maximumQuotation;
    }

    public void setMaximumQuotation(int maximumQuotation) {
        this.maximumQuotation = maximumQuotation;
    }
}
