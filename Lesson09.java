import org.junit.Assert;
import org.junit.Test;



public class Lesson09 {

	class TongTich
	{
		String a;
		String [] b;
		
		public String[] total;
		
		//public Tinhtong (String[] sum) 
		//{
		//	this.total = total;
		//}
		
		public TongTich() {
			// TODO Auto-generated constructor stub
		}

		public int  TongTich() 
		{
			String a = "1234";
			
			String[] arr = a.split("");
			int sum = 0;
			int tong;
			
			for (int i = 0;i < arr.length; i++) 
			{			
				sum += Integer.parseInt(arr[i]);
			}
		
			return Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) * Integer.parseInt(arr[2]) + Integer.parseInt(arr[3]);
			
			
		}

		public boolean CheckSum() {
			// TODO Auto-generated method stub
			return false;
		}
	}
	@Test
	
	public void CheckSum() 
	{
		TongTich tong = new TongTich();
		
		System.out.println(tong);
		
		boolean result = tong.CheckSum();
		
		Assert.assertEquals(21, 21);
		
		
		
	}
}

