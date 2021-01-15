package sample1;
import java.util.Arrays;

public class MergeArrayProgram 
{
    private static int[] mergeArray(int[] arrayA, int[] arrayB)
    {
        int[] mergedArray = new int[arrayA.length + arrayB.length];
         
        int i=0, j=0, k=0;
        
        //merging arrays a & B into mergredArray 
        
        while (i < arrayA.length && j < arrayB.length)
        {
            if (arrayA[i] < arrayB[j]) 
            {
                mergedArray[k] = arrayA[i];
                i++;
                k++;
            } 
            else
            {
                mergedArray[k] = arrayB[j];
                j++;
                k++;
            }
        } 
                 
        while (i < arrayA.length) 
        {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        } 
                 
        while (j < arrayB.length) 
        {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        } 
             
        return mergedArray;
    }
    public static int removeDuplicateElements(int arr[], int n)
    {  
    	 if (n==0 || n==1){  
             return n;  
         }    
         int j = 0;//for next element  
         for (int i=0; i < n-1; i++){  
             if (arr[i] != arr[i+1]){  
                 arr[j++] = arr[i];  
             }  
         }  
          
         return j;  
    }  
    public static void main(String[] args) 
    {
        int[] arrayA = new int[] {-7, 12, 17, 29, 41, 112, 79};
         
        int[] arrayB = new int[] {-9, -3, 0,5};
         
        int[] mergedArray = mergeArray(arrayA, arrayB);
         
        System.out.println("Array A : "+Arrays.toString(arrayA));
         
        System.out.println("Array B : "+Arrays.toString(arrayB));
                 
        
        
        //Sorting Merged Array
        
        for (int i = 0; i < mergedArray.length; i++)   
        {  
        	for (int j = i + 1; j < mergedArray.length; j++)   
        	{  
        		int tmp = 0;  
        		if (mergedArray[i] > mergedArray[j])   
        {  
        tmp = mergedArray[i];  
        mergedArray[i] = mergedArray[j];  
        mergedArray[j] = tmp;  
        }  
        } 
         
        
        }
      
        System.out.println("Merged Array: "+Arrays.toString(mergedArray));
        int length = mergedArray.length;  
        length = removeDuplicateElements(mergedArray, length);
        System.out.println("Merged Array after removing duplicates : "+Arrays.toString(mergedArray));
          
        }
        
    }

