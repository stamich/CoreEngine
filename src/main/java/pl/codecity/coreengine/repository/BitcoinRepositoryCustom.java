package pl.codecity.coreengine.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.codecity.coreengine.model.Bitcoin;

public interface BitcoinRepositoryCustom {

    Page<Bitcoin> search(Pageable pageable);
}
