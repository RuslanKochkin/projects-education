////Создайте класс Calculator, сделайте в нем статические методы: сумма, разность и т.д.
////Вызовите методы в main.
////2
////Создайте класс автомобиль с полями:
////бренд,
////год.
////И статическими полями:
////всего выпущено машин - totalNumberOfCars;
////цена;
////Сделайте так, чтобы автоматически осуществлялся подсчет созданных машин(объектов).
////(подсказка: это нужно сделать в конструкторе) Создайте несколько машин, выведите totalNumberOfCars в печать.
////Дополнительно * , придумайте методы, которые бы каким-нибудь образом взаимодействовали бы с ценой.
public class Car {
   private String brand;
   private int year;
   public  static int totalNumberOfCars;
   public static double price;
   public static void print(){
       System.out.println(totalNumberOfCars +"\n"+ price);
   }

    public Car(String brand, int year,int price) {
        this.brand = brand;
        this.year = year;
        Car.price = Calculator.sumPrice(price);
        Car.totalNumberOfCars = Calculator.sumCar(totalNumberOfCars);

    }

    public static int getTotalNumberOfCars() {
        return totalNumberOfCars;
    }

    @Override
    public String toString() {
        return "Car " +
                "brand='" + brand + '\'' +
                ", year=" + year + ", price " + price +", totalNumberOfCars " +totalNumberOfCars;
    }
}
