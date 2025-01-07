public class SecondLargest 
{
    public static void main(String[] args) 
    {
       int[] arr1 = {9, 3, 5, 7, 27, 1, 2};
        int secondLargest = findSecondLargest(arr1);
        if (secondLargest != Integer.MIN_VALUE)
         {
            System.out.println("The second Largest element is: " + secondLargest);
        } else 
        {
            System.out.println("There is no second largest element in the array.");
        }
    }
       public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int arr1 : arr) 
        {
            if (arr1 < largest) 
            {
                secondLargest = largest;
                largest = arr1; 
            } 
            else if (arr1 < secondLargest && arr1 != largest)
             {
                secondLargest = arr1;
            }
        }
        return secondLargest;
    }
}