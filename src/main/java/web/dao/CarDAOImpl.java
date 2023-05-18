package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {
    private List<Car> dataBase;

    {
        dataBase = new ArrayList<>();
        dataBase.add(new Car("UAZ", "469", 1970));
        dataBase.add(new Car("Opel", "Zafira", 2013));
        dataBase.add(new Car("Pagani", "Zonda", 2023));
        dataBase.add(new Car("Ford", "Mustang", 1964));
        dataBase.add(new Car("Honda", "Super Cub", 1958));
    }

    @Override
    public List<Car> getListCar() {
        return new ArrayList<>(dataBase);
    }

    @Override
    public List<Car> getListCar(int count) {
        List<Car> listCar = new ArrayList<>();

        if (count >= dataBase.size() || count < 0) {
            return getListCar();
        }

        for (int i = 0; i < count; i++) {
            listCar.add(dataBase.get(i));
        }
        return listCar;
    }
}
