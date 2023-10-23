public class Project extends World{
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.showBackGround();

        for (int row = 1; row < 472; row = row + 1) {
            for (int col = 1; col < 900; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (row < 255 && col < 350) {
                    plane.setPixelColor(2, 26, 88);
                }
            }
        }
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 0;
        plane.teleport(377, 15);
        for (int y = 0; y < 4; y++) {

            for (int x = 0; x < 18; x++) {
                for(int z=10;z>0;z=z-1) {
                    star(z, 3);
                    plane.startingAngle(-55);
                    plane.teleport(357 + (x * 30), 15 + (y * 70));
                }


            }
        }

        for (int y = 0; y < 3; y++) {

            for (int x = 0; x < 30; x++) {
                for(int z=10;z>0;z=z-1) {
                    star(z, 3);

                    plane.startingAngle(-55);
                    plane.teleport(10 + (x * 30), 300 + (y * 70));
                }


            }

        }
        plane.teleport(29,0);
        plane.startingAngle(90);
        plane.setColor(255,0,0);
        plane.trailWidth = 15;
        plane.move(235);
        for (int y=0; y<7; y++){
            plane.teleport(plane.xpos+43, 0);
            plane.move(235);
        }
    }
    public void star(int size, int scale) {
        plane.isTrail = true;
        plane.setColor(255,255,255);
        plane.trailWidth = 5;
        plane.move((int)((21-size)/scale));
        plane.turn(-100);
        plane.move((int)((21-size)/scale));
        plane.turn(45);
        plane.move((int)((23-size)/scale));
        plane.turn(-140);
        plane.move((int)((23-size)/scale));
        plane.turn(70);
        plane.move((int)((25-size)/scale));
        plane.turn(-135);
        plane.move((int)((31-size)/scale));
        plane.turn(55);
        plane.move((int)((31-size)/scale));
        plane.turn(-135);
        plane.move((int)((25-size)/scale));
        plane.turn(70);
        plane.move((int)((23-size)/scale));
        plane.turn(-145);
        plane.move((int)((23-size)/scale));
        plane.turn(59);
    }
    public void star(int size) {
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.move(21-size);
        plane.turn(-100);
        plane.move(21-size);
        plane.turn(45);
        plane.move(23-size);
        plane.turn(-140);
        plane.move(23-size);
        plane.turn(70);
        plane.move(25-size);
        plane.turn(-135);
        plane.move(31-size);
        plane.turn(55);
        plane.move(31-size);
        plane.turn(-135);
        plane.move(25-size);
        plane.turn(70);
        plane.move(23-size);
        plane.turn(-145);
        plane.move(23-size);
        plane.turn(59);
    }
    public void star() {
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.move(21);
        plane.turn(-100);
        plane.move(21);
        plane.turn(45);
        plane.move(23);
        plane.turn(-140);
        plane.move(23);
        plane.turn(70);
        plane.move(25);
        plane.turn(-135);
        plane.move(31);
        plane.turn(55);
        plane.move(31);
        plane.turn(-135);
        plane.move(25);
        plane.turn(70);
        plane.move(23);
        plane.turn(-145);
        plane.move(23);
        plane.turn(59);
    }

}
