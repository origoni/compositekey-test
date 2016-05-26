package com.millky.compositekey.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class GrandChildId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4907305489457272882L;

	private ChildId child;
	private String id;
}
