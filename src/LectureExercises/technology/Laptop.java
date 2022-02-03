package LectureExercises.technology;

public class Laptop extends Computer{
    private  double weight;


    public Laptop(int storage, int ram, String graphicCard, double weight) {
        super(storage, ram, graphicCard);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public  boolean isClunky(){
        if(weight > 15){
            return true;
        }else {
            return false;
        }

    }
}
