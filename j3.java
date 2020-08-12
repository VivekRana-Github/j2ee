public class ShiftOperator {
	public static void main(String[] args){
		int num =-16;// 
		int numb =16;
		int num1=num<<1;//00110
		int num2=num>>1;
		int num3=num>>>1;
		int num4=numb>>>1;
		int num5=numb>>1;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);

	}

}
//16*0000 0000 0000 0000 0000 0000 0001 0000
//1's complement of 16= 1111 1111 1111 1111 1111 1111 1110 1111 
//2's complement of 16= 1111 1111 1111 1111 1111 1111 1111 0000
//-16>>>1=0111 1111 1111 1111 1111 1111 1111 1000
