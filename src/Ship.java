import java.util.List;
////captainGreeting() - метод выводит в консоль фразу "Капитан <имя капитана>
//// приветствует вас на борту <название транспортного средства>"
public class Ship extends Transport{
    private String captainName;

    public Ship(String captainName,String title, int capaciti, List<Passenger> passengers, double speed) {
        super(title, capaciti, passengers, speed);
        this.captainName = captainName;
    }

    @Override
    public String toString() {
        return captainName;
    }
    public void  captainGreeting(){
        System.out.println("Капитан " + captainName + " приветствует вас на борту " + title );
    }
}

