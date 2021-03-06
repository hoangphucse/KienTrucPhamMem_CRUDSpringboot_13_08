package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_token")
@Getter
@Setter
public class Token extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(length = 1000)
    private String token;

    private Date tokenExpDate;

}