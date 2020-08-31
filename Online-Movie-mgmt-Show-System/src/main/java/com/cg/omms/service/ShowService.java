package com.cg.omms.service;

import java.util.List;

import com.cg.omms.entity.Movie;
import com.cg.omms.entity.Show;
import com.cg.omms.exception.ShowException;

public interface ShowService {
	
	public Show findShow(int showId) throws ShowException;
	public Show createShow(Show show) throws ShowException;
	public Show updateShow(Show show) throws ShowException;
	public Show deleteShow(int showId) throws ShowException;
	public List<Show> listAllShows() throws ShowException;
	public List<Movie> listAllMovies() throws ShowException;

}
