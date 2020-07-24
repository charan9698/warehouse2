package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "counter_tab")
public class Counter {
	@Id
	@Column(name = "coun_id_col")
	private Integer id;
	@Column(name = "coun_name_col")
	private String counterName;
	@Column(name = "coun_state_col")
	private String counterState;

}
