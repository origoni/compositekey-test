package com.millky.compositekey.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import org.springframework.data.domain.Persistable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@IdClass(GrandChildId.class)
public class GrandChild implements Persistable<GrandChildId> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2176188994089050217L;

	@Id
	@ManyToOne
	@JsonBackReference
	@JoinColumns({ @JoinColumn(name = "PARENT_ID"), @JoinColumn(name = "CHILD_ID"), })
	private Child child;

	@Id
	@Column(name = "GRANDCHILD_ID")
	private String gid;

	private String name;

	@Override
	@JsonBackReference
	public boolean isNew() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@JsonBackReference
	public GrandChildId getId() {
		// TODO Auto-generated method stub
		// return null;
		return new GrandChildId(new ChildId(child.getParent().getId(), child.getChildId()), this.gid);
	}
}
