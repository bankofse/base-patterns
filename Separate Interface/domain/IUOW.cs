using System;

public interface IUOW
{
    Customer Customer { get; set; }
    Order Order { get; set; }
}
