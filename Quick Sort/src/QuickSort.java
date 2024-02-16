class QuickSort{

public static void print(int [] arr)   ///printing 
	{
		for (int i = 0; i < arr.length; i++) {  //n
			System.out.print(arr[i] + ", ");
		}
		System.out.println();		
	}

	public static void quickSort(int[] arr, int l, int h)   //acts as wrapper function
	{
		if(l < h) //0<7//0<4//0<3
		{
			int pi = partition(arr, l, h); //pi=5
			System.out.println(l+"= low ,"+h+" =high "+pi+" = pi");
			quickSort(arr, l, pi-1); ///1,2,8,10,15,17,65,25
			//System.out.println(l+"= low ,"+h+" =high "+pi+" = pi");
			
			quickSort(arr, pi+1, h); ///1,2,8,10,15,17,25,65
		}
	}

	private static int partition(int[] arr, int l, int h) //
	{
		int p=h;//7
		int j=l;//0
		int i=l-1;//-1
		
		while(j != p) //0!=7//1!=7//2!=7//3!=7//4!=7//5!=7//6!=7//false
		{
			if(arr[j] < arr[p])//15<17
			{
				i++;
				//Swap arr[j], arr[i]
				int tmp=arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}
			j++;
		}  ///****OKAY****
		
		i++;    //unconditional swap
		//Swap arr[j], arr[i]
		int tmp=arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
		
		return i;  
	}
}