
public class Cricket {

	public int numberOfTeams(int[] arr, int k) {
		
		int min=1;
		int max=10;
		int mid;
		
		while(min<=max)
		{
			mid=(min+max)/2;		//mid is the guess of number of teams mid=5
			if(countOfTeams(arr,mid,k))
			{
				if(!countOfTeams(arr,mid+1,k))
				{
					return mid;
				}
				else
				{
					min=mid+1;
				}
				
			}
			else
			{
				max=mid-1;
			}
		}
		return 0;
	}
											    //3			4		= 12		
	private boolean countOfTeams(int[] arr, int mid, int k) {
		int sum=0;
		for(int i=0;i<arr.length;i++)		//{5,5,4,5};
		{
			sum+=Math.min(mid, arr[i]);			//0,3,6,9,12
		}
		
		if(sum>=mid*k)
			return true;
		else
			return false;
		
	}

}
