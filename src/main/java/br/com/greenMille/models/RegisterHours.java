package br.com.greenMille.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class RegisterHours {
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)  
	private Integer id;
	private LocalDateTime timeInitial;
	private LocalDateTime timeFinal;
	
	@OneToOne(targetEntity=User.class, fetch=FetchType.EAGER)
    @JoinColumn(name="userId")
	private Integer userId;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getTimeInitial() {
		return timeInitial;
	}
	public void setTimeInitial(LocalDateTime timeInitial) {
		this.timeInitial = timeInitial;
	}
	public LocalDateTime getTimeFinal() {
		return timeFinal;
	}
	public void setTimeFinal(LocalDateTime timeFinal) {
		this.timeFinal = timeFinal;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}	

}
