package pl.codecity.coreengine.model;

import javax.persistence.*;

@Entity
@Table(name = "monero_data")
@DataDescriptor(isReady = false, description = "Monero", dataId = 4)
public class MoneroData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "volume_daily")
    private double volumeDaily;

    @Column
    private CryptoTrend trend;
}
