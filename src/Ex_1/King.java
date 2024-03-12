package Ex_1;

import java.util.ArrayList;

public class King extends ConcretePiece{

    public King(ConcretePlayer p){
        this.whoIsTheOwner = p;
        this.type = "♕";
        this.steps = new ArrayList<>();
        this.killd = 0;
    }

    public String getType(){
        return "♕";
    }
    @Override
    public int getKills(){
        return this.killd;
    }
    @Override
    public int distance() {
        int dist=0;
        for (int i=0;i<this.steps.size()-1;i++){
            Position current = this.steps.get(i);
            Position next = this.steps.get(i+1);

            if(current.getX() == next.getX()){
                dist+=Math.abs(current.getY()- next.getY());
            } else if(current.getY()==next.getY()){
                dist+=Math.abs(current.getX() - next.getX());
            }
        }
        return dist;
    }
}
