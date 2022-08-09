package secondVersion;

public class Container {
	
	int big_container_volume = (int) (2.59 * 2.43 * 12.01);
	int small_container_volume = (int) (2.59 * 2.43 * 6.06);
	int price1 , price2;
	
	Items i = new Items();
	
	
	public Container(int price1, int price2) 
	{
		this.price1 = price1;
		this.price2 = price2;
	}
	
	
	public Container() 
	{
		
	}


	public void setPrice1(double price12) 
	{
		this.price1 = price2;
	}


	public void setPrice2(int price2) 
	{
		this.price2 = price2;
	}


	public int getPrice1() 
	{
		return price1;
	}


	public int getPrice2() 
	{
		return price2;
	}


	public void calculateVolume() 
	{
		if(i.getTotal_volume() <= big_container_volume)
	     {
	         System.out.println(1*big_container_volume);
	     }

	     else if(i.getTotal_volume() <= (big_container_volume + small_container_volume))
	     {
	         System.out.println((big_container_volume*1 + small_container_volume*1));
	     }

	     else
	     {
	         int num_big_containers = (int) (Math.ceil((double) i.getTotal_volume() / big_container_volume));
	         System.out.println(num_big_containers*big_container_volume);
	     }
	}
	 
	
}

