package ru.hh.easybot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hh.easybot.model.Device;

public interface ProductRepository extends JpaRepository<Device, Integer> {
}
