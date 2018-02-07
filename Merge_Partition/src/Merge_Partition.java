
public class Merge_Partition
{
	public static void main(String[] args)
	{
		String list1[] = {"a","c","e","f","h","u"};  //list1 
		String list2[] = {"b","d","g","i","j","l"};  //list2
		String merge[] = Merge_Partition.merge(list1, list2);
	}

	public static String[] merge(String[] list1, String[] list2)
	{
		String merge[] = new String [list1.length + list2.length]; //string merge will equals the sum length of list 1 and list 2
		int i = 0; //index of list 1
		int j = 0; //index of list 2
		int m = 0; //index of string merge
		for (m=0; m < list1.length+list2.length; m++) //for as long as index m = 0 and length of string merge is less than the sum of list1 and list2 increment m up by 1
		{ //lists all conditionals for when to assign each list index to the string index
			if (i==list1.length)
			{
				list2[j]=merge[m];
				j++;
				m++;
			}
			else if (j==list2.length)
			{
				list1[i]=merge[m];
				i++;
				m++;
			}
			else if ((list1[i].compareTo(list2[j])==1) || (list1[i].compareTo(list2[j])==0))
			{
				list2[j]=merge[m];
				j++;
				m++;
			}
			else if (list1[i].compareTo(list2[j])==-1)
			{
				list1[i]=merge[m];
				i++;
				m++;
			}
		}
	}
}

/*	public static int partition(int[] list)
	{
		int pivot = list[0];
		while (list[0])
	}
}
