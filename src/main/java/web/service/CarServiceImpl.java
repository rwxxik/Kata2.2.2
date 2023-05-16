package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getListCar() {
        return carDAO.getListCar();
    }

    @Override
    public List<Car> getListCar(int count) {
        return carDAO.getListCar(count);
    }
}
