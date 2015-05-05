package data;

import java.io.Serializable;

import domain.UnitOfWork;

public class DatabaseUnit implements UnitOfWork
{
	@Override
	public void save(Serializable s)
	{
		System.out.printf("Saving object in fake database: %s%n", s.toString());
	}
}
