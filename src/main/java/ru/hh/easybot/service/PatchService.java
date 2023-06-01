package ru.hh.easybot.service;

import org.springframework.stereotype.Service;
import ru.hh.easybot.model.Device;

@Service
public class PatchService {
    public Device patchDevice(Device oldDevice, Device newDevice){
        if(newDevice.getId() != 0 && oldDevice.getId() != newDevice.getId()){
            oldDevice.setId(newDevice.getId());
        }
        if(newDevice.getSerialNumber() != null && !oldDevice.getSerialNumber().equals(newDevice.getSerialNumber())){
            oldDevice.setSerialNumber(newDevice.getSerialNumber());
        }
        if(newDevice.getManufacturer() != null && !oldDevice.getManufacturer().equals(newDevice.getManufacturer())){
            oldDevice.setManufacturer(newDevice.getManufacturer());
        }
        if(newDevice.getPrice() != 0 && oldDevice.getPrice() != newDevice.getPrice()){
            oldDevice.setPrice(newDevice.getPrice());
        }
        return oldDevice;
    }
}
