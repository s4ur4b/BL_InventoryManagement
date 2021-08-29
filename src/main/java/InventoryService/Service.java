package InventoryService;

import InventoryModel.InventoryModel;
import com.google.gson.JsonElement;

import java.util.ArrayList;

public class Service {

    public ArrayList<InventoryModel> inventoryModelList = new ArrayList<>();


    public JsonElement computePrice() {

        for (int i = 0; i<inventoryModelList.size(); i++){
            InventoryModel items =   inventoryModelList.get(i);
            computePrice(items);
        }

        return null;
    }

    public int computePrice(InventoryModel inventoryModel){

        inventoryModel.inventoryPrice = inventoryModel.weight * inventoryModel.pricePerKg;

        System.out.println("The total price of "+ inventoryModel.name+" is: "+ inventoryModel.inventoryPrice+" Rs/-");

     return inventoryModel.inventoryPrice;
    }

}
