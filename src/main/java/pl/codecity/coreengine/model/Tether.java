package pl.codecity.coreengine.model;

import javax.persistence.*;

@Entity
@Table(name = "tether_data")
@DataDescriptor(isReady = false, description = "Tether", dataId = 5)
public class Tether {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "volume_daily")
    private double volumeDaily;

    @Column
    private CryptoTrend trend;
}
