package ru.hh.easybot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.hh.easybot.model.Device;

public interface ProductRepository extends JpaRepository<Device, Integer> {

    @Query(value = "select * from test t where t._id = :id", nativeQuery = true)
    Device findDeviceById(@Param("id") Integer id);

}
