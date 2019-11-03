package pl.codecity.coreengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.codecity.coreengine.model.Bitcoin;
import pl.codecity.coreengine.model.CryptoTrend;

@Repository
public interface BitcoinRepository extends JpaRepository<Bitcoin, Long> {

    @Query("SELECT b FROM Bitcoin b WHERE b.id =:id")
    Bitcoin findOneById(Long id);

    @Query("SELECT COUNT (Bitcoin.trend) FROM Bitcoin b WHERE b.trend =:trend")
    Long countByTrend(CryptoTrend trend);

    @Query("DELETE FROM Bitcoin b WHERE b.id =:id")
    void deleteById(Long id);
}
