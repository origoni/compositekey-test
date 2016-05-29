package com.millky.compositekey.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GrandChildId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4907305489457272882L;

	private ChildId child;
	private String gid;
}
