package com.jbj.bean;

import com.jbj.enums.BaseEnum;

import java.util.Date;

public class Build {
	private Integer bId;
	private String bName;
	private String bDvpcompany;
	private String bProvince;
	private String bCity;
	private String bArea;
	private String bDesigncompany;
	private String bSightcompany;
	private String bPmcompany;
	private String bSg;
	private BaseEnum bIschoice;
	private String bDelivery;
	private String bPeriods;
	private String bIngnm;
	private String bTaskStatus;
	private Date bDate;
	private Integer bPhotosCount;
	private Integer bFillType;
	private Integer bPhotos;
	private Integer bFillPhotos;
	private Integer bEditors;
	private Integer bNoEditors;

	public Build() {
	}

	public Build(Integer bId, String bName, String bDvpcompany, String bProvince, String bCity, String bArea, String bDesigncompany, String bSightcompany, String bPmcompany, String bSg, BaseEnum bIschoice, String bDelivery, String bPeriods, String bIngnm, String bTaskStatus, Date bDate, Integer bPhotosCount, Integer bFillType, Integer bPhotos, Integer bFillPhotos, Integer bEditors, Integer bNoEditors) {
		this.bId = bId;
		this.bName = bName;
		this.bDvpcompany = bDvpcompany;
		this.bProvince = bProvince;
		this.bCity = bCity;
		this.bArea = bArea;
		this.bDesigncompany = bDesigncompany;
		this.bSightcompany = bSightcompany;
		this.bPmcompany = bPmcompany;
		this.bSg = bSg;
		this.bIschoice = bIschoice;
		this.bDelivery = bDelivery;
		this.bPeriods = bPeriods;
		this.bIngnm = bIngnm;
		this.bTaskStatus = bTaskStatus;
		this.bDate = bDate;
		this.bPhotosCount = bPhotosCount;
		this.bFillType = bFillType;
		this.bPhotos = bPhotos;
		this.bFillPhotos = bFillPhotos;
		this.bEditors = bEditors;
		this.bNoEditors = bNoEditors;
	}

	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbDvpcompany() {
		return bDvpcompany;
	}

	public void setbDvpcompany(String bDvpcompany) {
		this.bDvpcompany = bDvpcompany;
	}

	public String getbProvince() {
		return bProvince;
	}

	public void setbProvince(String bProvince) {
		this.bProvince = bProvince;
	}

	public String getbCity() {
		return bCity;
	}

	public void setbCity(String bCity) {
		this.bCity = bCity;
	}

	public String getbArea() {
		return bArea;
	}

	public void setbArea(String bArea) {
		this.bArea = bArea;
	}

	public String getbDesigncompany() {
		return bDesigncompany;
	}

	public void setbDesigncompany(String bDesigncompany) {
		this.bDesigncompany = bDesigncompany;
	}

	public String getbSightcompany() {
		return bSightcompany;
	}

	public void setbSightcompany(String bSightcompany) {
		this.bSightcompany = bSightcompany;
	}

	public String getbPmcompany() {
		return bPmcompany;
	}

	public void setbPmcompany(String bPmcompany) {
		this.bPmcompany = bPmcompany;
	}

	public String getbSg() {
		return bSg;
	}

	public void setbSg(String bSg) {
		this.bSg = bSg;
	}

	public BaseEnum getbIschoice() {
		return bIschoice;
	}

	public void setbIschoice(BaseEnum bIschoice) {
		this.bIschoice = bIschoice;
	}

	public String getbDelivery() {
		return bDelivery;
	}

	public void setbDelivery(String bDelivery) {
		this.bDelivery = bDelivery;
	}

	public String getbPeriods() {
		return bPeriods;
	}

	public void setbPeriods(String bPeriods) {
		this.bPeriods = bPeriods;
	}

	public String getbIngnm() {
		return bIngnm;
	}

	public void setbIngnm(String bIngnm) {
		this.bIngnm = bIngnm;
	}

	public String getbTaskStatus() {
		return bTaskStatus;
	}

	public void setbTaskStatus(String bTaskStatus) {
		this.bTaskStatus = bTaskStatus;
	}

	public Date getbDate() {
		return bDate;
	}

	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}

	public Integer getbPhotosCount() {
		return bPhotosCount;
	}

	public void setbPhotosCount(Integer bPhotosCount) {
		this.bPhotosCount = bPhotosCount;
	}

	public Integer getbFillType() {
		return bFillType;
	}

	public void setbFillType(Integer bFillType) {
		this.bFillType = bFillType;
	}

	public Integer getbPhotos() {
		return bPhotos;
	}

	public void setbPhotos(Integer bPhotos) {
		this.bPhotos = bPhotos;
	}

	public Integer getbFillPhotos() {
		return bFillPhotos;
	}

	public void setbFillPhotos(Integer bFillPhotos) {
		this.bFillPhotos = bFillPhotos;
	}

	public Integer getbEditors() {
		return bEditors;
	}

	public void setbEditors(Integer bEditors) {
		this.bEditors = bEditors;
	}

	public Integer getbNoEditors() {
		return bNoEditors;
	}

	public void setbNoEditors(Integer bNoEditors) {
		this.bNoEditors = bNoEditors;
	}

	@Override
	public String toString() {
		return "Build{" +
				"bId=" + bId +
				", bName='" + bName + '\'' +
				", bDvpcompany='" + bDvpcompany + '\'' +
				", bProvince='" + bProvince + '\'' +
				", bCity='" + bCity + '\'' +
				", bArea='" + bArea + '\'' +
				", bDesigncompany='" + bDesigncompany + '\'' +
				", bSightcompany='" + bSightcompany + '\'' +
				", bPmcompany='" + bPmcompany + '\'' +
				", bSg='" + bSg + '\'' +
				", bIschoice='" + bIschoice + '\'' +
				", bDelivery='" + bDelivery + '\'' +
				", bPeriods='" + bPeriods + '\'' +
				", bIngnm='" + bIngnm + '\'' +
				", bTaskStatus='" + bTaskStatus + '\'' +
				", bDate=" + bDate +
				", bPhotosCount=" + bPhotosCount +
				", bFillType=" + bFillType +
				", bPhotos=" + bPhotos +
				", bFillPhotos=" + bFillPhotos +
				", bEditors=" + bEditors +
				", bNoEditors=" + bNoEditors +
				'}';
	}
}
