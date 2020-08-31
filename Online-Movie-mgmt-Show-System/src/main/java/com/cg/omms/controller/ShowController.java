package com.cg.omms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.omms.entity.Movie;
import com.cg.omms.entity.Show;
import com.cg.omms.exception.ShowException;
import com.cg.omms.service.ShowService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ShowController {
	
	@Autowired
	ShowService showService;
	
	@GetMapping("show/{sid}")
	public ResponseEntity<Show> findShow(@PathVariable("sid")int showId) throws ShowException
	{
		Show show = null;
		
		show = showService.findShow(showId);
		 ResponseEntity<Show> re = new ResponseEntity<Show>(show,HttpStatus.OK);
		 return re;
	}
	@PostMapping("show")
    public ResponseEntity<Show> addShow(@RequestBody  Show show) throws ShowException{
    	Show s = showService.createShow(show);
    	ResponseEntity<Show> re = new ResponseEntity<Show>(s,HttpStatus.OK);
		 return re;
    }
	@PutMapping("show")
    public ResponseEntity<Show> updateShow(@RequestBody  Show show) throws ShowException{
    	Show s = showService.updateShow(show);
    	ResponseEntity<Show> re = new ResponseEntity<Show>(s,HttpStatus.OK);
		 return re;
    }
	@DeleteMapping("show/{sid}")
    public ResponseEntity<Show> deleteShow(@PathVariable("sid")int sid) throws ShowException{
    	Show s = showService.deleteShow(sid);
    	ResponseEntity<Show> re = new ResponseEntity<Show>(s,HttpStatus.OK);
		 return re;
    }
	@GetMapping("show")
	public ResponseEntity<List<Show>> findAllShows() throws ShowException{
		List<Show> list = showService.listAllShows();
		ResponseEntity<List<Show>> re = new ResponseEntity<List<Show>>(list,HttpStatus.OK);
		 return re;
	}
	@GetMapping("show/movie")
	public ResponseEntity<List<Movie>> findAllMovies() throws ShowException{
		List<Movie> list = showService.listAllMovies();
		ResponseEntity<List<Movie>> re = new ResponseEntity<List<Movie>>(list,HttpStatus.OK);
		 return re;
	}
}
