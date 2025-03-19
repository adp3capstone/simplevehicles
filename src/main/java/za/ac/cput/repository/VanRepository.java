package za.ac.cput.repository;

import za.ac.cput.domain.Van;

import java.util.ArrayList;
import java.util.List;

public class VanRepository implements IVanRepository {

    private static IVanRepository repository = null;
    private List<Van> vanList;

    private VanRepository() {
        vanList = new ArrayList<Van>();

    }

    public static IVanRepository getRepo() {
        if (repository == null) {
            repository = new VanRepository();
        }
        return repository;
    }


    @Override
    public Van create(Van van) {
        boolean results = vanList.add(van);
        if (results) {
            return van;
        }
        return null;
    }

    @Override
    public Van update(String id) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public Van get(String id) {
        return null;
    }

    @Override
    public List<Van> getAll() {
        return new ArrayList<>(vanList);
    }

}
