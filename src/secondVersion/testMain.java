package secondVersion;

import java.util.Scanner;

public class testMain {
	
	static Items items = new Items();
    static Container container = new Container();
    final static int big_container_volume = (int) (2.59 * 2.43 * 12.01);
    final static int small_container_volume = (int) (2.59 * 2.43 * 6.06);
    final static int price1 = 1000;
    final static int price2 = 1200;

    public static void main(String[] args) 
    {
    	 
         container.setPrice1(price1);
         container.setPrice2(price2);
         
    	 int[] order = new int[3];
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.println("Enter num of Laptop: ");
    	 order[0] = sc.nextInt();
    	 
    	 System.out.println("Enter num of Mouse: ");
    	 order[1] = sc.nextInt();
    	 
    	 System.out.println("Enter num of Desktop: ");
    	 order[2] = sc.nextInt();
    	 
    	 items.setOrder(order);
    	 
    	 int v = items.getTotal_volume();
    	 int w = items.getTotal_weight();
    	 System.out.println("Total volume: " +v+ " cm3");
    	 System.out.println("Total weight: " +w+ " grams");
    	 
    	 
    
    	 container_type();
    	 calcPrice(); 

    }
    
    
    public static void container_type() 
    {
    	if(items.getTotal_volume() <= big_container_volume)
    	{

            System.out.println("Number of big containers required: 1");

        }

        else if(items.getTotal_volume() <= (big_container_volume + small_container_volume))
        {

            System.out.println("Number of big containers required: 1");

            System.out.println("Number of small containers required: 1");

        }

        else
        {

            int num_big_containers = (int) (Math.ceil((double) items.getTotal_volume() / big_container_volume));

            System.out.println("Number of big containers required: " + num_big_containers);

        }
	}
    
    
    public static void calcPrice() 
    {
    	if(items.getTotal_weight() <= 500000)
    	{
            System.out.println("Shipping cost: "+ 1000 +" Euros");
        }

        else
        {
        	System.out.println("Shipping cost: "+1200+" Euros");
        }
	}
    
    
}
