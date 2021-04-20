package org.nebenkosten.db;

import org.nebenkosten.model.entities.NebenkostenEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NebenkostenRepository extends CrudRepository<NebenkostenEntity, Long> {

	List<NebenkostenEntity> findByMietobjektId(Long mietobjektId);
}
