package com.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "TB_Tickets")
public class Tackets {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select seq_plan.nextval from dual")
	private Integer Ticketid;
	private String Ticketname;
	private Integer Stadiumid;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date Begintime;
	private Integer Totalcount;
	private Integer Ordercount;
	private Integer Price;
	private String Descn;
	public Integer getTicketid() {
		return Ticketid;
	}
	public void setTicketid(Integer ticketid) {
		Ticketid = ticketid;
	}
	public String getTicketname() {
		return Ticketname;
	}
	public void setTicketname(String ticketname) {
		Ticketname = ticketname;
	}
	public Integer getStadiumid() {
		return Stadiumid;
	}
	public void setStadiumid(Integer stadiumid) {
		Stadiumid = stadiumid;
	}
	public Date getBegintime() {
		return Begintime;
	}
	public void setBegintime(Date begintime) {
		Begintime = begintime;
	}
	public Integer getTotalcount() {
		return Totalcount;
	}
	public void setTotalcount(Integer totalcount) {
		Totalcount = totalcount;
	}
	public Integer getOrdercount() {
		return Ordercount;
	}
	public void setOrdercount(Integer ordercount) {
		Ordercount = ordercount;
	}
	public Integer getPrice() {
		return Price;
	}
	public void setPrice(Integer price) {
		Price = price;
	}
	public String getDescn() {
		return Descn;
	}
	public void setDescn(String descn) {
		Descn = descn;
	}
	public Tackets(String ticketname, Integer stadiumid, Date begintime, Integer totalcount, Integer ordercount,
			Integer price, String descn) {
		super();
		Ticketname = ticketname;
		Stadiumid = stadiumid;
		Begintime = begintime;
		Totalcount = totalcount;
		Ordercount = ordercount;
		Price = price;
		Descn = descn;
	}
	public Tackets() {
		super();
	}
	@Override
	public String toString() {
		return "Tackets [Ticketid=" + Ticketid + ", Ticketname=" + Ticketname + ", Stadiumid=" + Stadiumid
				+ ", Begintime=" + Begintime + ", Totalcount=" + Totalcount + ", Ordercount=" + Ordercount + ", Price="
				+ Price + ", Descn=" + Descn + "]";
	}
	
}
