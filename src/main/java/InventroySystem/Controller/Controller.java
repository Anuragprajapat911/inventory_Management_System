package InventroySystem.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import InventroySystem.Service.InventoryService;
import InventroySystem.entity.Enventory;

@RestController
public class Controller {
	InventoryService inventoryService;

	public Controller(InventoryService inventoryService) {
		super();
		this.inventoryService = inventoryService;
	}
    @PostMapping("/insert")
	public ResponseEntity<Enventory> insert(@RequestBody Enventory enventory)
	{
	Enventory save=inventoryService.saveproduct(enventory);
	 return new ResponseEntity<Enventory>(save, HttpStatus.CREATED);
	}
    @GetMapping("/getall")
    public ResponseEntity<List<Enventory>>getall()
    {
    List<Enventory> get=inventoryService.getallproduct();
    return ResponseEntity.ok(get);
    }
    @PutMapping("update/{id}")
    public ResponseEntity<Enventory> update(@PathVariable int id,@RequestBody Enventory inventory)
    {
    Enventory upd=inventoryService.update(id, inventory);
    return new ResponseEntity<Enventory>(upd,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Boolean>> delete(@PathVariable int id)
    {
    
   inventoryService.delete(id);
   Map<String,Boolean> del=new HashMap<String, Boolean>();
   del.put("Delete", Boolean.TRUE);
   return  ResponseEntity.ok(del);
    }  
    
}
