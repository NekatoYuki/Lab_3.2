import java.util.Arrays;

public class Merge_Partition
{
	public static void main(String[] args)
	{
		String list1[] = {"a","c","e","f","h","u"};  //list1 
		String list2[] = {"b","d","g","i","j","l"};  //list2
		int [] test3 = {3,4,2,7,12,22,0,1};
		
		
		long start = System.nanoTime();
		String merge[] = merge(list1, list2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge test took: " + time  + "nanoseconds");
		System.out.println(Arrays.toString(merge));
	}

	public static String[] merge(String[] list1, String[] list2)
	{
		String merge[] = new String [list1.length + list2.length]; //string merge will equals the sum length of list 1 and list 2
		int i = 0; //index of list 1
		int j = 0; //index of list 2
		int m = 0; //index of string merge
		while (i <= list1.length && j <= list2.length && m<=list1.length+list2.length) //for as long as index m = 0 and length of string merge is less than the sum of list1 and list2 increment m up by 1
		{ //lists all conditionals for when to assign each list index to the string index
			if ((list1[i].compareTo(list2[j])==1) || (list1[i].compareTo(list2[j])==0))
			{
				merge[m]=list2[j];
				j++;
			}
			else if (list1[i].compareTo(list2[j])==-1)
			{
				merge[m]=list1[i];
				i++;
			}
			if (i==list1.length)
			{
				for (int two = j; j <list2.length; two++)
				{
					merge[m]=list2[two];
				}
			 }
			if (j==list2.length)
			{
				for (int one = i; i <list1.length; one++)
				{
					merge[m]=list1[one];
				}
			}
			m++;
		}
		return merge;
	}
	
/*	public static int Partition (int[] list3)
	{
		
	}*/
}
