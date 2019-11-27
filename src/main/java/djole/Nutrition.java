package djole;

import java.io.Serializable;
import java.util.List;

public class Nutrition implements Serializable{
	private static final long serialVersionUID = 5520565486505239495L;
	
	private DailyValues dailyValues;
	private List<Food> foodList;
	
	public Nutrition() {
		
	}

	public Nutrition(DailyValues dailyValues, List<Food> foodList) {
		this.dailyValues = dailyValues;
		this.foodList = foodList;
	}

	public DailyValues getDailyValues() {
		return dailyValues;
	}

	public void setDailyValues(DailyValues dailyValues) {
		this.dailyValues = dailyValues;
	}

	public List<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}

	@Override
	public String toString() {
		return "Nutrition [dailyValues=" + dailyValues + ", foodList=" + foodList + "]";
	}
	
	
	

}
