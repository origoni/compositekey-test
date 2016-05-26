package com.millky.compositekey.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class ChildId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -215408008703203549L;

	private String parent;
	private String childId;
}