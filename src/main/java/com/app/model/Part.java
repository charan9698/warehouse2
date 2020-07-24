package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="part_tab")
public class Part {

	@Id
	@GeneratedValue(generator = "part_pop")
	@SequenceGenerator(name = "part_pop",sequenceName = "part_pop")
@Column(name="part_id_col")
	private Integer id;
	@Column(name="part_name_col")	
	private String partName;
	@Column(name="part_code_col")
	private String partCode;
	@Column(name="part_mode_col")
	private String partMode;
}
