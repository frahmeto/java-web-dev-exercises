package LectureExercises.technology;

public class Computer {
    private int storage;
    private int ram;
    private String graphicCard;
    private boolean hasRGB;

    public Computer(int storage, int ram, String graphicCard, boolean hasRGB) {
        this.storage = storage;
        this.ram = ram;
        this.graphicCard = graphicCard;
        this.hasRGB = hasRGB;
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

    public boolean isHasRGB() {
        return hasRGB;
    }
}
