public class player {
    String username;
    int coins;
    int exp;

    public player(String username) {
        this.username=username;
        coins=0;
        exp=0;
    }

    public player() {
        username="Default";
        coins=0;
        exp=0;
    }

    public void setName(String name){
        username=name;
    }

    public void setCoins(int coins){
        this.coins=coins;
    }

    public void setExp(int exp){
        this.exp=exp;
    }

    public String getName(){
        return username;
    }

    public int getCoins(){
        return coins;
    }

    public int getExp(){
        return exp;
    }

    public String toString(){
        String x=String.format("Player Information: %s (%d coins,%d xp)\n",username,coins,exp);
        return x;
    }
    
}
