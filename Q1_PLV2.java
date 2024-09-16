import java.util.ArrayList;
import java.util.Random;
import java.io.*;
public class Q1_PLV2 {

    public static Thread thread1;
	public static Thread thread2;
    public static Thread thread3;
    public static Thread thread4;
    static Random number_generator=new Random();
    static int limited=10000;
    static  double lower_bound=2.0;             //gpa lower
    static  double uper_bound=4.0;              //gpa   upper
    static  int lower_bound_age=18;
    static  int upper_bound_age=30;
    static  int lower_bound_ID=1000;
    static  int upper_bound_ID=99999;
    ////return value////
    static  int th1_age=0;
    static  float th1_gpa=(float)0;
    static  int th2_age=0;
    static  float th2_gpa=(float)0;
    static  int th3_age=0;
    static  float th3_gpa=(float)0;
    static  int th4_age=0;
    static  float th4_gpa=(float)0;
    static  int th5_age=0;
    static  float th5_gpa=(float)0;
    ///////////////////////////////////////////////////////////////
    public static void function1()throws InterruptedException {
        //Random number_generator=new Random();
        ArrayList <Integer> age_list=new ArrayList<Integer>();
        ArrayList <Integer> id_list=new ArrayList<Integer>();
        ArrayList <Float> gpa_list= new ArrayList<Float>();
        float track_gpa1=(float)0;
        int track_age1=0;
		for(int i=0;i<limited;i++)
		{
			  // generator
              float Gpa=(float)(number_generator.nextDouble()*(uper_bound - lower_bound + 1)+ lower_bound);
              int Age=(number_generator.nextInt(upper_bound_age - lower_bound_age)+lower_bound_age);
              //
              track_age1+=Age;
              track_gpa1+=Gpa;
              gpa_list.add(Gpa);
              age_list.add(Age);
              int id1=(number_generator.nextInt((upper_bound_ID-lower_bound_ID+1)+10));
             while(!id_list.contains(id1)==false)
             {
                 id1=(number_generator.nextInt((upper_bound_ID-lower_bound_ID+1)+10));
             }
              id_list.add(id1);
		}
        th1_age=(track_age1/limited);
        th1_gpa=(track_gpa1/(float)limited);
		/*System.out.println("done1");
        System.err.println(track_age1);
        /*System.out.println(track_gpa1);
        System.out.println(th1_age);
        System.out.println(th1_gpa);*/
	}
////////////////////////////////////////////////////////////////////////
	public static void function2()throws InterruptedException {
        //Random number_generator2=new Random();
        ArrayList <Integer> age_list2=new ArrayList<Integer>();
        ArrayList <Integer> id_list2=new ArrayList<Integer>();
        ArrayList <Float> gpa_list2= new ArrayList<Float>();
        float track_gpa2=(float)0;
        int track_age2=0;
		for(int j=0;j<limited;j++)
		{	
			 // generator
             float Gpa=(float)(number_generator.nextDouble()*(uper_bound - lower_bound + 1)+ lower_bound);
             int Age=(number_generator.nextInt(upper_bound_age - lower_bound_age)+lower_bound_age);
             //
             track_age2+=Age;
             track_gpa2+=Gpa;
             gpa_list2.add(Gpa);
             age_list2.add(Age);
             int id2=(number_generator.nextInt((upper_bound_ID-lower_bound_ID+1)+10));
             while(!id_list2.contains(id2)==false)
             {
                 id2=(number_generator.nextInt((upper_bound_ID-lower_bound_ID+1)+10));
             }
             id_list2.add(id2);
		}
        th2_age=(track_age2/limited);
        th2_gpa=(track_gpa2/(float)limited);
       // System.out.println(th2_age);
        /*System.out.println(th2_gpa);
		System.out.println("done2");
        System.out.println(track_age2);
        System.out.println(track_gpa2);*/
    } 
    ////////////////////////////////////////////////////////////////////
    public static void function3()throws InterruptedException {
        //Random number_generator2=new Random();
        ArrayList <Integer> age_list3=new ArrayList<Integer>();
        ArrayList <Integer> id_list3=new ArrayList<Integer>();
        ArrayList <Float> gpa_list3= new ArrayList<Float>();
        float track_gpa3=(float)0;
        int track_age3=0;
		for(int k=0;k<limited;k++)
		{	
			 // generator
             float Gpa=(float)(number_generator.nextDouble()*(uper_bound - lower_bound + 1)+ lower_bound);
             int Age=(number_generator.nextInt(upper_bound_age - lower_bound_age)+lower_bound_age);
             //
             track_age3+=Age;
             track_gpa3+=Gpa;
             gpa_list3.add(Gpa);
             age_list3.add(Age);
             int id3=(number_generator.nextInt((upper_bound_ID-lower_bound_ID+1)+10));
             while(!id_list3.contains(id3)==false)
             {
                 id3=(number_generator.nextInt((upper_bound_ID-lower_bound_ID+1)+10));
             }
             id_list3.add(id3);
		}
        th3_age=(track_age3/limited);
        th3_gpa=(track_gpa3/(float)limited);
       // System.out.println(track_age3);
    }
    ////////////////////////////////////////////////////////////////////
    public static void function4()throws InterruptedException {
        //Random number_generator2=new Random();
        ArrayList <Integer> age_list4=new ArrayList<Integer>();
        ArrayList <Integer> id_list4=new ArrayList<Integer>();
        ArrayList <Float> gpa_list4= new ArrayList<Float>();
        float track_gpa4=(float)0;
        int track_age4=0;
		for(int z=0; z<limited;z++)
		{	
			 // generator
             float Gpa=(float)(number_generator.nextDouble()*(uper_bound - lower_bound + 1)+ lower_bound);
             int Age=(number_generator.nextInt(upper_bound_age - lower_bound_age)+lower_bound_age);
             //
             track_age4+=Age;
             track_gpa4+=Gpa;
             gpa_list4.add(Gpa);
             age_list4.add(Age);
             int id4=(number_generator.nextInt((upper_bound_ID-lower_bound_ID+1)+10));
             while(!id_list4.contains(id4)==false)
             {
                 id4=(number_generator.nextInt((upper_bound_ID-lower_bound_ID+1)+10));
             }
             id_list4.add(id4);
		}
        th4_age=(track_age4/limited);
        th4_gpa=(track_gpa4/(float)limited);
    }
    public static void function5()throws InterruptedException {
        //Random number_generator2=new Random();
        ArrayList <Integer> age_list5=new ArrayList<Integer>();
        ArrayList <Integer> id_list5=new ArrayList<Integer>();
        ArrayList <Float> gpa_list5= new ArrayList<Float>();
        float track_gpa5=(float)0;
        int track_age5=0;
		for(int z=0; z<limited;z++)
		{	
			 // generator
             float Gpa=(float)(number_generator.nextDouble()*(uper_bound - lower_bound + 1)+ lower_bound);
             int Age=(number_generator.nextInt(upper_bound_age - lower_bound_age)+lower_bound_age);
             //
             track_age5+=Age;
             track_gpa5+=Gpa;
             gpa_list5.add(Gpa);
             age_list5.add(Age);
             int id5=(number_generator.nextInt((upper_bound_ID-lower_bound_ID+1)+10));
             while(!id_list5.contains(id5)==false)
             {
                 id5=(number_generator.nextInt((upper_bound_ID-lower_bound_ID+1)+10));
             }
             id_list5.add(id5);
		}
        th5_age=(track_age5/limited);
        th5_gpa=(track_gpa5/(float)limited);
        //System.out.println(track_age5);
    }
    ////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args)throws Exception {
        long startTime = System.nanoTime();
        thread1	= new Thread
		(
			new Runnable()
			{
				public void run()
				{
					try
					{
						function1();
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
        );
       
        thread2	= new Thread
		(
			new Runnable()
			{
				public void run()
				{
					try
					{
						function2();
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
        );
        thread3	= new Thread
		(
			new Runnable()
			{
				public void run()
				{
					try
					{
						function3();
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
        );
        thread4	= new Thread
		(
			new Runnable()
			{
				public void run()
				{
					try
					{
						function4();
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
        );
       
        System.out.println("thread1 now running ");
		thread1.start();
        System.out.println("thread2 now running ");
        thread2.start();
        System.out.println("thread3 now running");
        thread3.start();
        System.out.println("thread4 now running ");
        thread4.start();
        System.out.println("main thread now starting ");
        function5();
        //check thread alive/join
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        //System.out.println("done");
        int final_age=((th1_age+th2_age+th3_age+th4_age+th5_age)/5);
        float final_gpa=((th1_gpa+th2_gpa+th3_gpa+th4_gpa+th5_gpa)/(float)5);
        System.out.println("final age average: " + final_age+"\n"+"Final Gpa average: "+final_gpa);
        long endTime = System.nanoTime();
        System.out.println("runtime: "+((endTime-startTime)/1000000)+"ms");
       // System.out.println("thread1: " + th1_age +"thread2: "+th2_age+"thread3: "+th3_age+"thread4: "+th4_age+"thread5: "+th5_age);
    }   
    
}

