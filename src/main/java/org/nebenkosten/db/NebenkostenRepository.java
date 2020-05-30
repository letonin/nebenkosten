package org.nebenkosten.db;

import org.nebenkosten.model.dto.NebenkostenDTO;
import org.springframework.data.repository.CrudRepository;

public interface NebenkostenRepository extends CrudRepository<NebenkostenDTO, Long> {

}
