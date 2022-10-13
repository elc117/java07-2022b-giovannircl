public class MyTurtle extends BaseTurtle {
  public void draw() {
    pen.setStrokeWidth(2);
    this.face(0);
    for (int i = 0; i <= 10; i++) {
      this.face(20);
      pen.setColor(255, 0, 0);
      pen.up();
      this.moveTo(-5, i * 0.3);
      pen.down();
      this.forward(5.4);

      this.face(-20);
      pen.setColor(255, 0, 0);
      pen.up();
      this.moveTo(-5, i * 0.3);
      pen.down();
      this.forward(5.4);

      this.face(-20);
      pen.setColor(0, 0, 139);
      pen.up();
      this.moveTo(5, i * 0.3);
      pen.down();
      this.forward(-5.4);

      this.face(20);
      pen.setColor(0, 0, 139);
      pen.up();
      this.moveTo(5, i * 0.3);
      pen.down();
      this.forward(-5.4);
    }
    this.setDelay(20);
    pen.setColor(0, 0, 0);
    pen.up();
    this.moveTo(1, -5);
    pen.down();
    for (int i = 0; i < 10; i++) {
      this.circle(3);
      this.turn(7);
    }
    this.pause(2);
    this.reset();
  }

  private void circle(double size) {
    for (int i = 0; i < 5; i++) {
      this.forward(size);
      this.turn(25);
    }
  }
}
