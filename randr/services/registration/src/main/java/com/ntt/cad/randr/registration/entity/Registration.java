package com.ntt.cad.randr.registration.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import lombok.Getter;
import lombok.Setter;

@Entity(name="registration")
@Table(name="registration")
@AllArgsConstructor
@NoArgsConstructor
public class Registration {

	@Id
	@SequenceGenerator(name="registration_generator", sequenceName="registration_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="registration_generator")
	@Column(name="id")
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="orgname")
	@Setter @Getter private String orgName;
	
	@Column(name="orgaddress")
	@Setter @Getter private String orgAddress;
	
	@Column(name="orgcity")
	@Setter @Getter private String orgCity;
	
	@Column(name="orgstate")
	@Setter @Getter private String orgState;
	
	@Column(name="orgpin")
	@Setter @Getter private String orgPin;
	
	@Column(name="contactperson")
	@Setter @Getter private String contactPerson;
	
	@Column(name="contactemail")
	@Setter @Getter private String contactEmail;
	
	@Column(name="contactphone")
	@Setter @Getter private String contactPhone;
	
	@Column(name="empcount")
	@Setter @Getter private String empCount;
	
	@Column(name="orgindustry")
	@Setter @Getter private String orgIndustry;
	
	@Column(name="currentstatus")
	@Setter @Getter private String currentStatus;
	
	
}
