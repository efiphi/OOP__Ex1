package Ex_1;

import java.util.ArrayList;

public class Pawn extends ConcretePiece{

    public Pawn(ConcretePlayer owner){
        this.whoIsTheOwner = owner;
        this.killd = 0;
        if(owner.isPlayerOne()){
            this.type = "♟";
        }else{
            this.type = "♙";
        }
        this.steps = new ArrayList<>();
    }
    public void  kill(){
        killd++;
    }
    public void reduceKill(){
        killd--;
    }
    public int getKills(){
        return killd;
    }

    @Override
    public ConcretePlayer getOwner(){
        return this.whoIsTheOwner;
    }

    public String getType(){
        if(!this.whoIsTheOwner.isPlayerOne())
            return "♟";
        return "♙";
    }

    public String colorType(){
        if(!this.whoIsTheOwner.isPlayerOne())
            return "black";
        return "white";
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

    public int getkills(){
        return this.killd;
    }
}
