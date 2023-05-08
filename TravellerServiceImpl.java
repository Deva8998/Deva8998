package com.chan.frstsprgboot.service;

/*import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chan.frstprgboot.entity.ForeignTour;
import com.chan.frstprgboot.entity.LocalTour;
import com.chan.frstprgboot.entity.Traveller;
import com.chan.frstsprgboot.repo.ForeignTourRepository;
import com.chan.frstsprgboot.repo.LocalTourRepository;
import com.chan.frstsprgboot.repo.TravellerRepository;

@Service
public class TravellerServiceImpl implements TravellerService {
	
	@Autowired
	private TravellerRepository travellerRepository;
	@Autowired
	private LocalTourRepository localTourRepository;
	@Autowired
	private ForeignTourRepository foreignTourRepository;

	@Override
	public Traveller addTraveller(Traveller traveller) {
		
		return travellerRepository.save(traveller);
	}
	
	@Override
	public LocalTour saveLocalTourRequest(LocalTour localTour) {

		Traveller traveller = localTour.getTrtourist();
		localTour.setTrtourist(traveller);
		return localTourRepository.save(localTour);
	}

	@Override
	public ForeignTour saveForeignTourRequest(ForeignTour foreignTour) {
		System.out.println("-----------foreign Tour -------" +foreignTour);
		Traveller traveller = foreignTour.getTrtourist();
		foreignTour.setTrtourist(traveller);
		return foreignTourRepository.save(foreignTour);
	}
	
	@Override
	public List<Traveller> listAllTravellers() {

		return (List<Traveller>) travellerRepository.findAll();
	}

	@Override
	public Optional<Traveller> searchbyTravellerId(Long tid) {
		
		return travellerRepository.findById(tid);
	}

	@Override
	public Traveller searchbyTravellerName(String tname) {
		
		return travellerRepository.findByTravellerName(tname);
	}


}
*/

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chan.frstprgboot.entity.ForeignTour;
import com.chan.frstprgboot.entity.LocalTour;
import com.chan.frstprgboot.entity.Traveller;
import com.chan.frstsprgboot.repo.ForeignTourRepository;
import com.chan.frstsprgboot.repo.LocalTourRepository;
import com.chan.frstsprgboot.repo.TravellerRepository;



@Service
public class TravellerServiceImpl implements TravellerService {

	@Autowired
	private TravellerRepository travellerRepository;
	@Autowired
	private LocalTourRepository localTourRepository;
	@Autowired
	private ForeignTourRepository foreignTourRepository;

	@Override
	public Traveller addTraveller(Traveller traveller) {

		return travellerRepository.save(traveller);
	}

	@Override
	public List<Traveller> listAllTravellers() {

		return (List<Traveller>) travellerRepository.findAll();
	}

	@Override
	public LocalTour saveLocalTourRequest(LocalTour localTour) {

		Traveller traveller = localTour.getTrtourist();
		localTour.setTrtourist(traveller);
		return localTourRepository.save(localTour);
	}

	@Override
	public ForeignTour saveForeignTourRequest(ForeignTour foreignTour) {
		System.out.println("-----------foreign Tour -------" +foreignTour);
		Traveller traveller = foreignTour.getTrtourist();
		foreignTour.setTrtourist(traveller);
		return foreignTourRepository.save(foreignTour);
	}
	
	@Override
	public Optional<Traveller> searchbyTravellerId(Long tid) {
		
		return travellerRepository.findById(tid);
	}

	@Override
	public Traveller searchbyTravellerName(String tname) {
		
		return travellerRepository.findByTravellerName(tname);
	}
	

}
