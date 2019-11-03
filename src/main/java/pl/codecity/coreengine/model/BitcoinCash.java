package pl.codecity.coreengine.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "bitcoin_cash_data")
@DataDescriptor(isReady = false, description = "Bitcoin", dataId = 1001)
public class BitcoinCash extends AbstractDomainObject<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "volume_daily")
    private double volumeDaily;

    @Column
    private CryptoTrend trend;

    // Getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getVolumeDaily() {
        return volumeDaily;
    }

    public void setVolumeDaily(double volumeDaily) {
        this.volumeDaily = volumeDaily;
    }

    public CryptoTrend getTrend() {
        return trend;
    }

    public void setTrend(CryptoTrend trend) {
        this.trend = trend;
    }

    //

    @Override
    public String print() {
        return "Bitcoin: " + " " + getVolumeDaily() + " trend: " + getTrend();
    }
}
