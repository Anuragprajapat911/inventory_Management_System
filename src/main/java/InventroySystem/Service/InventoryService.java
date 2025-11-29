package InventroySystem.Service;

import java.util.List;

import InventroySystem.entity.Enventory;

public interface InventoryService {
	
	public  Enventory saveproduct(Enventory enventro);
	 
	public List<Enventory> getallproduct();
	
   public Enventory update(int id,Enventory inventory);
   
   public void delete(int id);
}
