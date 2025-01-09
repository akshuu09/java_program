public class SecondSmallest 
{
    public static void main(String[] args) 
    {
       int[] arr1 = {12, 3, 5, 7, 19, 1, 2};
        int secondSmallest = findSecondSmallest(arr1);
        if (secondSmallest != Integer.MAX_VALUE)
         {
            System.out.println("The second smallest element is: " + secondSmallest);
        } else 
        {
            System.out.println("There is no second smallest element in the array.");
        }
    }
       public static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int arr1 : arr) 
        {
            if (arr1 < smallest) 
            {
                secondSmallest = smallest;
                smallest = arr1; 
            } 
            else if (arr1 < secondSmallest && arr1 != smallest)
             {
                secondSmallest = arr1;
            }
        }
        return secondSmallest;
    }
}