package Level_1;

public class Distributes_pens {

	public static void main(String[] args) {
		int pens=14;
		int students = 3;
		int extra_pens=pens%students;
		int remaining_pens = pens-extra_pens;
		int Distributed_pens= remaining_pens/students;
		System.out.println(" The Pen Per Student is "+Distributed_pens+"and the remaining pen not distributed is " +extra_pens );

	}

}
