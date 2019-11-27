package djole;

import java.io.Serializable;

public class DailyValues implements Serializable {
	private static final long serialVersionUID = -4924755885132449180L;
	
	private Integer totalFat;
	private String totalFatUnits;
	private Integer saturatedFat;
	private String saturatedFatUnits;
	private Integer cholesterol;
	private String cholesterolUnits;
	private Integer sodium;
	private String sodiumUnits;
	private Integer carb;
	private String carbUnits;
	private Integer fiber;
	private String fiberUnits;
	private Integer protein;
	private String proteinUnits;
	
	public DailyValues() {
		
	}

	public DailyValues(Integer totalFat, String totalFatUnits, Integer saturatedFat, String saturatedFatUnits,
			Integer cholesterol, String cholesterolUnits, Integer sodium, String sodiumUnits, Integer carb,
			String carbUnits, Integer fiber, String fiberUnits, Integer protein, String proteinUnits) {
		this.totalFat = totalFat;
		this.totalFatUnits = totalFatUnits;
		this.saturatedFat = saturatedFat;
		this.saturatedFatUnits = saturatedFatUnits;
		this.cholesterol = cholesterol;
		this.cholesterolUnits = cholesterolUnits;
		this.sodium = sodium;
		this.sodiumUnits = sodiumUnits;
		this.carb = carb;
		this.carbUnits = carbUnits;
		this.fiber = fiber;
		this.fiberUnits = fiberUnits;
		this.protein = protein;
		this.proteinUnits = proteinUnits;
	}

	public Integer getTotalFat() {
		return totalFat;
	}

	public void setTotalFat(Integer totalFat) {
		this.totalFat = totalFat;
	}

	public String getTotalFatUnits() {
		return totalFatUnits;
	}

	public void setTotalFatUnits(String totalFatUnits) {
		this.totalFatUnits = totalFatUnits;
	}

	public Integer getSaturatedFat() {
		return saturatedFat;
	}

	public void setSaturatedFat(Integer saturatedFat) {
		this.saturatedFat = saturatedFat;
	}

	public String getSaturatedFatUnits() {
		return saturatedFatUnits;
	}

	public void setSaturatedFatUnits(String saturatedFatUnits) {
		this.saturatedFatUnits = saturatedFatUnits;
	}

	public Integer getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(Integer cholesterol) {
		this.cholesterol = cholesterol;
	}

	public String getCholesterolUnits() {
		return cholesterolUnits;
	}

	public void setCholesterolUnits(String cholesterolUnits) {
		this.cholesterolUnits = cholesterolUnits;
	}

	public Integer getSodium() {
		return sodium;
	}

	public void setSodium(Integer sodium) {
		this.sodium = sodium;
	}

	public String getSodiumUnits() {
		return sodiumUnits;
	}

	public void setSodiumUnits(String sodiumUnits) {
		this.sodiumUnits = sodiumUnits;
	}

	public Integer getCarb() {
		return carb;
	}

	public void setCarb(Integer carb) {
		this.carb = carb;
	}

	public String getCarbUnits() {
		return carbUnits;
	}

	public void setCarbUnits(String carbUnits) {
		this.carbUnits = carbUnits;
	}

	public Integer getFiber() {
		return fiber;
	}

	public void setFiber(Integer fiber) {
		this.fiber = fiber;
	}

	public String getFiberUnits() {
		return fiberUnits;
	}

	public void setFiberUnits(String fiberUnits) {
		this.fiberUnits = fiberUnits;
	}

	public Integer getProtein() {
		return protein;
	}

	public void setProtein(Integer protein) {
		this.protein = protein;
	}

	public String getProteinUnits() {
		return proteinUnits;
	}

	public void setProteinUnits(String proteinUnits) {
		this.proteinUnits = proteinUnits;
	}

	@Override
	public String toString() {
		return "DailyValues [totalFat=" + totalFat + ", totalFatUnits=" + totalFatUnits + ",\nsaturatedFat="
				+ saturatedFat + ", saturatedFatUnits=" + saturatedFatUnits + ",\ncholesterol=" + cholesterol
				+ ", cholesterolUnits=" + cholesterolUnits + ",\nsodium=" + sodium + ", sodiumUnits=" + sodiumUnits
				+ ",\ncarb=" + carb + ", carbUnits=" + carbUnits + ",\nfiber=" + fiber + ", fiberUnits=" + fiberUnits
				+ ",\nprotein=" + protein + ", proteinUnits=" + proteinUnits + "]";
	}
	
	
	
	

}
