package pl.codecity.coreengine.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bitcoin_cash_data")
@DataDescriptor(isReady = false, description = "Bitcoin", dataId = 1001)
public class BitcoinCashData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "volume_daily")
    private double volumeDaily;

    @Column
    private CryptoTrend trend;
}
