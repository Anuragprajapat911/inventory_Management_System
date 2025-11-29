package InventroySystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import InventroySystem.entity.Enventory;

public interface InventoryRepository extends JpaRepository<Enventory, Integer>{

}
