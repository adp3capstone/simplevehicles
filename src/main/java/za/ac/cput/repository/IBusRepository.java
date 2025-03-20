package za.ac.cput.repository;

import za.ac.cput.domain.Bus;

import java.util.List;

public interface IBusRepository extends IRepository <Bus, String> {

    List<Bus> getAll();
}
