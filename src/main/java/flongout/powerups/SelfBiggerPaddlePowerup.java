package flongout.powerups;

import flongout.GameScene;
import flongout.Paddle;
import flongout.Powerup;
import flongout.Vec2;

/**
 * A nice powerup that increases the size of 
 * the paddle that picks it up.
 * 
 * @author Mikael Forsberg
 * @author Robin Gunning
 * @author Jonathan Yao Håkansson
 * @version 2015-05-19
 */
public class SelfBiggerPaddlePowerup extends Powerup
{
	/**
	 * Create a new "bigger paddle" powerup.
	 * 
	 * @param pos Initial position
	 * @param dir Drop direction
	 */
	public SelfBiggerPaddlePowerup(Vec2 pos, DropDirection dir)
	{
		super(pos, dir);
	}
	
	/**
	 * Keep track of affected paddle in order to be able to
	 * remove the effect later.
	 */
	private Paddle self;
	
	/**
	 * @{inheritDoc}
	 */
	@Override
	public void applyStaticEffects(Paddle collector, Paddle other, GameScene game)
	{
		self = collector;
		self.setScale(1.5);
		game.rescaleGraphics();
	}
	
	/**
	 * @{inheritDoc}
	 */
	@Override
	public void removeStaticEffects(Paddle collector, Paddle other, GameScene game)
	{
		if (self != null)
		{
			self.setScale(1.0);
			game.rescaleGraphics();
		}
	}
	
	/**
	 * @{inheritDoc}
	 */
	@Override
	public Type getType()
	{
		return Type.GOOD;
	}
	
	/**
	 * @{inheritDoc}
	 */
	@Override
	public String getText()
	{
		return self.getName() + " is huge!";
	}
}
