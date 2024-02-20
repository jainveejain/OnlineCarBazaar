package com.app.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class TestDriveBooking extends BaseEntity {

	@Column(length = 40)
	private String vehicle;
	@Column(length = 40)
	private String varient;
	@Column
	private Date schedule_date;
	@Column(length = 100)
	private String delivery_address;
//	
////	@ManyToOne(fetch = FetchType.EAGER)
////	@JoinColumn(name = "userId")
////	private User user;
//	

}
