package org.nebenkosten.controller;

import org.nebenkosten.db.MietobjektRepository;
import org.nebenkosten.model.Mietobjekt;
import org.nebenkosten.model.entities.MietobjektEntity;
import org.nebenkosten.service.MietobjektMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("mietobjekt")
public class MietobjektController {

	@Autowired
	private MietobjektRepository mietobjektRepository;

	@Autowired
	private MietobjektMapper mietobjektMapper;

	@PostMapping()
	public Long saveMietobjekt(@RequestBody Mietobjekt mietobjekt) {
		MietobjektEntity mietobjektEntity = mietobjektMapper.mapMietobjektToMietobjektDTO(mietobjekt);
		return mietobjektRepository.save(mietobjektEntity).getId();
	}

	@GetMapping()
	public List<Mietobjekt> getMietobjekte() {
		List<Mietobjekt> mietobjektList = new ArrayList<>();
		mietobjektRepository.findAll().forEach(mietobjektEntity -> {
			Mietobjekt mietobjekt = mietobjektMapper.mapMietobjektDTOToMietobjekt(mietobjektEntity);
			mietobjektList.add(mietobjekt);
		});
		return mietobjektList;
	}
}
