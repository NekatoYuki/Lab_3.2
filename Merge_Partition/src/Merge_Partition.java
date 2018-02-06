
public class Merge_Partition {
	
	public static String merge(String[] list1, String[] list2)
	{
		String merge = "";
		int i = 0;
		int j = 0;
		while (merge.length()< (list1.length + list2.length))
		{
			if (i==list1.length)
			{
				;
				j++;
			}
			else if (j==list2.length)
			{
				;
				i++;
			}
			else if ((list1[i].compareTo(list2[j])==1) || (list1[i].compareTo(list2[j])==0))
			{
				;
				j++;
			}
			else if (list1[i].compareTo(list2[j])==-1)
			{
				;
				i++;
			}
		}
		return merge;
		

	}

}
