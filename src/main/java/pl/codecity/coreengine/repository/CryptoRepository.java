package pl.codecity.coreengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.codecity.coreengine.model.CryptoData;
import pl.codecity.coreengine.model.CryptoTrend;

import java.util.SortedSet;

@Repository
public interface CryptoRepository extends JpaRepository<CryptoData, Long> {

    @Query("SELECT c FROM CryptoData c WHERE c.id =:id")
    CryptoData findOneById(Long id);

    @Query("SELECT c FROM CryptoData c WHERE c.trends =:trends")
    CryptoData findByTrends(SortedSet<CryptoTrend> trends);
}
