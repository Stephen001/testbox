package com.awesome.turtlenecksandgotos.testbox.persistence;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class AccountEntity extends BaseEntity {
	private String accountName;
	@OneToMany(mappedBy="ownedBy")
	private Set<PackageEntity> deployments;
	private String email;
	@OneToMany(mappedBy="ownedBy")
	private Set<PackageEntity> packages;
	private byte[] passwordHash;
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public Set<PackageEntity> getDeployments() {
		return deployments;
	}

	public void setDeployments(Set<PackageEntity> deployments) {
		this.deployments = deployments;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Set<PackageEntity> getPackages() {
		return packages;
	}
	
	public void setPackages(Set<PackageEntity> packages) {
		this.packages = packages;
	}
	
	public byte[] getPasswordHash() {
		return passwordHash;
	}
	
	public void setPasswordHash(byte[] passwordHash) {
		this.passwordHash = passwordHash;
	}
}
