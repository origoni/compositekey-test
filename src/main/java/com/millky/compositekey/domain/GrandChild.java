package com.millky.compositekey.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
@IdClass(GrandChildId.class)
public class GrandChild {
	@Id
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "PARENT_ID"), @JoinColumn(name = "CHILD_ID"), })
	private Child child;

	@Id
	@Column(name = "GRANDCHILD_ID")
	private String id;

	private String name;
}
