package LectureExercises.technology;

public class SmartPhone extends  Computer {

    private int numOfApps;
    private int numOfPhotos;

    public SmartPhone(int storage, int ram, String graphicCard, int numOfApps, int numOfPhotos) {
        super(storage, ram, graphicCard);

        this.numOfApps = numOfApps;
        this.numOfPhotos = numOfPhotos;
    }

    public void takePhoto(){
        this.numOfPhotos = this.numOfPhotos+1;
    }

    public void downloadApp(){
        this.numOfApps = this.numOfApps+1;
    }

    public int getNumOfApps() {
        return numOfApps;
    }

    public int getNumOfPhotos() {
        return numOfPhotos;
    }
}
