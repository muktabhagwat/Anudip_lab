package ThreadsAndException;

/*Q. Write a Java program using Synchronized Threads, which demonstrates Producer Consumer concept.
*/

		class Producer//Producer//resource
		{  
			//synchronized method :Lock the resources to a thread we share same resource between 
			//multiple threads or process
			synchronized void print() //synchronized by method
			{
			
				System.out.println("Reverse Order:");
				for(int i=9;i>=1;i--)
				{
					System.out.println(i);
				}
			}
		 } 
		
			class Consumer1 extends Thread//Consumer 1
			{  
				Producer  p; // 
				Consumer1(Producer p)
				{  
					this.p=p;  
				}  
				public void run()
				{  
					System.out.println("This is run method in Thread 1 = ");
					p.print();  
				}    
			}
			
			class Consumer2 extends Thread //Consumer 1
			{  
				Producer p;  
				Consumer2(Producer p)
				{  
					this.p=p;  
				}  
				public void run()
				{  

					System.out.println("This is run method in Thread  2 = ");
					p.print();  
				}  
			}  
			  
		public class Synchronisation //Synchronisation occur
			{  
				public static void main(String args[])
				{  
					Producer obj = new Producer();
					Consumer1 p1=new Consumer1(obj);
					
					Consumer2 p2=new Consumer2(obj);  
					
					p1.start();  //
					p2.start(); 
				}  
			}

