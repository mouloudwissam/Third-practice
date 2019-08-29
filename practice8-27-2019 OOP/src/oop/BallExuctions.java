package oop;

public class BallExuctions {

	public static void main(String[] args) {
		Ball ball = new Ball();
		System.out.println(ball.colorofBall);
		ball.kickedaway();
		System.out.println(ball.kick);
		System.out.println(ball.matireal);
		ball.throwUp();
		System.out.println(ball.thrwit);
		System.out.println(ball.NumbeOfCircleOnIt);
		ball.kickedslowly();
		System.out.println(ball.kick);
		System.out.println(ball.shape);
		try {
			System.out.println(ball.typeof[1]);
		} catch (Exception e) {
			System.out.println("the number 6 is not available rightnow");
		}

		ball.ThrowAway();
		System.out.println(ball.thrwit);
	}

}
