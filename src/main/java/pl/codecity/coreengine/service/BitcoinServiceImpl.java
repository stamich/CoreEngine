package pl.codecity.coreengine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.codecity.coreengine.model.Bitcoin;
import pl.codecity.coreengine.model.CryptoTrend;
import pl.codecity.coreengine.repository.BitcoinRepository;

@Service
@Transactional
public class BitcoinServiceImpl implements BitcoinService {

    private BitcoinRepository repository;

    @Autowired
    public BitcoinServiceImpl(BitcoinRepository repository) {
        this.repository = repository;
    }

    @Override
    public Bitcoin findOneById(Long id) {
        return null;
    }

    @Override
    public Long countByTrend(CryptoTrend trend) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
