package Arrays;

public class Array2 
{
public static void main(String[] args)
{
int arr[][]=new int [2][2];
arr[0][0]=10;
arr[0][1]=4;
arr[1][0]=21;
arr[1][1]=15;
for(int []x:arr)
{
	for(int y:x)
	{
		System.out.println(y+"");
	}
	System.out.println();
}


}
}
