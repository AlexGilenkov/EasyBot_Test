package ru.hh.easybot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hh.easybot.exception.ResourceNotFoundException;
import ru.hh.easybot.model.Device;
import ru.hh.easybot.repository.ProductRepository;
import ru.hh.easybot.service.PatchService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    PatchService patchService;


    @GetMapping("/all")
    public List<Device> getAllDevice(){
        return productRepository.findAll();
    }

    @PostMapping("/add")
    public Device addDevice(@RequestBody Device device){
        return productRepository.save(device);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Device> getDeviceById(@PathVariable(value = "id") Integer id) throws ResourceNotFoundException {
        Device device = searchDevice(id);

        return ResponseEntity.ok().body(device);
    }

    @PatchMapping("/patch")
    public Device patchDeviceById(@RequestBody Device d) throws ResourceNotFoundException {
        Device device = searchDevice(d.getId());

        return productRepository.save(patchService.patchDevice(device, d));
    }


    private Device searchDevice(Integer id) throws ResourceNotFoundException{
        return productRepository.findDeviceById(id);
    }
}
