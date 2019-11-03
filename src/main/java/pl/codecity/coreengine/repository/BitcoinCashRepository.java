package pl.codecity.coreengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.codecity.coreengine.model.BitcoinCash;

@Repository
public interface BitcoinCashRepository extends JpaRepository<BitcoinCash, Long> {

    @Query("SELECT b FROM BitcoinCash b WHERE BitcoinCash.id =:id")
    BitcoinCash findOneById(Long id);
}
