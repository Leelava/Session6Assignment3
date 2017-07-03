package example;
import java.util.Scanner;
		   
public class BINSEARCH {
	//This method takes input as reference to array with integers in ascending order and 
	//the key value to be searched. Binary search requires a sorted collection.This algorithm 
	//requires the elements to be sorted in ascending order.It follows divide and conquer method 
	//Every time it tries to divide the array into two , compares the key with the element if matches
	//the position is returned or else again the array is divided into two. The search happens again in
	//next sub half half of the sub array. So in every iteration search is performed only on 1/2 of the elements
 public int binarySearch(int[] searchArr, int key)
 {
				         
				        int begin = 0; 
				        int end = searchArr.length - 1;
				        while (begin <= end) {
				            int mid = (begin + end) / 2;
				            if (key == searchArr[mid]) {
				                return mid;
				            }
				            if (key < searchArr[mid]) {
				                end = mid - 1;
				            } else {
				                begin = mid + 1;
				            }
				        }
				        return -1;
				    }
/*main method reads the size of the array, elements in ascending order and key 
 value to be searched . It constructs and calls the binarySearch method by passing the array reference and 
 key value.*/
				    public static void main(String[] args) {
				         
				    	BINSEARCH mbs = new BINSEARCH();
				    	int sizeofArray;
				    	
				    	Scanner s=new Scanner(System.in);
						
						System.out.println("Readin the no of elements");
						
						sizeofArray =s.nextInt();  
						
						int searchArray[] = new int[sizeofArray];
						
						System.out.println("enter "+ sizeofArray+" elements in ascending order. As the binary search expects the elements to be sorted either of the order");
						
						for (int index =0;index< sizeofArray; ++index )
						{
							searchArray[index]= s.nextInt(); 
						}
						System.out.println("enter the search value");
						int searchValue =s.nextInt(); 
						int position= mbs.binarySearch(searchArray,searchValue);
						if (position !=-1)
							System.out.println("The position of the Element is  " +(position +1));
						else
							System.out.println("The key not found  ");
				    }
				}