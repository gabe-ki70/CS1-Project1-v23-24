

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.pausetime = 2;
        plane.teleport(42, 90);
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        house();

        plane.teleport(55,650);
        house();
        plane.teleport(840,90);
        house();
        plane.teleport(840,650);
        house();
    }
public void tri(){

    plane.move(100);
    plane.turn(120);
    plane.setColor(0, 200, 0);
    plane.move(100);
    plane.turn(120);
    plane.move(100);
}




public void square(){
        plane.turn(120);
        plane.move(100);
        plane.turn(-90);
        plane.move(100);
        plane.turn(-90);
        plane.move(100);
        plane.turn(-90);
        plane.move(100);
        plane.turn(-90);
}




public void house(){
        tri();
        square();

}
}
