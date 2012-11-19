package com.awesome.turtlenecksandgotos.testbox.persistence;

import java.net.URI;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class PackageEntity extends BaseEntity {
	private URI fileSet;
	private String name;
	@ManyToOne(fetch=FetchType.LAZY)
	private AccountEntity ownedBy;
	private String version;
	
	public URI getFileSet() {
		return fileSet;
	}
	
	public void setFileSet(URI fileSet) {
		this.fileSet = fileSet;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public AccountEntity getOwnedBy() {
		return ownedBy;
	}
	
	public void setOwnedBy(AccountEntity ownedBy) {
		this.ownedBy = ownedBy;
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
}
