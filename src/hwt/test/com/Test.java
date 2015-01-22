package hwt.test.com;


public class Test {
	
	public static void main(String[] args) {
		int[] data = {4,1,2,8,5,0,3};
		merge(data, 0, 6);
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			
		}
	}
	
	public static void merge(int[] data , int left ,int right){
		if (left >= right) {
			return;
		}
		
		int middle = (left + right) / 2; 
		merge(data, left, middle);
		merge(data, middle + 1, right);
		
		sort(data, left, middle, right);
	}
	
	public static void sort(int[] data,int left,int middle ,int right){
		int[] tmpArr = new int[right- left + 1];
		int tmpIndx = 0;
		int tLeft_start = left;
		int tRight_start = middle + 1;
		
		while (tLeft_start <= middle && tRight_start <= right) {
			if (data[tLeft_start] <= data[tRight_start]) {
				tmpArr[tmpIndx++] = data[tLeft_start++];
			}else {
				tmpArr[tmpIndx++] = data[tRight_start++];
			}
		}
		
		while (tLeft_start <= middle) {
			tmpArr[tmpIndx++] = data[tLeft_start++];
		}
		while (tRight_start <= right) {
			tmpArr[tmpIndx++] = data[tRight_start++];
		}
		
		for (int i = 0,len=tmpArr.length; i < len; i++) {
			data[left++] = tmpArr[i];
		}
	}
}
