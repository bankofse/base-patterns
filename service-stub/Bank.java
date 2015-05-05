
public class Bank
{
	public static void main(String[] args)
	{
		CurrencyExchangeService cexs = new CurrencyExchangeServiceStub();
		
		Double dollars = 3.0;
		Double euros = cexs.getEuros(dollars);
		
		System.out.printf("Bank exchanged %.2f dollars for %.2f euros%n", dollars, euros);
	}
}
