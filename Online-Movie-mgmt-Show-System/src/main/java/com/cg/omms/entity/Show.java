package com.cg.omms.entity;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="movie_show_tbl")
public class Show {
    @Id
	@GeneratedValue(generator = "myseq",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="myseq",sequenceName="onlinemovie_show_seq",allocationSize=1)
    @Column(name="show_id")
    private int showId;
    @Column(name="show_name", length=25)
    private String showName;
    @Column(name="seats")
    private int seats;
    @Column(name="show_date")
    private LocalDate showDate;
    @Column(name="screen_name", length=25)
    private String screenName;
    
   
    @ManyToOne
    @JoinColumn(name="movie_id", referencedColumnName = "movie_id")
    private Movie movie = new Movie();
//    @JsonIgnore
//	 @OneToMany(mappedBy = "show",cascade=CascadeType.REMOVE)

 
    public LocalDate getShowDate() {
        return showDate;
    }

 

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

 

    public int getShowId() {
        return showId;
    }

 

    public void setShowId(int showId) {
        this.showId = showId;
    }

 

    public String getShowName() {
        return showName;
    }

 

    public void setShowName(String showName) {
        this.showName = showName;
    }

 

    public int getSeats() {
        return seats;
    }

 

    public void setSeats(int seats) {
        this.seats = seats;
    }

 

    public String getScreenName() {
        return screenName;
    }

 

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

 

    public Movie getMovie() {
        return movie;
    }

 

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

 

    
    
    
    
    

 

}