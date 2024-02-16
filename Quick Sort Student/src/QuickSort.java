class QuickSort{
	

    public static void print(Student []arr)   ///printing 
	{
		for (int i = 0; i < arr.length; i++) {  //n
			System.out.print(arr[i] + ", ");
		}
		System.out.println();		
	}

	public static void quickSort(Student []arr, int l, int h)   //acts as wrapper function
	{
		if(l < h) //0<7//0<4//0<3
		{
			int pi = partition(arr, l, h); //pi=5
			//System.out.println(l+"= low ,"+h+" =high "+pi+" = pi");
			quickSort(arr, l, pi-1); ///1,2,8,10,15,17,65,25
			//System.out.println(l+"= low ,"+h+" =high "+pi+" = pi");
			
			quickSort(arr, pi+1, h); ///1,2,8,10,15,17,25,65
		}
	}

	private static int partition(Student []arr, int l, int h) 
	{
		int p=h;
		int j=l;
		int i=l-1;
		
		while(j != p) //0!=7
		{
			if(arr[j].getAge() < arr[p].getAge())
			{
				i++;
				//Swap arr[j], arr[i]
				Student tmp=arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}
			j++;
		}  ///****OKAY****
		
		i++;    //unconditional swap
		//Swap arr[j], arr[i]
		Student tmp=arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
		
		return i;  
	}
}