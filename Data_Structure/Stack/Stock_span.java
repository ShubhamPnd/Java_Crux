// java implementation for brute force method to calculate stock span values

import java.util.arrays;

class gfg {
	// method to calculate stock span values
	static void calculatespan(int price[], int n, int s[])
	{
		// span value of first day is always 1
		s[0] = 1;

		// calculate span value of remaining days by linearly checking
		// previous days
		for (int i = 1; i < n; i++) {
			s[i] = 1; // initialize span value

			// traverse left while the next element on left is smaller
			// than price[i]
			for (int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--)
				s[i]++;
		}
	}

	// a utility function to print elements of array
	static void printarray(int arr[])
	{
		system.out.print(arrays.tostring(arr));
	}

	// driver program to test above functions
	public static void main(string[] args)
	{
		int price[] = { 10, 4, 5, 90, 120, 80 };
		int n = price.length;
		int s[] = new int[n];

		// fill the span values in array s[]
		calculatespan(price, n, s);

		// print the calculated span values
		printarray(s);
	}
}
