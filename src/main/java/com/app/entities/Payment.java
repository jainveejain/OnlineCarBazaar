package com.app.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
public class Payment extends BaseEntity {

	private String payment_type;

	private String payment_status;
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "user_id",referencedColumnName = "id")
//	private User user;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "order_id",referencedColumnName = "id")
//	private Order order;

}
