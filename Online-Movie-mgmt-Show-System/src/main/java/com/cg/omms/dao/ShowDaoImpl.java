package com.cg.omms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.omms.entity.Movie;
import com.cg.omms.entity.Show;
import com.cg.omms.exception.ShowException;

@Repository
@Transactional
public class ShowDaoImpl implements ShowDao{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Show findShow(int showId) throws ShowException {
		
		Show show = entityManager.find(Show.class, showId);
		return show;
	}

	@Override
	public Show createShow(Show show) throws ShowException {
		
		entityManager.persist(show);
		return show;
	}

	@Override
	public Show updateShow(Show show) throws ShowException {

		entityManager.merge(show);
		return show;
	}

	@Override
	public Show deleteShow(int showId) throws ShowException {
		
		Show show = entityManager.find(Show.class, showId);
		if(show != null) 
		{
			entityManager.remove(show);
		}
		return show;
		
	}

	@Override
	public List<Show> listAllShows() throws ShowException {
		
		String qry ="Select s From Show s";
		TypedQuery<Show> query = entityManager.createQuery(qry,Show.class);
		List<Show> list = query.getResultList();
		return list;
		
	}

	@Override
	public List<Movie> listAllMovies() throws ShowException {
		String qry ="Select m from Movie m";
		TypedQuery<Movie> query = entityManager.createQuery(qry, Movie.class);
		List<Movie> list = query.getResultList();
		return list;
	}

}
