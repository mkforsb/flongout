package flongout;

import java.util.Collections;
import java.util.Stack;

import flongout.powerups.FasterBall;
import flongout.powerups.LargerBallPowerup;
import flongout.powerups.PowerfulBallPowerup;
import flongout.powerups.SmallerBallPowerup;
import flongout.powerups.ZeroGravityPowerup;
import flongout.powerups.OpponentSmallerPaddlePowerup;
import flongout.powerups.SelfBiggerAreaPowerup;
import flongout.powerups.SelfBiggerPaddlePowerup;
import flongout.powerups.SelfSmallerPaddlePowerup;

/**
 * Factory for generating randomly chosen powerups.
 *  
 * @author Mikael Forsberg
 * @author Robin Gunning
 * @author Jonathan Yao Håkansson
 * @version 2015-05-19
 */
public class PowerupFactory
{
	/**
	 * Create a new powerup factory.
	 */
	public PowerupFactory()
	{
	}
	
	/**
	 * Get a new random powerup.
	 * 
	 * @param pos Initial position
	 * @param dir Drop direction
	 * @return The created powerup
	 */
	public Powerup createRandomPowerup(Vec2 pos, Powerup.DropDirection dir)
	{
		Stack<Powerup> powerups = new Stack<Powerup>();
		
		powerups.add(new OpponentSmallerPaddlePowerup(pos, dir));
		powerups.add(new SelfSmallerPaddlePowerup(pos, dir));
		powerups.add(new ZeroGravityPowerup(pos, dir));
		powerups.add(new SelfBiggerPaddlePowerup(pos, dir));
		powerups.add(new LargerBallPowerup(pos, dir));
		powerups.add(new SmallerBallPowerup(pos, dir));
		powerups.add(new PowerfulBallPowerup(pos, dir));
		powerups.add(new SelfBiggerAreaPowerup(pos, dir));
		powerups.add(new FasterBall(pos,dir));
		Collections.shuffle(powerups);
		
		return powerups.pop();
	}
}
