package com.crudDemo;

import java.util.ArrayList;
import java.util.*;


class Student 
{
	public int id;
	public String name;
	public int marks;
	public Student(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString()
	{
		return id+"..."+name+"..."+marks;
	}
}

public class Demo {
	public static void main(String[] args)
	{
		List<Student> l=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);

		int ch;
		do
		{
			System.out.println("1  insert:-  ");
			System.out.println("2  display:-  ");
			System.out.println("3  search:-   ");
			System.out.println("4   delete:-  ");
			System.out.println("5  update:---");
			System.out.println("enter your choice:-");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.print("enter student id -- ");
				int id=sc.nextInt();
				System.out.print("enter student name--");
				String name=sc1.nextLine();
				System.out.print("enter student marks--");
				int marks=sc.nextInt();

				l.add(new Student(id,name,marks));
				break;

			case 2:
				System.out.println("..........................");
				Iterator itr=l.iterator();
				while(itr.hasNext())
				{
					Student i=(Student)itr.next();
					System.out.println(i);
				}
				break;

			case 3:
				System.out.println("enter student id you want to search");
				int id1=sc.nextInt();
				itr=l.iterator();
				while(itr.hasNext())
				{
					Student s=(Student)itr.next();
					if(s.id==id1)
					{
						System.out.println(s);
					}
				}
				break;
			case  4:
				boolean found=true;
				System.out.println("enter student id to delet");
				int id2=sc.nextInt();
				itr=l.iterator();
				while(itr.hasNext())
				{
					Student s=(Student)itr.next();
					if(s.id==id2)
					{
						itr.remove();
					}

				}
				if(!found)
				{
					System.out.println("record is not found ");
				}
				else
				{
					System.out.println("record succesfully deleted");
				}
				break;
			case 5:
				boolean found1=true;
				System.out.println("enter student id to update");
				int id3=sc.nextInt();
				ListIterator<Student> i=l.listIterator();
				while(i.hasNext())
				{
					Student s=(Student)i.next();
					if(s.id==id3)
					{

						System.out.println("student id");
						int newid=sc.nextInt();
						System.out.println("student new name");
						String name1=sc1.nextLine();
						System.out.println("student marks");
						int newmarks=sc.nextInt();
						i.set( new Student(newid,name1,newmarks) );

					}

				}
				if(!found1)
				{
					System.out.println("record is not found ");
				}
				else
				{
					System.out.println("record succesfully updated");
				}

			}

		}while(ch!=0);


	}
}

