package LectureExercises.technology;

public class Computer extends AbstractEntity{
    private int storage;
    private int ram;
    private String graphicCard;
    private boolean hasRGB;

    public Computer(int storage, int ram, String graphicCard) {
        this.storage = storage;
        this.ram = ram;
        this.graphicCard = graphicCard;
//        this.hasRGB = hasRGB;
   }

    public void increaseRam(int ramNumber){
        this.ram = this.ram + ramNumber;
    }

    public void increaseStorage(int storageNum){
        this.storage = this.storage + storageNum;

    }


    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

//    public boolean isHasRGB() {
//        return hasRGB;
//    }
}
