
public class MoveToRight {
		public static void main(String[] args) {
			int[] num = {4,0,3,0,1,5,2,0};
			int length = num.length;
			int count=0;
			
			for (int i = 0; i <length; i++) {
				if(num[i] !=0) {
					num[count++]=num[i];
				}
			}
			while(count<length) {
				num[count++]=0;
			
			}
			for (int j = 0; j < num.length; j++) {
				System.out.print(num[j]+" ");
			}
		}
		}



