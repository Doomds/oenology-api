package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "avis")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Oenologist oenologistId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Wine wineId;

    @Column(name = "cote")
    private int quotation;

    public Review() {
    }

    public Integer getId() {
        return id;
    }

    public Oenologist getOenologistId() {
        return oenologistId;
    }

    public void setOenologistId(Oenologist oenologistId) {
        this.oenologistId = oenologistId;
    }

    public Wine getWineId() {
        return wineId;
    }

    public void setWineId(Wine wineId) {
        this.wineId = wineId;
    }

    public int getQuotation() {
        return quotation;
    }

    public void setQuotation(int quotation) {
        this.quotation = quotation;
    }
}
