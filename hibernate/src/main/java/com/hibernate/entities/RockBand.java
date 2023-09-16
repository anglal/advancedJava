package com.hibernate.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/* 
 * 
 	create table Rock_Bands(
 	band_id MEDIUMINT NOT NULL AUTO_INCREMENT,
 	history_id MEDIUMINT,
 	band_name CHAR(30) NOT NULL,
 	PRIMARY KEY(band_id)
 */


@Entity
@Table(name = "Rock_Bands")
public class RockBand {
	
	
	//For sequence 
	//@GeneratedValue(strategy=GeneratedValue.SEQUENCE, generator="ROCK_BANDS_TR")
	//@SequenceGenerator(name="ROCK_BANDS_TR", sequenceName="band_id_seq", allocationSize=1)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "band_id", updatable = false, nullable = false)
	private Integer id;
	
	@Column(name = "band_name")
	private String bandName;
	
	public RockBand() {
		
	}
	
	public RockBand(String bandName) {
		this.bandName = bandName;
	}
	
	public RockBand(Integer id, String bandName) {
		this.id = id;
		this.bandName = bandName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bandName, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RockBand other = (RockBand) obj;
		return Objects.equals(bandName, other.bandName) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RockBand [id=");
		builder.append(id);
		builder.append(", bandName=");
		builder.append(bandName);
		builder.append("]");
		return builder.toString();
	}
	
}

