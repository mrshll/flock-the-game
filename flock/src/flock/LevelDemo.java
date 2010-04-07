package flock;

public class LevelDemo extends Level
{
	public LevelDemo() throws Exception
	{
		super("test");
		_entities.add(new DemoEntity());
		_entities.add(new LemmingEntity(200, 240));
		_entities.add(new AntiLemmingEntity(300, 240));
		_entities.add(new PlayerEntity(100, 100));
		//_entities.add(new LemmingEntity(150, 100));
		_entities.add(new LemmingEntity(130, 100));
		//_entities.add(new AntiLemmingEntity(50, 100));
		_entities.add(new WrenchEntity(250, 50));
	}
}