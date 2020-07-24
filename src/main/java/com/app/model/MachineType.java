package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "machine_tab")
@Entity
public class MachineType {
	
	@Id
	@Column(name = "mach_id_col")
	@GeneratedValue(generator = "machine_seq")
	@SequenceGenerator(name = "machine_tab",sequenceName = "machine_seqs")
	private Integer id;
	@Column(name = "mach_nam_col")
	private String machineName;
	@Column(name = "mach_mod_col")
	private String machineMode;
	@Column(name = "mach_sed_col")
	private String machineSeed;

}
