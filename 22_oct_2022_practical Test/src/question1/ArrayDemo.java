package question1;

public class ArrayDemo {
	public void manipulateIntegerArray(int array[]){
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+5);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		
		ArrayDemo demoObj=new ArrayDemo();
		demoObj.manipulateIntegerArray(arr);

	}

}
