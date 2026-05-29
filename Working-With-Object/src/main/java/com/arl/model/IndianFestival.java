package com.arl.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IndianFestival implements Serializable {

	private Integer fid;
	
	private String fname;
	
	private String season;
	
	private String dresscode;
}
