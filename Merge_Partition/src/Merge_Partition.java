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
		
		start = System.nanoTime();
		int pivotFinalPos = Partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition test took: " + time + "nanoseconds");
		System.out.println("Final Pivot Position: " + pivotFinalPos);
		System.out.println(Arrays.toString(test3));
	}

	public static String[] merge(String[] list1, String[] list2)
	{
		String merge[] = new String [list1.length + list2.length]; //string merge will equals the sum length of list 1 and list 2
		int i = 0; //index of list 1
		int j = 0; //index of list 2
		int m = 0; //index of string merge
		while ( i < list1.length && j < list2.length && m < merge.length)
		{ //lists all conditionals for when to assign each list index to the string index
			if (list1[i].compareTo(list2[j]) <= 0)
			{
				merge[m]=list1[i];
				j++;
			}
			else if (list1[i].compareTo(list2[j]) > 0)
			{
				merge[m]=list2[j];
				i++;
			}
			m++;
		}
		if (j == list2.length)
		{
			for (int x = i; x < list1.length; x++)
			{
				merge[m] = list1[x];
				m++;
			}
		}
		if (i == list1.length)
		{
			for (int y =j; y < list2.length; y++)
			{
				merge[m] = list2[j];
				m++;
			}
		}
		return merge;
	}

	
	public static int Partition (int[] list3)
	{
			int front = 0;
			int pivot = list3[front]; 
			int back =list3.length-1; 
			for (int i = 1; i < list3.length; i++)
			{
				if (list3[i] <= pivot)
				{
					int temp = list3[front]; //swap method
					list3[front] = list3[back];
					list3[back] = temp;
					front = i;
				}
				else if (list3[i] > pivot && back > i)
				{
					int temp = list3[front]; //swap method
					list3[front] = list3[back];
					list3[back] = temp;
					back--;
					i--;
				}
			}
			return front;
		}
}
