package djole;

import java.io.Serializable;

public class Food implements Serializable {
	private static final long serialVersionUID = -5790693958275264215L;

	private String name;
	private Double serving;
	private String servingUnits;
	private Integer caloriesTotal;
	private Integer caloriesFat;
	private Double totalFat;
	private Double saturatedFat;
	private Integer cholesterol;
	private Integer sodium;
	private Integer carb;
	private Integer fiber;
	private Integer protein;
	private Integer vitaminA;
	private Integer vitaminC;
	private Integer mineralCa;
	private Integer mineralFe;

	public Food() {

	}

	public Food(String name, Double serving, String servingUnits, Integer caloriesTotal, Integer caloriesFat,
			Double totalFat, Double saturatedFat, Integer cholesterol, Integer sodium, Integer carb, Integer fiber,
			Integer protein, Integer vitaminA, Integer vitaminC, Integer mineralCa, Integer mineralFe) {
		this.name = name;
		this.serving = serving;
		this.servingUnits = servingUnits;
		this.caloriesTotal = caloriesTotal;
		this.caloriesFat = caloriesFat;
		this.totalFat = totalFat;
		this.saturatedFat = saturatedFat;
		this.cholesterol = cholesterol;
		this.sodium = sodium;
		this.carb = carb;
		this.fiber = fiber;
		this.protein = protein;
		this.vitaminA = vitaminA;
		this.vitaminC = vitaminC;
		this.mineralCa = mineralCa;
		this.mineralFe = mineralFe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getServing() {
		return serving;
	}

	public void setServing(Double serving) {
		this.serving = serving;
	}

	public String getServingUnits() {
		return servingUnits;
	}

	public void setServingUnits(String servingUnits) {
		this.servingUnits = servingUnits;
	}

	public Integer getCaloriesTotal() {
		return caloriesTotal;
	}

	public void setCaloriesTotal(Integer caloriesTotal) {
		this.caloriesTotal = caloriesTotal;
	}

	public Integer getCaloriesFat() {
		return caloriesFat;
	}

	public void setCaloriesFat(Integer caloriesFat) {
		this.caloriesFat = caloriesFat;
	}

	public Double getTotalFat() {
		return totalFat;
	}

	public void setTotalFat(Double totalFat) {
		this.totalFat = totalFat;
	}

	public Double getSaturatedFat() {
		return saturatedFat;
	}

	public void setSaturatedFat(Double saturatedFat) {
		this.saturatedFat = saturatedFat;
	}

	public Integer getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(Integer cholesterol) {
		this.cholesterol = cholesterol;
	}

	public Integer getSodium() {
		return sodium;
	}

	public void setSodium(Integer sodium) {
		this.sodium = sodium;
	}

	public Integer getCarb() {
		return carb;
	}

	public void setCarb(Integer carb) {
		this.carb = carb;
	}

	public Integer getFiber() {
		return fiber;
	}

	public void setFiber(Integer fiber) {
		this.fiber = fiber;
	}

	public Integer getProtein() {
		return protein;
	}

	public void setProtein(Integer protein) {
		this.protein = protein;
	}

	public Integer getVitaminA() {
		return vitaminA;
	}

	public void setVitaminA(Integer vitaminA) {
		this.vitaminA = vitaminA;
	}

	public Integer getVitaminC() {
		return vitaminC;
	}

	public void setVitaminC(Integer vitaminC) {
		this.vitaminC = vitaminC;
	}

	public Integer getMineralCa() {
		return mineralCa;
	}

	public void setMineralCa(Integer mineralCa) {
		this.mineralCa = mineralCa;
	}

	public Integer getMineralFe() {
		return mineralFe;
	}

	public void setMineralFe(Integer mineralFe) {
		this.mineralFe = mineralFe;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", serving=" + serving + ", servingUnits=" + servingUnits + ",\ncaloriesTotal="
				+ caloriesTotal + ", caloriesFat=" + caloriesFat + ",\ntotalFat=" + totalFat + ", saturatedFat="
				+ saturatedFat + ", cholesterol=" + cholesterol + ",\nsodium=" + sodium + ", carb=" + carb + ", fiber="
				+ fiber + ",\nprotein=" + protein + ", vitaminA=" + vitaminA + ", vitaminC=" + vitaminC + ",\nmineralCa="
				+ mineralCa + ", mineralFe=" + mineralFe + "]";
	}
	
	

}
