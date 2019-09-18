package pl.codecity.coreengine.model;

import javax.persistence.*;

@Entity
@Table(name = "ethereum_data")
@DataDescriptor(isReady = false, description = "Ethereum", dataId = 2)
public class EthereumData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "volume_daily")
    private double volumeDaily;

    @Column
    private CryptoTrend trend;
}
