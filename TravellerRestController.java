package com.chan.frstsprgboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chan.frstprgboot.entity.ForeignTour;
import com.chan.frstprgboot.entity.LocalTour;
import com.chan.frstprgboot.entity.Traveller;
import com.chan.frstsprgboot.repo.TravellerRepository;
import com.chan.frstsprgboot.service.TravellerService;

@RestController
public class TravellerRestController {
	

	@Autowired
	TravellerRepository travellerRepository;
	
	@Autowired
	TravellerService travellerService;
	
	@GetMapping("/welcome")
	public String helloAppln() {
		return "Hi Traveller";
	}
	
	@PostMapping("/addtraveller")	
	public Traveller addTraveller(@RequestBody Traveller traveller) {
		return travellerService.addTraveller(traveller);
	}

	
	@PostMapping("/requestlocaltour")
	
	public LocalTour saveLocalTourRequest(@RequestBody LocalTour localTour) {
		return travellerService.saveLocalTourRequest(localTour);
	}

	//@PreAuthorize("hasAuthority('FC')")
	@PostMapping("/requestforeigntour")
	
	public ForeignTour saveForeignTourRequest(@RequestBody ForeignTour foreignTour) {
		System.out.println("****** From Controller Foreign ******" + foreignTour);
		return travellerService.saveForeignTourRequest(foreignTour);
	}
	
	@GetMapping("/listtravellers")

	public List<Traveller> listAllTravellers() {

		return travellerService.listAllTravellers();
	}
	
	@GetMapping("/findbytid/{tid}")
	public Optional<Traveller> searchbyTravellerId(@PathVariable Long tid){
		return travellerService.searchbyTravellerId(tid);
		
	}
	
	@GetMapping("/findbytname/{tname}")
	public Traveller searchbyTravellerName(@PathVariable String tname){
		return travellerService.searchbyTravellerName(tname);
		
	}
	
	@GetMapping("/login")	
	public ResponseEntity<Traveller> loginrest(@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password) {
		System.out.println("*******This is a login rest controller ***********");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Traveller traveller = travellerRepository.findByTravellerName(auth.getName());
		System.out.println("After Login__________________"
				+ "send back to Angular or postman as response__________________" + traveller);
		return ResponseEntity.ok(traveller);
	}
}
