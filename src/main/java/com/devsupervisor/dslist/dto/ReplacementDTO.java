package com.devsupervisor.dslist.dto;
// caminho da reposicao na lissta
public class ReplacementDTO {

	private int sourceIndex;
	private int destinationIndex;
	
	public int getsourceIndex() {
		return sourceIndex;
	}
	public void setSourceIndex(int sourceIndex) {
		this.sourceIndex = sourceIndex;
	}
	public int getDestinationIndex() {
		return destinationIndex;
	}
	public void setDestinationIndex(int destinationIndex) {
		this.destinationIndex = destinationIndex;
	}
	
}
