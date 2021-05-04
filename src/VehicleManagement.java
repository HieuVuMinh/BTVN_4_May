import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManagement {
    public static final String enterType = "Enter Vehicle Type: ";
    public static final String enterProducer = "Enter producer: ";
    public static final String enterYearOfProduction = "Enter Year Of Production: ";
    public static final String enterPrise = "Enter price: ";
    public static final String enterColor = "Enter color: ";
    public static final String car = "1. Car";
    public static final String mortorcycle = "2. Mortorcycle";
    public static final String truck = "3. Truck";
    public static final String selection = "Enter your selection: ";
    public static final String enterNumberOfSeat = "Enter number of seat: ";
    public static final String enterEngineType = "Enter Engine Type: ";
    public static final String enterHorsePower = "Enter Horse Power: ";
    public static final String enterLoadingCapacity = "Enter Loading Capacity: ";
    public static final String findVehicleByProducer = "1. Find Vehicle by Producer";
    public static final String findVehicleByColor = "2. Find Vehicle by Color";
    public static final String notFound = "Not found";
    List<Vehicle> vehicleList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private String vehicleType;
    private String producer;
    private int yearOfProduction;
    private double price;
    private String color;

    public VehicleManagement() {
        vehicleList.add(new PersonalCars("Mercedes", 2021, 65.200, "Black", "Mercedes Benz C200",
                05, "I4"));
        vehicleList.add((new PersonalMotorcycles("Ducati", 2020,40.000,"Red","Ducati panigale V4s",
                1103)));
        vehicleList.add(new PersonalTrucks("Komatsu",2016,142.200,"Yellow","980E-4 Dump Trucks",
                625));
    }

    // Hiển thị lựa chọn
    public void display() {
        System.out.println("---------------------------------------------------");
        System.out.println("|       **    Quản lý phương tiện     **          |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|  1. Nhập thêm phương tiện quản lý               |");
        System.out.println("|  2. Hiển thị danh sách phương tiện quản lý      |");
        System.out.println("|  3. Tìm kiếm phương tiện                        |");
        System.out.println("|  4. Lưu danh sách phương tiện ra file nhị phân  |");
        System.out.println("|  5. Đọc danh sách từ file nhị phân              |");
        System.out.println("|  6. Thoát chương trình                          |");
        System.out.println("|_________________________________________________/");
        int selection = sc.nextInt();
        switch (selection){
            case 1 -> addVehicle();
            case 2 -> displayVehicle();
            case 3 -> find();
            case 4 -> writeFileVehicle();
            case 5 -> saveVehicleListToBinaryFile();
            case 6 -> exitProgram();
        }
    }

    // Nhập thông tin phương tiện
    private void inputInfoVehicle() {
        sc.nextLine();
        System.out.println(enterType);
        vehicleType = sc.nextLine();
        System.out.println(enterProducer);
        producer = sc.nextLine();
        System.out.println(enterYearOfProduction);
        yearOfProduction = sc.nextInt();
        System.out.println(enterPrise);
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println(enterColor);
        color = sc.nextLine();
    }

    // 1. Nhập thêm thông tin loại phương tiện cần quản lý
    public void addVehicle() {
        System.out.println(car);
        System.out.println(mortorcycle);
        System.out.println(truck);
        System.out.println(selection);
        int selection = sc.nextInt();
        switch (selection) {
            case 1 -> vehicleList.add(addPersonalCars());
            case 2 -> vehicleList.add(addPersonalMotorcycles());
            case 3 -> vehicleList.add(addPersonalTrucks());
        }
    }
    // Nhập thông tin xe ô tô
    private PersonalCars addPersonalCars() {
        inputInfoVehicle();
        System.out.println(enterNumberOfSeat);
        int seat = sc.nextInt();
        sc.nextLine();
        System.out.println(enterEngineType);
        String engineType = sc.nextLine();
        PersonalCars cars = new PersonalCars(producer, yearOfProduction, price, color, vehicleType, seat, engineType);
        return cars;
    }
    // Nhập thông tin xe máy
    private Vehicle addPersonalMotorcycles() {
        inputInfoVehicle();
        System.out.println(enterHorsePower);
        double horsePower = sc.nextDouble();
        PersonalMotorcycles motorcycles = new PersonalMotorcycles(producer, yearOfProduction, price, color, vehicleType, horsePower);
        return motorcycles;
    }
    // Nhập thông tin xe tải
    private Vehicle addPersonalTrucks() {
        inputInfoVehicle();
        System.out.println(enterLoadingCapacity);
        int loadingCapacity = sc.nextInt();
        PersonalTrucks trucks = new PersonalTrucks(producer, yearOfProduction, price, color, vehicleType, loadingCapacity);
        return trucks;
    }

    // 2. Hiển thị thông tin phương tiện quản lý
    public void displayVehicle() {
        for (Vehicle list : vehicleList) {
            System.out.println(list);
        }
    }

    // 3. Tìm phương tiện theo:
    public void find(){
        System.out.println(findVehicleByProducer);
        System.out.println(findVehicleByColor);
        int selection = sc.nextInt();
        switch (selection){
            case 1 -> {
                sc.nextLine();
                System.out.println(enterProducer);
                String producer = sc.nextLine();
                findVehicle(producer);
            }
            case 2 -> {
                System.out.println(enterColor);
                String color = sc.nextLine();
                findVehicleByColor(color);
            }
        }
    }
    // Hãng sản xuất
    public void findVehicle(String producer){
        Vehicle vehicle = findVehicleByProducer(producer);
        if (vehicle == null){
            System.out.println(notFound);
        } else {
            System.out.println("Is this vehicle you are looking for: " + vehicle);
        }
    }
    public Vehicle findVehicleByProducer(String producer){
        int count = -1;
        for (int i = 0; i < vehicleList.size(); i++) {
           Vehicle vehicle = vehicleList.get(i);
           if (vehicle.getProducer().equals(producer)){
               count = i;
               break;
           }
        }
        if (count == -1){
            return null;
        } return vehicleList.get(count);
    }
    // Màu
    public void findVehicleByColor(String color){
        int count = -1;
        for (int i = 0; i < vehicleList.size(); i++) {
            Vehicle vehicle = vehicleList.get(i);
            if (vehicle.getColor().equals(color)){
                count = 1;
                System.out.println(vehicle);
            }
        }
        if (count == -1) System.out.println(notFound);
    }

    // 4. Lưu danh sách phương tiện ra file nhị phân
    // Viết vào file Object
    public void writeFileVehicle (){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Vehicle.txt"));
            oos.writeObject(vehicleList);
            System.out.println("File name Vehicle was just update!");
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // 5. Đọc file Object
    public void saveVehicleListToBinaryFile(){
        writeFileVehicle();
        List<Vehicle> vehicles = readFileVehicle();
        System.out.println(vehicles);
    }
    // Đọc file
    public List<Vehicle> readFileVehicle (){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Vehicle.txt"));
            vehicleList = (List<Vehicle>) ois.readObject();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return vehicleList;
    }

    // Thoát chương trình
    public void exitProgram(){
        System.exit(0);
    }
}
