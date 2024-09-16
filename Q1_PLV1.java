import java.util.ArrayList;
import java.util.Random;
import java.io.*;
public class Q1_PLV1 
{
    public static Thread thread1;
	public static Thread thread2;
    static Random number_generator=new Random();
    static int limited=25000;
    static  double lower_bound=2.0;             //gpa lower
    static  double uper_bound=4.0;              //gpa   upper
    static  int lower_bound_age=18;
    static  int upper_bound_age=30;
    static  int lower_bound_ID=1000;
    static  int upper_bound_ID=99999;
    static  int th1_age=0;
    static  float th1_gpa=(float)0;
    static  int th2_age=0;
    static  float th2_gpa=(float)0;
    ///////////////////////////////////////////////////////////////
    public static void function1()throws InterruptedException {
        ///Random number_generator=new Random();
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
    } 
    ////////////////////////////////////////////////////////////////////
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
       // System.out.println("thread1 now running ");
		thread1.start();
        //System.out.println("thread2 now running ");
        thread2.start();
        //check thread alive/join
        thread1.join();
        thread2.join();
        //System.out.println("done");
        long endTime = System.nanoTime();
        int final_age=((th1_age+th2_age)/2);
        float final_gpa=((th1_gpa+th2_gpa)/(float)2);
        System.out.println("final age average: " + final_age+"\n"+"Final Gpa average: "+final_gpa);
        System.out.println("runtime: "+((endTime-startTime)/1000000)+"ms");
    }   
    
}
