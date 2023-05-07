import java.util.ArrayList;
import java.util.List;

//Создайте класс Passenger с полями:
//
//name;
//Создайте базовый класс Transport c приватными полями:
//
//title
//capacity - вместимость транспортного средства
//List<Passenger> passengers = new ArrayList<>(); -
//speed - максимальная скорость работы
//Пусть в классе будет метод:
//
//printPassengers(), который выводит всех пассажиров в печать.
//pickPassenger(Passenger passenger) - метод добавляет пассажира на борт, если транспорт не заполнен (см. capacity).
//(дополнительно) dropPassenger(String passengerName) - метод высаживает пассажира c указанным именем.
//Создайте производный от Transport класс Ship (корабль) с полями:
//
//captainName - имя капитана.
//И методом:
//
//captainGreeting() - метод выводит в консоль фразу "Капитан <имя капитана>
// приветствует вас на борту <название транспортного средства>"
public class Transport {
    private String title;
    private int capaciti;
    private List<Passenger> passengers = new ArrayList<>();
    private double speed;

    public Transport(String title, int capaciti, List<Passenger> passengers, double speed) {
        this.title = title;
        this.capaciti = capaciti;
        this.passengers = passengers;
        this.speed = speed;
    }

    public int getCapaciti() {
        return capaciti;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setCapaciti(int capaciti) {
        this.capaciti = capaciti;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return  title + " мест:" + capaciti + " " + passengers + " " + "скорость " + speed + " км/ч" ;
    }

    public void printPassengers() {
        System.out.println("Все пасажиры на борту: " + passengers);
    }
    public void pickPassenger(Passenger passenger){
            if(passengers.size()<capaciti){
                this.passengers.add(passenger);
                System.out.println(passengers);
        }else{
                System.out.println("Мест нет");
            }
    }
    public void dropPassenger(String passengerName){
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).name.equals(passengerName)){
                  passengers.remove(i);
                System.out.println("Один пасажир выбыл");
            }
        }
    }

}
//(дополнительно) dropPassenger(String passengerName) - метод высаживает пассажира c указанным именем.



