package org.nebenkosten.service;

import org.mapstruct.Mapper;
import org.nebenkosten.model.Mietobjekt;
import org.nebenkosten.model.entities.MietobjektEntity;

@Mapper(componentModel = "spring")
public interface MietobjektMapper {

	Mietobjekt mapMietobjektDTOToMietobjekt(MietobjektEntity mietobjektEntity);

	MietobjektEntity mapMietobjektToMietobjektDTO(Mietobjekt mietobjekt);
}
