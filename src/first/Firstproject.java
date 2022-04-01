package first;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Firstproject {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to LockedMe.com Application\n");
		int Number = 0;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
        System.out.println("For Creating and Adding a File Type-1");
		System.out.println("For Deleting a File Type-2");
		System.out.println("For Displaying a File Type-3");
		System.out.println("For Searching a File Type-4");
          Number = sc.nextInt();
		switch(Number) {
		
		case 1:
			String path="C:\\Firstphase\\";
			Scanner sc1 = new Scanner(System.in);
			ArrayList<String> al=new ArrayList<>();
			while(true) {
			System.out.println("Enter the File name to Create:-");
			String filename=sc1.nextLine();
			String finalname=path+filename;
			System.out.println(finalname);

			//  Creating a File 

			File f=new File(finalname);
			boolean b=f.createNewFile();
			if(b!=true) {
				System.out.println("The File is not Created");
			}
			else {
				al.add(filename);
				System.out.println(" The File is Created");
			break;
			}
               System.out.println("The Collection of Files is "+ al);
			}
			break;
		case 2:
			
			//  Deleting a File
			String path1="C:\\Firstphase\\";
			File f1=new File(path1);
			File filename3[]=f1.listFiles();
			Scanner sc2=new Scanner(System.in);
			System.out.println("Enter the Name of File to be Deleted:-");
			String filename=sc2.next();
			String finalfile=path1+filename;
			File file=new File(finalfile);
			
			int flag1=0;
			for(File ff:filename3) {
			if(ff.getName().equals(filename)) {
				flag1=1;
				break;
				}
		
			else {
				flag1=0;
			}
			}
			if(flag1==1) {
				file.delete();
				System.out.println("The File is Deleted");
			}
			else {
				System.out.println("The File is not found");
			}
			
			break;
				
		case 3:
			//  Displaying all the Files in order
			
			String path2="C:\\Firstphase\\";
			File f2=new File(path2);
			File filename1[]=f2.listFiles();
			for(File ff:filename1) {
				System.out.println(ff.getName());}
			break;
			
		case 4:
			
			// Searching a File
			String path3="C:\\Firstphase\\";
			File f3=new File(path3);
			Scanner sc3=new Scanner(System.in);
			System.out.println("Enter the Name of File to Search:-");
			String filesearchname=sc3.nextLine();
			File filename2[]=f3.listFiles();
			int flag=0;
			for(File ff:filename2) {
				if(ff.getName().equals(filesearchname)) {
					flag=1;
					break;
				}
				else {
					flag=0;
				}
				}

			if(flag==1) {
				System.out.println("The File is Found");
			}
			else {
				System.out.println("The File is not Found");
			}
			break;
			
		case 5:
			 System.exit(0);
			 break;
			
            }
		  }
      }
}		
	



	


