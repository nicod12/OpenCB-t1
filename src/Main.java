public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.addDoor();
        System.out.println(car1.doors);
    }
    public static  int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static class Car {
        int doors = 0 ;

        public int addDoor() {
           return this.doors++;
        }
    }
}


