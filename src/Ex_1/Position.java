package Ex_1;

public class Position {

    private int x, y, numPieces;

    Position(int x, int y){
        this.x = x;
        this.y = y;
        this.numPieces = 0;
    }
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setNumPieces(int num){
        this.numPieces = num;
    }

    public int getNumPieces(){
        return this.numPieces;
    }



}
