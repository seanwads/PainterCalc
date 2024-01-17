import java.util.ArrayList;

public class Room {
    private Wall[] walls;

    public Wall[] getWalls() {
        return walls;
    }
    public void setWalls(Wall[] walls) {
        this.walls = walls;
    }

    public Room(int wallCount){
        walls = new Wall[wallCount];
    }
}
