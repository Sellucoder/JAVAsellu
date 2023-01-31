class Nested_For{
public static void main(String args[]){
	int row=10;
	for(int i=1;i<=row;i++){ //outer loop rows
		for(int j=1;j<=i;++j){ //inner loop colums
			System.out.print(j+" ");
		}
		System.out.println(" ");
	}
}
}

