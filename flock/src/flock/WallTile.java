package flock;

public class WallTile extends Tile
{
	public WallTile()
	{
		super("wall");
		_gravity = 0;
		_solid = true;
	}
	
	@Override
	public Object clone()
	{
		return super.clone();
	}
}
