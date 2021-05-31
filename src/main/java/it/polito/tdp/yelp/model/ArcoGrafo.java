package it.polito.tdp.yelp.model;

public class ArcoGrafo {
	
	private String businessId1 ;
	private String businessId2 ;
	private double peso ;
	
	public ArcoGrafo(String businessId1, String businessId2, double peso) {
		super();
		this.businessId1 = businessId1;
		this.businessId2 = businessId2;
		this.peso = peso;
	}

	public String getBusinessId1() {
		return businessId1;
	}

	public void setBusinessId1(String businessId1) {
		this.businessId1 = businessId1;
	}

	public String getBusinessId2() {
		return businessId2;
	}

	public void setBusinessId2(String businessId2) {
		this.businessId2 = businessId2;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
