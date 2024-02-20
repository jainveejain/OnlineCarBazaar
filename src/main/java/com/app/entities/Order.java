package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Table(name = "vehicle_order")
public class Order extends BaseEntity {

	@Column(length = 40)
	private int vehicle_id;
	
	@Column(precision=10)
	private double final_price;
	
	@Column(length = 100)
	private String delivery_address;
	
	@Column
	private int varient_id;
	
//	@OneToOne(mappedBy = "order")
//	private Payment payment;
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId")
//	private User user;

}
