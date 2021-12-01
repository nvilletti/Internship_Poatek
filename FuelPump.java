

public class FuelPump {
	private fuelType fuelType;
	private double fuelPrice[];
	private double fuelQuantity[];
	
	public FuelPump() {
		fuelType = fuelType.STANDARD;
		fuelQuantity = new double[4];
		fuelPrice = new double[4];

	}
	
	public void setfuelType(fuelType fuelType) {
		this.fuelType = fuelType;
	}
	public fuelType getfuelType() {
		return fuelType;
	}	
	public void setfuelPrice(double fuelPrice) {
		this.fuelPrice[getFuelTypeId()] = fuelPrice;		
	}	
	public double getfuelPrice() {
		return fuelPrice[getFuelTypeId()];
	}
	public void setfuelQuantity(double fuelQuantity) {
			if(fuelQuantity < 0) {
				System.out.println("Fuel quantity can not be negative");	
			}else {
				this.fuelQuantity[getFuelTypeId()] = fuelQuantity;}
	}
	public double getfuelQuantity() {
		return fuelQuantity[getFuelTypeId()];
	}
	public double fillWithPrice(double fPrice) {
		if(fuelPrice[getFuelTypeId()]== 0.0f)
			return 0.0f;		
		double pumpedFuel = fPrice/fuelPrice[getFuelTypeId()];		
		if(pumpedFuel > fuelQuantity[getFuelTypeId()])
			return 0.0f;
		
		fuelQuantity[getFuelTypeId()] = fuelQuantity[getFuelTypeId()] - pumpedFuel;
		
		return pumpedFuel ;	
		}	
	public double fillWithLiters(double liters) {
		if(fuelPrice[getFuelTypeId()] == 0.0f) 
			return 0.0f;
		if(liters > fuelQuantity[getFuelTypeId()])
			return 0.0f;
		return liters * fuelPrice[getFuelTypeId()];
		
	}
	public void setPrice(fuelType fp, double price) {
		fuelType b = getfuelType();
		setfuelType(fp);
		fuelPrice[getFuelTypeId()] = price;
		setfuelType(b);
	}
	private int getFuelTypeId() {
		
		switch(fuelType){
		
		case STANDARD: 
					return 0; 
					
					
		case PREMIUM:
					return 1;
					
		
		case DIESEL:
					return 2;
				
					
		case ALCOHOL:
					return 3;
		default:
				return 0;
		}
		
	}
}

