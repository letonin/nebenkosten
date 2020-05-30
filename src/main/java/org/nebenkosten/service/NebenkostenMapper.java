package org.nebenkosten.service;

import org.mapstruct.Mapper;
import org.nebenkosten.model.Nebenkosten;
import org.nebenkosten.model.dto.NebenkostenDTO;

@Mapper(componentModel = "spring")
public interface NebenkostenMapper {

	Nebenkosten mapNebenkostenDTOToNebenkosten(NebenkostenDTO nebenkostenDTO);

	NebenkostenDTO mapNebenkostenToNebenkostenDTO(Nebenkosten nebenkosten);
}
