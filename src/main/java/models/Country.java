package models;

/*
 * DATA TRANSFER MODEL (DTO)
 */
public class Country {

	private String name;
	private int population;
	 
	  
    public static Country of(    // STATIC FACTORY METHOD
    		String name, 
    		int population) {
    	
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
        
    }
    
    
    public void setName(String name) {
    	this.name = name;
    }
    public void setPopulation(int pop) {
    	this.population = pop;
    }
    public String getName() {
    	return this.name;
    }
    public int getPopulation() {
    	return this.population;
    }
    
	
}
