package pl.codecity.coreengine.model;

import org.hibernate.annotations.SortNatural;

import javax.persistence.*;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Michal Stawarski
 */
@Entity
@Table(name = "CryptoData")
@DataDescriptor(isReady = false, description = "Main data class", dataId = 100)
public class CryptoData extends AbstractDomainObject<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    private String currency;

//    @Column
//    private CryptoSymbol symbol;

    @SortNatural
    @ElementCollection
    @JoinTable(name = "crypto_symbol")
    @Enumerated(EnumType.STRING)
    @Column(name = "symbol")
    private SortedSet<CryptoSymbol> symbols = new TreeSet<>();

    @Column
    private double price;

    @Column
    private double exchangeRate;

    @Column
    private double circulatingSupply;

    @Column
    private double volume;

    @SortNatural
    @ElementCollection
    @JoinTable(name = "crypto_trend")
    @Enumerated(EnumType.STRING)
    @Column(name = "trend")
    private SortedSet<CryptoTrend> trends = new TreeSet<>();

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String print() {
        return "Currency: " + getId() + " " + getSymbols().toString() + " is worth: " + getPrice() + " USD" + " " + getTrends();
    }

    // Getters and setters

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public SortedSet<CryptoSymbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(SortedSet<CryptoSymbol> symbols) {
        this.symbols = symbols;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public SortedSet<CryptoTrend> getTrends() {
        return trends;
    }

    public void setTrends(SortedSet<CryptoTrend> trends) {
        this.trends = trends;
    }
}
