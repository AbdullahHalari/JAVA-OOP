public class lab3task2
{

   public static void main(String[] args) 
{

   int arr[] = new int[5];
    int sum = 0;

        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = Integer.parseInt(args[i]);
            sum = sum +arr[i];
            
        }
        System.out.println(sum);
    
    } 
}