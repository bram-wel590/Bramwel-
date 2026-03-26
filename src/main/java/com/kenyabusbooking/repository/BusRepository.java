package com.kenyabusbooking.repository;

import com.kenyabusbooking.entity.Bus;
import java.util.List;

public interface BusRepository {
    Bus findById(Long busId);
    List<Bus> findAll();
    List<Bus> findByRoute(String startLocation, String endLocation);
    void save(Bus bus);
    void update(Bus bus);
    void delete(Long busId);
}