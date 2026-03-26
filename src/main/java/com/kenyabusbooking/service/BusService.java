package com.kenyabusbooking.service;
import com.kenyabusbooking.entity.Bus;
import com.kenyabusbooking.repository.BusRepository;
import java.util.List;
public class BusService {
    private BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public List<Bus> searchBuses(String startLocation, String endLocation) {
        return busRepository.findByRoute(startLocation, endLocation);
    }

    public Bus getBusDetails(Long busId) {
        return busRepository.findById(busId);
    }

    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    public void addBus(Bus bus) {
        busRepository.save(bus);
    }

    public void updateBus(Bus bus) {
        busRepository.update(bus);
    }

    public void deleteBus(Long busId) {
        busRepository.delete(busId);
    }
}