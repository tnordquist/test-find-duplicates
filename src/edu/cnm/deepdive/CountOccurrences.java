package edu.cnm.deepdive;

public class CountOccurrences {

  // Returns number of times x occurs in arr[0..n-1]
  static int countOccurrences(int arr[], int n, int x)
  {
    int res = 0;
    for (int i=0; i<n; i++)
      if (x == arr[i])
        res++;
    return res;
  }

  public static void main(String args[])
  {
    int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
    int n = arr.length;
    int x = 2;
    System.out.println(countOccurrences(arr, n, x));

    int arr2[] = {1, 1, 2, 2, 2, 2, 3,};
    int n2 = arr2.length;
    int x2 = 2;
    System.out.println(countOccurrences(arr2, n2, x2));
  }

}
