package main;

public class Country{
	
	private String countryName;
	private long area;
	private long population;
	private long density;
		public Country(){
	}
		
	public Country(String countryName,long area,long population,long density){
		this.countryName=countryName;	
		this.area=area;
		this.population=population;
		this.density=density;
	}

		
	public void setCountryName(String countryName){
		this.countryName=countryName;
	}


	public String getCountryName(){
		return this.countryName;
	}


	public void setCountryArea(long area){
		this.area=area;
	}


	public long getCountryArea(){
		return this.area;
	}


	public void setCountryPopulation(long population){
		this.population=population;
	}


	public long getCountryPopulation(){
		return population;
	}


	public void setCountryDensity(long density){
		this.density=density;
	}


	public long getCountryDensity(){
		return this.density;
	}


	public int largestArea(Country []country){
		
		long maxArea=0;
		int index=0;
		for(int i=0;i<country.length;i++){
			if(country[i].area>maxArea){
				maxArea=country[i].area;
				index=i;
				
			}
			
		}
		return index;
	    
	}


	public int largestPopulation(Country []country){
		
		long maxPopulation=0;
		int index=0;
		for(int i=0;i<country.length;i++){
			if(country[i].population>maxPopulation){
				maxPopulation=country[i].population;
				index=i;
				
			}
			
		}
		return index;
	    
	}

	
	public int largestPopulationDensity(Country []country){
		
		long maxPopulationDensity=country[0].population/country[0].area;
		int index=0;
		for(int i=1;i<country.length;i++){
			long temporary=country[i].population/country[i].area;
			if(temporary>maxPopulationDensity){
				maxDensity=temporary;
				index=i;
				
			}
			
		}
		return index;
	    
	}


	
}