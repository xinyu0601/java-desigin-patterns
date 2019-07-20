package com.liulishuo.factory;

import com.liulishuo.factory.entity.Bike;
import com.liulishuo.factory.entity.Car;
import com.liulishuo.factory.entity.Truck;
import com.liulishuo.factory.entity.Vehicle;


/**
 * Created on 2019/7/20 14:52.
 *
 * @author hxyn4412
 */
public class VehicleFactory {

    public enum VehicleType {
        Bike, Car, Truck
    }

    public static Vehicle create(VehicleType type) {
        if (type.equals(VehicleType.Bike))
            return new Bike();
        else if (type.equals(VehicleType.Car))
            return new Car();
        else if (type.equals(VehicleType.Truck))
            return new Truck();
        else
            return null;
    }
}
