package za.ac.cput.repository;

import za.ac.cput.domain.Bus;

import java.util.ArrayList;
import java.util.List;

//
public class BusRepository implements IBusRepository {

    private static IBusRepository repository = null;

    private List<Bus> busList;

    private BusRepository(){
        busList = new ArrayList<Bus>();
    }

    public static IBusRepository getRepository() {
        if (repository == null) {
            repository = new BusRepository();
        }
        return repository;
    }

    @Override
    public Bus create(Bus bus){
        boolean success = busList.add(bus);
        if(success) {
            return bus;
        }
        return null;
    }

    @Override
    public Bus update(String id){
        return null;
    }

    @Override
    public boolean delete(String id){
        return false;
    }

    @Override
    public Bus get(String id){
        return null;
    }

    @Override
    public List<Bus> getAll() {
        return new ArrayList<>(busList);
    }
}//End of BusRepository class

//

        //private static IBusRepository repository = null;
//
//    private List<Bus> busList;
//
//    private BusRepository() {
//        busList = new ArrayList<Bus>();
//    }//constructor
//
//    public static IBusRepository repository() {
//        if (repository == null) {
//            repository = new BusRepository();
//        }
//        return repository;
//    }
//
//    @Override
//    public Bus create(Bus bus){
//        boolean success = busList.add(bus);
//        if (success){
//            return bus;
//        }
//        return null;
//    }
//
//    @Override
//    public Bus read(String id){
//        for(Bus b: busList){
//            if(b.getMake().equals(id))
//                return b;
//        }
//        return null;
//    }
//
//    @Override
//    public Bus update(Bus bus){
//        String id = bus.getMake();
//        Bus bus1 = read(id);
//
//        if(bus1 == null)
//            return null;
//
//        boolean success = delete(id);
//        if(success){
//            if(busList.add(bus))
//                return bus;
//        }
//        return null;
//    }
//
//    public boolean delete(String id){
//        Bus busToDelete = read(id);
//        if(busToDelete == null)
//            return false;
//        return (busList.remove(busToDelete));
//    }
//
//    @Override
//    public List<Bus> getAll(){return busList;}





