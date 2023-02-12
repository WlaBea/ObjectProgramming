package project.mainObjects;
import java.io.Serializable;

public class Task implements Serializable{
    public int id;
    public String taskName;
    public float taskAvgTime;
    public boolean isDone;

    public Task() {

    }
    public Task(int id, String taskName, float taskAvgTime, boolean isDone){
        this.id=id;
        this.taskName=taskName;
        this.taskAvgTime=taskAvgTime;
        this.isDone=isDone;
    }
    public String taskDone(){
        this.isDone = true;
        return String.format("Zakończyłeś zadanie %s",this.taskName);
    }
    public String showTask(){
        return String.format("%d. Zadanie: %s, Średni czas wykonania zadania - %f",this.id, this.taskName, this.taskAvgTime);
    }
}
