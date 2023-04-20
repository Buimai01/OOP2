package BT_6_3;

public interface Movable {
     abstract void moveUp();
     abstract void moveDown();
     abstract void moveLeft();
     abstract void moveRight();
}
class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint (int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp() {
        y-= ySpeed;
    }
    public void moveDown() {
        y += ySpeed;
    }
    public void moveLeft() {
        x -= xSpeed;
    }
    public void moveRight() {
        x += xSpeed;
    }
    public String toString() {
        return "MovablePoint:"
                + ", x ="
                + x
                + ", y ="
                + y
                + ", cxSpeed="
                + xSpeed
                +", ySpeed="
                + ySpeed;
    }
}
class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2, 5, 6, 7);
        System.out.println("MovablePoint" + movablePoint.toString());
        movablePoint.moveDown();
        System.out.println(movablePoint);
        movablePoint.moveUp();
        System.out.println(movablePoint);
        movablePoint.moveRight();
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        System.out.println(movablePoint);

    }
}
