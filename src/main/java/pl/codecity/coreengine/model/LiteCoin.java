package pl.codecity.coreengine.model;

import javax.persistence.*;

@Entity
@Table(name = "litecoin_data")
@DataDescriptor(isReady = false, description = "LiteCoin", dataId = 3)
public class LiteCoin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "volume_daily")
    private double volumeDaily;

    @Column
    private CryptoTrend trend;
}
