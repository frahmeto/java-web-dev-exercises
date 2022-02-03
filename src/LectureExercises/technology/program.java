package LectureExercises.technology;

public class program {
    //testing
    public static void main(String[] args) {
        Computer Glory = new Computer(500, 16,
                "GeForce RTX 3070");
        System.out.println(Glory.getId());

        System.out.println("The current storage is: " + Glory.getStorage());
        System.out.println("The current ram is: " + Glory.getRam());

        Glory.increaseStorage(250);
        Glory.increaseRam(16);

        System.out.println("The new storage is: " + Glory.getStorage());
        System.out.println("The new ram is: " + Glory.getRam());

        Laptop Faith = new Laptop(500, 32,
                "GeForce RTX 3070 TI",20);

        System.out.println(Faith.isClunky());
        System.out.println(Faith.getWeight());
        System.out.println(Faith.getGraphicCard());
        System.out.println(Faith.getId());


        SmartPhone samsung = new SmartPhone(500,16,"N/A",32,521);
        System.out.println(samsung.getNumOfPhotos());
        System.out.println(samsung.getNumOfApps());
        samsung.downloadApp();
        samsung.takePhoto();
        System.out.println(samsung.getNumOfPhotos());
        System.out.println(samsung.getNumOfApps());
        System.out.println(samsung.getStorage());
        System.out.println(samsung.getId());

    }
}