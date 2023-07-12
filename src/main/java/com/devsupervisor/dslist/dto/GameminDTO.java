package com.devsupervisor.dslist.dto;

import com.devsupervisor.dslist.entities.Game;


public class GameminDTO {
	private long id;
	private String title;
	private int year;
    private String platforms;
	private String imgUrl;
	private String shortDescription;

	public GameminDTO() {
		
	}

	public GameminDTO(Game entity) {
		super();
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		platforms = entity.getPlatforms();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public String getPlatforms() {
		return platforms;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
		
	}

	
}
