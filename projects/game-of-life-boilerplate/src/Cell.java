public class Cell {
    private int x;
    private int y;
    private boolean alive;
    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive){
        this.alive = alive;
    }

    public String toString(){
        return this.isAlive() ? "O" : ".";
    }

}
