	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	public class PrintDuplicatePrc {		
		public void methodArrays() {
		//	int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20,20 };
			int[] arr = {1,3,8,3,11,5,6,4,7,6,7};
			int length = arr.length;
			Arrays.sort(arr);
			for (int i = 0; i < length-1; i++) {
				//System.out.print(arr[i]);
				//for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[i+1]) {
						System.out.println(arr[i]);
		}
			}
		}
		public void methodArrays1() {
			//int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20,20 };
			int[] arr = {1,3,8,3,11,5,6,4,7,6,7};
			int length = arr.length;
			Arrays.sort(arr);
			for (int i = 0; i < length-1; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[j])
						System.out.println(arr[i]);
		
			}
		}
		}
		public void methodCollections() {
		//	int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20,20 };
			int[] arr = {1,3,8,3,11,5,6,4,7,6,7};	
			List<Integer> inputs = new ArrayList<Integer>();
			for (Integer unique : arr) {
				if (!inputs.contains(unique)) {
					
			inputs.add(unique);
					
				}else {
					System.out.println(unique);
				}
			}
		}
		
		public static void main(String[] args) {
			PrintDuplicatePrc obj = new PrintDuplicatePrc();
		obj.methodArrays();		
		System.out.println("---------------------------------");
		obj.methodArrays1();
		System.out.println("---------------------------------");
		obj.methodCollections();
		}
	}

