package domain;

import java.io.Serializable;

public interface UnitOfWork
{
	public void save(Serializable s);
}
