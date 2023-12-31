package flongout.powerups;

import flongout.GameScene;
import flongout.Paddle;
import flongout.Powerup;
import flongout.Vec2;

public class FasterBall extends Powerup {
	private double faster = 100;	
	public FasterBall(Vec2 pos, DropDirection dir) {
		super(pos, dir);
	}


	/**
	 * Makes the ball faster
	 */
	@Override
	public void applyStaticEffects(Paddle collector, Paddle other,GameScene game) {
	game.getBall().accelerate(game.getBall().getVelocity().normalize().scale(faster));	
		
	}
	/**
	 * Does nothing
	 */
	@Override
	public void removeStaticEffects(Paddle collector, Paddle other,
			GameScene game) {
		
	}
	/**
	 * Returns Type that is normal
	 */
	@Override
	public Type getType() {
		return Type.NEUTRAL;
	}

	@Override
	/**
	 * Faster ball
	 * @return
	 */
	public String getText() {
		return "The ball gains a burst of speed!";
	}

}
