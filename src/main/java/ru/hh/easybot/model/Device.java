package ru.hh.easybot.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "test")
@Data
public abstract class Device {
    @Id
    @PrimaryKeyJoinColumn
    @Column(name = "_id", nullable = false, unique = true)
    private Integer id;
    @Column(name = "_serialNumber", nullable = false)
    private String serialNumber;
    @Column(name = "_manufacturer", nullable = false)
    private String manufacturer;
    @Column(name = "_price", nullable = false)
    private Float price;
    @Column(name = "_count", nullable = false)
    private Integer count;

    public abstract String toAdditional();
    public abstract void fromAdditional(String s);
}
