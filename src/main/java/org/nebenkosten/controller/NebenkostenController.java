package org.nebenkosten.controller;

import org.nebenkosten.db.NebenkostenRepository;
import org.nebenkosten.model.Nebenkosten;
import org.nebenkosten.model.entities.NebenkostenEntity;
import org.nebenkosten.service.NebenkostenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("nebenkosten")
public class NebenkostenController {

	@Autowired
	private NebenkostenRepository nebenkostenRepository;

	@Autowired
	private NebenkostenMapper nebenkostenMapper;

	@PostMapping()
	public void saveNebenkosten(@RequestBody Nebenkosten nebenkosten) {
		NebenkostenEntity nebenkostenEntity = nebenkostenMapper.mapNebenkostenToNebenkostenDTO(nebenkosten);
		nebenkostenEntity.getVerbrauchsstellen()
				.forEach(verbrauchsstelle -> verbrauchsstelle.setNebenkosten(nebenkostenEntity));
		nebenkostenRepository.save(nebenkostenEntity);
	}

	@GetMapping()
	public List<Nebenkosten> getNebenkosten(@RequestParam Long mietobjektId) {
		List<Nebenkosten> nebenkostenList = new ArrayList<>();
		for (NebenkostenEntity nebenkostenEntity : nebenkostenRepository.findByMietobjektId(mietobjektId)) {
			Nebenkosten nebenkosten = nebenkostenMapper.mapNebenkostenDTOToNebenkosten(nebenkostenEntity);
			Collections.sort(nebenkosten.getVerbrauchsstellen());
			nebenkostenList.add(nebenkosten);
		}
		Collections.sort(nebenkostenList);
		return nebenkostenList;
	}
}
