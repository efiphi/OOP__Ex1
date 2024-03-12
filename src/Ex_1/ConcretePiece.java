package Ex_1;

import java.util.ArrayList;

public  abstract class ConcretePiece implements Piece{

    public ArrayList<Position> steps = new ArrayList();
    protected String type;
    protected ConcretePlayer whoIsTheOwner;
    public int killd;
    public String name;

    public String getType(){
        return this.type;
    }


    public ConcretePlayer getOwner() {
        return this.whoIsTheOwner;
    }

    public ArrayList<Position> getSteps(){
        return this.steps;
    }
    public void addSteps(Position a){
        steps.add(a);
    }
    public int getNumberSteps(){
        return this.steps.size();
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name= name;
    }

    public int getKills(){
        return this.killd;
    }

    public abstract int distance();
}
