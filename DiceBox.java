//import java.io.*;
import java.util.ArrayList;
class DiceBox{
    private ArrayList<Dice> FD;

    public DiceBox(){
        FD = new ArrayList<Dice>();
    }
    public void add(Dice d1){
        FD.add(d1);
    }
    public void shake(){
        for(int i=0; i<FD.size(); i++){
            FD.get(i).roll();
        }
    }
    public int getTotal(){
    int Total = 0 ;
        for(int i=0; i<FD.size(); i++){
            Total += FD.get(i).getFace();
        }
        return Total;
    }
    public void printDices(){
        for(Dice d : FD){
            System.out.println(d);
        }
    }
}