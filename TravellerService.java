package com.chan.frstsprgboot.service;

import java.util.List;
import java.util.Optional;

import com.chan.frstprgboot.entity.ForeignTour;
import com.chan.frstprgboot.entity.LocalTour;
import com.chan.frstprgboot.entity.Traveller;

public interface TravellerService {
	public Traveller addTraveller(Traveller traveller);
	public LocalTour saveLocalTourRequest(LocalTour localTour);
	public ForeignTour saveForeignTourRequest(ForeignTour foreignTour);
	
	public List<Traveller> listAllTravellers();
	public Optional<Traveller> searchbyTravellerId(Long tid);
	public Traveller searchbyTravellerName(String tname);
	

}
