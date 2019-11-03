package pl.codecity.coreengine.service;

import pl.codecity.coreengine.model.Bitcoin;
import pl.codecity.coreengine.model.CryptoTrend;

public interface BitcoinService {

    Bitcoin findOneById(Long id);
    Long countByTrend(CryptoTrend trend);
    void deleteById(Long id);
}
