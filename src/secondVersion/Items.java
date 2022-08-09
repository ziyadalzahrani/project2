package secondVersion;

public class Items {
	
	private int total_weight = 0;
   	private int total_volume = 0;
    private int[] order ;
    
	public Items(int total_weight, int total_volume, int orderCount, int[] order) 
	{
		this.total_weight = total_weight;
		this.total_volume = total_volume;
		this.order = order;
	}
	

	public Items() 
	{
	
	}


	public void getVolume() 
	{
		for(int i=0; i<order.length; i++){

            if(i==0)
            {
            	int volume1 = (order[i] * 60 * 50 * 50);
                System.out.println("Volume of Laptop= " + volume1);
            }

            else if(i==1)
            {
            	int volume2 = (order[i] * 30 * 30 * 20);
            	System.out.println("Volume of Laptop= " + volume2);

            }

            else if(i==2)
            {
            	int volume3 = (order[i] * 100 * 150 * 50);
            	System.out.println("Volume of Laptop= " + volume3);

            }


        }
		
	}

	public int getTotal_weight() 
	{
		for(int i=0; i<order.length; i++)
		{

            if(i==0)
            {

                total_weight += (order[i] * 6500);
            }

            else if(i==1)
            {
                total_weight += (order[i] * 200);
            }

            else if(i==2)
            {
                total_weight += (order[i] * 20000);
            }


        }
		
		return total_weight;
	}
	

	public void setTotal_weight(int total_weight) 
	{
		this.total_weight = total_weight;
	}
	

	public int getTotal_volume()
	{
		for(int i=0; i<order.length; i++)
		{

            if(i==0)
            {
                total_volume += (order[i] * 60 * 50 * 50);
            }

            else if(i==1)
            {
                total_volume += (order[i] * 30 * 30 * 20);
            }

            else if(i==2)
            {
                total_volume += (order[i] * 100 * 150 * 50);
            }


        }
		
		return total_volume;
	}

	public void setTotal_volume(int total_volume) 
	{
		this.total_volume = total_volume;
	}


	public int[] getOrder() 
	{
		return order;
	}

	public void setOrder(int[] order) 
	{
		this.order = order;
	
  }

}
