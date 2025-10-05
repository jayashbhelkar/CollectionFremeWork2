package collections;

import java.util.Objects;

public class Marker {

	String brand ;
	String color ;
	double price ;
	double thickness ;
	
	public Marker() {
		// TODO Auto-generated constructor stub
	}

	public Marker(String brand, String color, double price, double thickness) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.thickness = thickness;
	}

	@Override
	public String toString() {
		return "Marker [brand=" + brand + ", color=" + color + ", price=" + price + ", thickness=" + thickness + "]";
	}

//	@Override
//	public int hashCode() {
//		return brand.hashCode()+color.hashCode()+Double.hashCode(price)+Double.hashCode(thickness) ;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marker other = (Marker) obj;
		return brand==other.brand && color==other.color
				&& price==other.price
				&& thickness==other.thickness;
	}
	
	
}
