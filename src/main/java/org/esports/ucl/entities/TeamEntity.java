package org.esports.ucl.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "TEAMS")
@EntityListeners(AuditingEntityListener.class)
public class TeamEntity implements Serializable {

	private static final long serialVersionUID = -4300858722179495842L;

	@Id
	private String id;
	
	@NotBlank
	@Column(nullable = false, unique = true)
	private String name;
	
	@NotBlank
	@Column(nullable = false)
	private String country;
	
	@CreatedDate
	@Column(nullable = false)
	private LocalDateTime createdAt;
	
	@LastModifiedDate
	@Column(nullable = false)
	private LocalDateTime updatedAt;
	
	public TeamEntity() {
		super();
	}

	public TeamEntity(String id, String name, String country, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
