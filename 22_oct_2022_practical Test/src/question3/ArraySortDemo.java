package question3;

public class ArraySortDemo {
	public void sortArray(double arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				double temp;
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
							
				}
			}
		
	   }
		System.out.println("Element in array in  descending order:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double array1[]= {12.4,78.4,67.9,69.6};
		ArraySortDemo Obj3=new ArraySortDemo();
		Obj3.sortArray(array1);
	
		}

	}


