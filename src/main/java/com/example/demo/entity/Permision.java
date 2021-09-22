package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "t_permission")
public class Permision extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String permissionName;

    private String permissionKey;
}
