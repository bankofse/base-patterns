using System;

public class UOW : IUOW
{
    private Customer Customer { get; set; }
    private Order Order { get; set; }

	public UOW()
	{
        Customer = new Customer();
        Order = new Order();
	}
}
