package com.springcore.properties;

import java.util.Properties;

public class Village {
	
   private String villageName;
   private int VillagePinCode;
   private Properties dem;
@Override
public String toString() {
	return "Village [villageName=" + villageName + ", VillagePinCode=" + VillagePinCode + ", dem=" + dem + "]";
}
public String getVillageName() {
	return villageName;
}
public void setVillageName(String villageName) {
	this.villageName = villageName;
}
public int getVillagePinCode() {
	return VillagePinCode;
}
public void setVillagePinCode(int villagePinCode) {
	VillagePinCode = villagePinCode;
}
public Properties getDem() {
	return dem;
}
public void setDem(Properties dem) {
	this.dem = dem;
}
   


}
