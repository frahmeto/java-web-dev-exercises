package LectureExercises.technology;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractEntity {

    private static int count = 0;
    private int id;

    public AbstractEntity(){
       // this.id = ThreadLocalRandom.current().nextInt(0, 100 + 1);

        this.id = ++count;

    }
    public int getId(){
        return this.id;
    }
}
