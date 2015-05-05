package domain;

import java.io.Serializable;

import data.DatabaseUnit;

public class Customer implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final String name;
	public final Double valueLastPurchase;
	private final UnitOfWork work;
	
	public Customer(UnitOfWork work, String name, Double valueLastPurchase)
	{
		this.work = work;
		this.name = name;
		this.valueLastPurchase = valueLastPurchase;
	}
	
	public void save()
	{
		work.save(this);
	}
	
	public static void main(String[] args)
	{
		UnitOfWork w = new DatabaseUnit();
		new Customer(w, "Krutz", 100.0).save();
	}
}
