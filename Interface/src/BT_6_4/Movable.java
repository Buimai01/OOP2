package BT_6_4;

public interface Movable {
    void moveUp();
    void moveDowm();
    void moveLeft();
    void moveRight();
}
class MovablePoit implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoit (int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDowm() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x +=xSpeed;
    }
    public String toString() {
        return "MovablePoit:"
                +", x: "
                +x
                +", y: "
                + y
                +", xSpeed: "
                + xSpeed
                + ", ySpeed: "
                + ySpeed;
    }
}
class MovableCircle implements Movable {
    protected int radius;
    protected MovablePoit center;
    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
       center.x -= center.ySpeed;
    }

    @Override
    public void moveDowm() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveRight() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveLeft() {
         center.x += center.xSpeed;
    }
    public String toString() {
        return "MovableCircle: "
                +", x: "
                + center.x
                +", y: "
                + center.y
                +", xSpeed: "
                + center.xSpeed
                +", ySpeed"
                + center.ySpeed;
    }
}
class Test {
    public static void main(String[] args) {
        MovablePoit movablePoit = new MovablePoit(2,5,6, 7);
        movablePoit.moveDowm();
        System.out.println(movablePoit);

    }
}

