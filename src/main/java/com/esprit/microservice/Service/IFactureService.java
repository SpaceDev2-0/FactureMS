package com.esprit.microservice.Service;

import java.util.List;

import javax.xml.ws.Response;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.esprit.microservice.Entity.Facture;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;






public interface IFactureService {


	Facture addFacture(Facture s);
    List<Facture> getAllFactures();

	Facture updateFacture(Facture s);
	// ResponseEntity<String> deleteHotel(int id);
	void deleteFacture(int id);
	
}
