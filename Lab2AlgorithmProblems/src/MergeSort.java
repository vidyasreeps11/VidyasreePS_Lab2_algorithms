
public class MergeSort {
	
	static void DivideArray(int []array, int size)
	{
		if(size<=1)
		{
			return;
		}
			int mid=size/2;
			int lSize=mid;
			int rSize=size-mid;
			
			int[] leftArray=new int [lSize];
			int[] rightArray=new int [rSize];
			
			for(int i=0;i<mid;i++)
				leftArray[i]=array[i];
			
			for(int i=0,j=mid;j<size;j++,i++)
				rightArray[i]=array[j];
			
			DivideArray(leftArray,mid);
			DivideArray(rightArray,size-mid);
		
		
			Merge(array, leftArray, rightArray,mid,size-mid);
		
		
	}
	
	static void Merge(int []array, int []leftArray, int []rightArray, int left, int right)
	{
		int i=0,j=0,k=0;
		
		while(i<left && j<right)
		{
			if(leftArray[i]<=rightArray[j])
			{
				array[k]=leftArray[i];
				i++;
			}
			else
			{
				array[k]=rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i<left)
		{
			array[k]=leftArray[i];
			k++; i++;
		}
		while(j<right)
		{
			array[k]=rightArray[j];
			k++; j++;
		}
	}

}
