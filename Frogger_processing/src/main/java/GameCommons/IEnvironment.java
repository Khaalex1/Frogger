package GameCommons;
import GraphicalElements.Element;
import MovingElements.Obstacle;
import MovingElements.Obstacle.Car;
import MovingElements.Obstacle.Trunk;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;

public interface IEnvironment {
    abstract ArrayList<Car> car_range(int range);
    abstract ArrayList<Trunk> trunk_range(int range);
    abstract ArrayList<ArrayList<Car>> allCars(int range_end);
    abstract void move_all(ArrayList<ArrayList<Car>> allCars, float ydir);
}
