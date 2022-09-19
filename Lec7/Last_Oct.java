package Lec7;

public class Last_Oct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,1,2,4,5,3,1,2,4,7};
		int item=3;
		System.out.println(Findindex(arr, item, arr.length-1));

	}
	public static int Findindex(int [] arr,int item,int idx) {
		if(idx<0) {
			return -1;
		}
		
		if(arr[idx]==item) {
			return idx;
		}
		
		return Findindex(arr, item, idx-1);
		
	}

}
