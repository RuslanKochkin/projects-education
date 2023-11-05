
//printPassengers(), который выводит всех пассажиров в печать.
//pickPassenger(Passenger passenger) - метод добавляет пассажира на борт, если транспорт не заполнен (см. capacity).
//(дополнительно) dropPassenger(String passengerName) - метод высаживает пассажира c указанным именем.
//Создайте производный от Transport класс Ship (корабль) с полями:
//
//captainName - имя капитана.
//И методом:
//captainGreeting() - метод выводит в консоль фразу "Капитан <имя капитана>
// приветствует вас на борту <название транспортного средства>";
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         List<Passenger> passengers = new ArrayList<>();
        Transport sprinter = new Transport("Merсedes", 3, passengers, 120);
        System.out.println(sprinter);
        sprinter.printPassengers();

        sprinter.pickPassenger(new Passenger("Anna"));
        sprinter.pickPassenger(new Passenger("Anna"));
        sprinter.pickPassenger(new Passenger("Ruslan"));
        sprinter.pickPassenger(new Passenger("Anna"));
        sprinter.printPassengers();
        System.out.println(sprinter);
        sprinter.dropPassenger("Ruslan");
        System.out.println(sprinter);
        Ship spirulina = new Ship("Arkacha", "Spirulina", 90, passengers, 60);
        spirulina.captainGreeting();




    }

}