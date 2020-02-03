class Dice{

    private int face;
    public void SetDice(int f){
        this.face = f;
    }
    public Dice(int FA){
        this.face = FA;
    }
    public Dice(){
        this.face = 1;
    }
    public void roll(){
        this.face = (int)((Math.random()*6)+1);
    }
    public int getFace(){
        return this.face;
    }
    public String toString(int face){
        String R = "Face = " + face;
        return R;
    }
}