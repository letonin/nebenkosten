package org.nebenkosten.db;

import org.nebenkosten.model.dto.NebenkostenDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NebenkostenRepository extends CrudRepository<NebenkostenDTO, Long> {

	List<NebenkostenDTO> findByMietobjektId(Long mietobjektId);
}
