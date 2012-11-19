package com.awesome.turtlenecksandgotos.testbox.persistence;

import java.net.URI;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class DeploymentEntity extends AccountEntity {
	@OneToMany(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	private List<String> arguments;
	@ManyToOne(fetch=FetchType.LAZY)
	private PackageEntity deployedFrom;
	private URI location;
	@ManyToOne(fetch=FetchType.LAZY)
	private AccountEntity ownedBy;
	private String name;
	private int port;
	private DeploymentStatus status;
	private WorldSecurityStatus worldSecurity;
	
	public List<String> getArguments() {
		return arguments;
	}
	
	public void setArguments(List<String> arguments) {
		this.arguments = arguments;
	}
	
	public PackageEntity getDeployedFrom() {
		return deployedFrom;
	}
	
	public void setDeployedFrom(PackageEntity deployedFrom) {
		this.deployedFrom = deployedFrom;
	}
	
	public URI getLocation() {
		return location;
	}
	
	public void setLocation(URI location) {
		this.location = location;
	}
	
	public AccountEntity getOwnedBy() {
		return ownedBy;
	}
	
	public void setOwnedBy(AccountEntity ownedBy) {
		this.ownedBy = ownedBy;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	public DeploymentStatus getStatus() {
		return status;
	}
	
	public void setStatus(DeploymentStatus status) {
		this.status = status;
	}

	public WorldSecurityStatus getWorldSecurity() {
		return worldSecurity;
	}

	public void setWorldSecurity(WorldSecurityStatus worldSecurity) {
		this.worldSecurity = worldSecurity;
	}
}
