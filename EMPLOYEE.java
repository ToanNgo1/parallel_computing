import java.util.Map.Entry;
import java.util.*;
public class EMPLOYEE
{   //variable
    public static Thread thread1;
	public static Thread thread2;
    public static ArrayList<Integer> List1= new ArrayList<Integer>();
    public static ArrayList<Integer> List2= new ArrayList<Integer>();
    //thread1
    public static void function1()throws InterruptedException 
    {
        Collections.sort(List1);      //it sort ascending order by defaut 
        //System.out.println("test1");
    }
    //thread2
    public static void function2()throws InterruptedException 
    {
        Collections.sort(List2);
        //System.out.println("test2");
    }
    public static void main(String[] args)throws Exception
    {   //thread1 and 2
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
        //System.out.println("test");
        int count=0;
        int lower_bound_ID=1;
        int upper_bound_ID=10000;
        int lower_bound_salary=1500;
        int upper_bound_salary=4000;
        ArrayList<Integer> id_check=new ArrayList<Integer>();
        //hashmap for employee
        HashMap<Integer,Integer> EmpList= new HashMap<>();
        //generation value
        Random number_generator=new Random();
           // int id=0;
        while(count<10000)  //limitation
        {   ///genarate value

            int salary= (number_generator.nextInt(upper_bound_salary - lower_bound_salary)+lower_bound_salary);
            /* id +=1;*/
            int id=(number_generator.nextInt(upper_bound_ID-lower_bound_ID+1)+lower_bound_ID);
            while(!id_check.contains(id)==false)
            {
                //System.out.println(id);
                id=(number_generator.nextInt((upper_bound_ID-lower_bound_ID+1)+lower_bound_ID));
                //System.out.println(id_check.contains(id));
            }
                  id_check.add(id);
                  count+=1;
                  //add value to hashmap
           /* if(count<10)
                {System.out.println(id);}*/
                EmpList.put(id,salary);
        }
        //System.err.println(EmpList.size());
        //map now populated
        int get_half=count/2;
        int test=0;
        for(Entry<Integer, Integer> value: EmpList.entrySet())//key are id, value are salary
        {   
            if(test<get_half)
            {
                test+=1;
             //   System.out.println(id_salary+" check");
                //System.out.println("first inter loop value"+ value.getValue()+","+ value.getKey());
                List1.add(value.getValue());
            }
            else if(test>=get_half)
            {   test+=1;
                //System.out.println(value+" check");
                //System.out.println("second inter loop value"+ value.getValue()+","+value.getKey());
                List2.add(value.getValue());

            }

        }
        //System.out.println(List1.size());
        //System.out.println(List2.size());
        //System.out.println(List1);
        //System.out.println();
        //System.out.println("///////////////");
        //run the thread
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        //System.out.println(List1);
        LinkedHashMap<Integer,Integer> sortedMap= new LinkedHashMap<>();
        int count2=0;
        //Set<Integer> setlist = new HashSet<Integer>(List1);
        //Set<Integer>  setlist2= new HashSet<Integer>(List2);
        Set<Integer> merge=new HashSet<>();
        merge.addAll(List1);
        merge.addAll(List2);
        //System.out.println(merge.size());
        //sorted main
        for(int salary: merge)//for everyvalue in the set
        {
            for (Map.Entry<Integer, Integer> value : EmpList.entrySet()) {
                if (value.getValue().equals(salary)) {
                    sortedMap.put(value.getKey(), salary);
                    //System.err.println(value.getKey()+","+salary);
                }
            }

        }
        //System.out.println(sortedMap.size());
        //System.out.println(EmpList.size());
        //System.out.println(sortedMap);
        EmpList=sortedMap;
        System.out.println(EmpList);
    }   

}
