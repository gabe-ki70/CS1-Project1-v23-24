public class B0_BasicLoop extends World {
    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.pausetime = 0;
        plane.teleport(75, 75);
        for (int g = 10; g > 0; g--) {
            System.out.println(g);
            plane.teleport(75, plane.ypos + 50);
            for (int x = 10; x > 0; x--) {
                System.out.println(x);
                plane.trailWidth = 10;
                plane.setColor(20, 120/x, 13*g);
                plane.startingAngle(360);
                plane.square(50);
                plane.teleport(plane.xpos + 50, plane.ypos);
            }
        }
    }
}