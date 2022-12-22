package Day_01;

import java.util.Scanner;

public class Test_1 
{
	public static void Test01 (String[] args) 
	{
		//메인이 두개가 않되니 해보는 테스트 두개제
		System.out.println("오늘 방학특강 첫 수업 입니다.");
		while (true)
		{
			System.out.println("기쁘신가요?");
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			
			if (s != 0)
			{
				continue ;
			}
			
			break;
		}
		
	}
}
