
public class CurrencyExchangeServiceStub implements CurrencyExchangeService
{
	/*
	 * Assume Euros are worth more than Dollars for the service stub
	 */
	@Override
	public Double getEuros(Double dollarsUsd)
	{
		return dollarsUsd * .8;
	}
}
