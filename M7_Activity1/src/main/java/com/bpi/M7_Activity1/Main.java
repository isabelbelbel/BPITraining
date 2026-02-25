package com.bpi.M7_Activity1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;


public class Main {
	
	private static final Logger logger =  LoggerFactory.getLogger(Main.class);
	private static final ObjectMapper mapper = new ObjectMapper();
	 
    public static void main(String[] args) {

        EntityManager em = EntityManagerUtil.getInstance().createEntityManager();
    	
        // initialize movieRepository
    	MovieRepository movieRepository = new MovieRepository(em);
    	
    	 // Start server on port 4567 (default)
        port(4567);
        
        // add routes here

        // Get Profile List
        get("/movies", (req, res) -> {
            res.type("application/json");
            return mapper.writeValueAsString(movieRepository.findAll());
        });
        post("/movies", (req, res) -> {
            res.type("application/json");
            try {
                Movie movie = mapper.readValue(req.body(), Movie.class);

                movieRepository.save(movie);

                res.status(201); // Created
                return mapper.writeValueAsString(movie);              
                
                
            } catch (Exception e) {
                logger.error("Error saving movie", e);
                res.status(400); // Bad Request
                Map<String, String> error = new HashMap<>();
                error.put("error", "Invalid movie data");
                return mapper.writeValueAsString(error);
            }
        });

        
        // Create Profile List ??????? luh
        
    }
    
    

}
