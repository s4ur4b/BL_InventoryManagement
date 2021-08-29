package InventoryController;

import InventoryModel.InventoryModel;
import InventoryService.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.*;
import java.io.IOException;

public class Controller {
    public static void main(String[] args)  throws IOException {

        Service service = new Service();

        InventoryModel item1 = new InventoryModel("Rice", 50, 60);
        InventoryModel item2 = new InventoryModel("Pulses", 120, 90);
        InventoryModel item3 = new InventoryModel("Wheat", 150, 40);
        service.inventoryModelList.add(item1);
        service.inventoryModelList.add(item2);
        service.inventoryModelList.add(item3);

        service.computePrice();

        Gson gson = new Gson();

        String items1 = gson.toJson(item1);
        String items2 = gson.toJson(item2);
        String items3 = gson.toJson(item3);

        System.out.println("Json String "+items1);
        System.out.println("Json String "+items2);
        System.out.println("Json String "+items3);

        FileWriter fileWriter = new FileWriter("src/main/resources/Inventory.json");
        gson.toJson(item1, fileWriter);
    }
}
