public class task_1 {
    public static void main(String[] args) {
        Car toyotaYaris = new Car("Toyota Yaris", "Drozhzhin Aleksander", "Белый", 2008);
        System.out.println(toyotaYaris);

        toyotaYaris.setColor("Антрацитовый");
        System.out.println(toyotaYaris);
        System.out.println(toyotaYaris.age());
        System.out.println(toyotaYaris.getColor());

        Car nissanPatrol = new Car("Nissan Patrol", 1998);
        System.out.println(nissanPatrol);
        System.out.println(nissanPatrol.getYear());

        Car bruhCar = new Car();
        System.out.println(bruhCar);
    }
}