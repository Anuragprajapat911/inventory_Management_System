package InventroySystem.Serviceimp;

import java.util.List;

import org.springframework.stereotype.Service;

import InventroySystem.Repository.InventoryRepository;
import InventroySystem.Service.InventoryService;
import InventroySystem.entity.Enventory;

@Service
public class Serviceimp implements InventoryService{
	
	InventoryRepository inventoryRepository;
	
	public Serviceimp(InventoryRepository inventoryRepository) {
		super();
		this.inventoryRepository = inventoryRepository;
	}
	
	@Override
	public Enventory saveproduct(Enventory enventro) {
		
		return inventoryRepository.save(enventro);
	}

	@Override
	public List<Enventory> getallproduct() {
		
		return inventoryRepository.findAll();
	}

	@Override
	public Enventory update(int id, Enventory inventory) {
		Enventory up=inventoryRepository.findById(id).get();
		up.setProductname(inventory.getProductname());
		up.setProductno(inventory.getProductno());
		up.setProductQun(inventory.getProductQun());
		Enventory get=inventoryRepository.save(up);
		return get;
	}

	@Override
	public void delete(int id) {
	Enventory delete=inventoryRepository.findById(id).get();

		
	inventoryRepository.delete(delete);
	
	}
}
