import java.io.IOException;
import java.util.Random;


public class Test_sort {

	public static int[] shakesort(int[] arr)
	{
		int tmp,lang,lneu,lanf=0,lnanf=0;
		lang=arr.length-1;
		do
		{
			lneu=0;
			for (int i=lanf;i<lang;i++)
			{
				if (arr[i]>arr[i+1])
				{
					tmp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tmp;
					lneu=i;
				}
			}
			lang=lneu;
			
			if (lang==0)
				break;
			
			lnanf=lang;
			for (int i=lang;i>lanf;i--)
			{
				if (arr[i]<arr[i-1])
				{
					tmp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=tmp;
					lnanf=i;
				}
			}
			lanf=lnanf;
		}
		while ( lanf!=lang);
		return arr;
	}
	
	public static void main(String[] args) throws IOException
	{
		Random Zahlen;
		Zahlen=new Random();
		int lang2=10,lang1=10;
		int[] arr1= new int[lang1];
		int[] arr2= new int[lang2];
		
		
		for (int i=0;i<arr1.length;i++)
		{
			arr1[i]=Zahlen.nextInt(10);
		}
		
		arr1=shakesort(arr1);
		
		System.out.println("Arr1:");
		for (int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
			
		for (int i=0;i<arr2.length;i++)
		{
			arr2[i]=Zahlen.nextInt(10);
		}
		
		arr2=shakesort(arr2);
		
		System.out.println("Arr2:");
		for (int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println("Bla");
		
		
	}

}
