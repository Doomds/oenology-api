package entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

@Entity
@Table(name = "vin")
public class Wine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Subcategory subcategoryId;

    @Column(name = "nom", nullable = false)
    @Size(min = 3, max = 120)
    private String wineName;

    @Column(name = "description")
    private String wineDescription;

    @Column(name = "accords_culinaires")
    private String culinaryPairing;

    @Column(name = "garde")
    private String aging;

    @Column(name = "nombre_bouteille", nullable = false)
    @Size(min = 1, max = 32)
    private Integer numberOfBottles;

    @Column(name = "contenance_bouteille", nullable = false)
    @Size(min = 10, max = 500)
    private Integer capacityOfBottle;

    @Column(name = "prix_indicatif_bouteille", nullable = false)
    @Size(min = 0, max = 10000)
    private BigDecimal bottlePrice;

    @Column(name = "prix_indicatif_caisse", nullable = false)
    @Size(min = 0, max = 10000)
    private BigDecimal boxOfBottlesPrice;

    public Wine() {
    }

    public Integer getId() {
        return id;
    }

    public Subcategory getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Subcategory subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public String getWineName() {
        return wineName;
    }

    public void setWineName(String wineName) {
        this.wineName = wineName;
    }

    public String getWineDescription() {
        return wineDescription;
    }

    public void setWineDescription(String wineDescription) {
        this.wineDescription = wineDescription;
    }

    public String getCulinaryPairing() {
        return culinaryPairing;
    }

    public void setCulinaryPairing(String culinaryPairing) {
        this.culinaryPairing = culinaryPairing;
    }

    public String getAging() {
        return aging;
    }

    public void setAging(String aging) {
        this.aging = aging;
    }

    public Integer getNumberOfBottles() {
        return numberOfBottles;
    }

    public void setNumberOfBottles(Integer numberOfBottles) {
        this.numberOfBottles = numberOfBottles;
    }

    public Integer getCapacityOfBottle() {
        return capacityOfBottle;
    }

    public void setCapacityOfBottle(Integer capacityOfBottle) {
        this.capacityOfBottle = capacityOfBottle;
    }

    public BigDecimal getBottlePrice() {
        return bottlePrice;
    }

    public void setBottlePrice(BigDecimal bottlePrice) {
        this.bottlePrice = bottlePrice;
    }

    public BigDecimal getBoxOfBottlesPrice() {
        return boxOfBottlesPrice;
    }

    public void setBoxOfBottlesPrice(BigDecimal boxOfBottlesPrice) {
        this.boxOfBottlesPrice = boxOfBottlesPrice;
    }
}
