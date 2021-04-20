package org.nebenkosten.service;

import org.mapstruct.Mapper;
import org.nebenkosten.model.Nebenkosten;
import org.nebenkosten.model.entities.NebenkostenEntity;

@Mapper(componentModel = "spring")
public interface NebenkostenMapper {

	Nebenkosten mapNebenkostenDTOToNebenkosten(NebenkostenEntity nebenkostenEntity);

	NebenkostenEntity mapNebenkostenToNebenkostenDTO(Nebenkosten nebenkosten);
}
