package com.cg.omms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.omms.dao.ShowDao;
import com.cg.omms.entity.Movie;
import com.cg.omms.entity.Show;
import com.cg.omms.exception.ShowException;

@Service
public class ShowServiceImpl implements ShowService{
	
		@Autowired
		ShowDao showDao;

	@Override
	public Show findShow(int showId) throws ShowException {
		Show show  = showDao.findShow(showId);
		if(show == null) 
		{
			throw new ShowException(showId+" ID Not Found");
		}
		return show;
		
	}

	@Override
	public Show createShow(Show show) throws ShowException {
		
		showDao.createShow(show);
		return show;
	}

	@Override
	public Show updateShow(Show show) throws ShowException {
		if(showDao.findShow(show.getShowId())!=null)
		{
			showDao.updateShow(show);
		}
		else
		{
			throw new ShowException(show.getShowId()+" ID Not Found");
		}
		return show;
		
	}

	@Override
	public Show deleteShow(int showId) throws ShowException {
		
		Show show  = showDao.deleteShow(showId);
		if(show == null)
		{
			throw new ShowException(showId+" ID Not Found");	
		}
		return show;
	}

	@Override
	public List<Show> listAllShows() throws ShowException {
		List<Show> list = showDao.listAllShows();
		if(list.isEmpty())
		{
			throw new ShowException("Empty Records ");
		}
		return list;
	}

	@Override
	public List<Movie> listAllMovies() throws ShowException {
		List<Movie> list = showDao.listAllMovies();
		if(list.isEmpty())
		{
			throw new ShowException("Empty Records ");
		}
		return list;
	}

}
