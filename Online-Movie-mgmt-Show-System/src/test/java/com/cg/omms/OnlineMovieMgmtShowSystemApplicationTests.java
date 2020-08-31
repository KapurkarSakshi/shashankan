package com.cg.omms;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.omms.dao.ShowDao;
import com.cg.omms.entity.Show;
import com.cg.omms.exception.ShowException;

@SpringBootTest
class OnlineMovieMgmtShowSystemApplicationTests {

	@Autowired
	ShowDao showDao;
	
		@Test
		void testShowById() throws ShowException {
			Show show=showDao.findShow(1002);
			assertNotNull(show);
		}
		
		@Test
		void testNotShowById() throws ShowException {
			Show show=showDao.findShow(5054);
			assertNull(show);
		}
		
		@Test
		void testdeleteShowById() throws ShowException {
			Show show=showDao.deleteShow(1020);
			assertNull(show);
		}
		
		@Test
		void testList() throws ShowException
		{
			List<Show> show=showDao.listAllShows();
			assertNotNull(show);
		}
		
		
}

