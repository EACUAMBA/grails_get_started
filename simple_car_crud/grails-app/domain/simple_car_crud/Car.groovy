package simple_car_crud

class Car {
    String model
    String maker
    String color
    Fuel fuel
    Integer numberOfSeats
    Integer numberOfDoors

    static constraints = {
    }

    static mapping = {
        table('car')
        numberOfDoors column: 'number_of_doors'
        fuel type: Fuel, sqlType: 'text'
    }
}

enum Fuel{
    GASOLINE,
    DIESEL,
    ETHANOL,
    ELECTRIC
}
