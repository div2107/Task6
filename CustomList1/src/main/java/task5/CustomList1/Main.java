package task5.CustomList1;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
	private static final Logger LOGGER=LogManager.getLogger(Main.class);
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	     int a,b;
	     int ch1=1;
	     CustList1<Integer> lis= new CustList1<Integer>();
	     //Adding List elements
	     lis.add(1);
	     lis.add(2);
	     lis.add(3);
	     lis.add(4);
	     lis.add(5);
	     lis.add(6);
	     lis.add(7);
	     lis.add(8);
	     lis.add(9);
	     lis.add(10);
	     //Printing list
	     LOGGER.info(lis);
	     //Removing elements
	     lis.remove(1);//Passing index
	     lis.remove(2);
	     //Printing list
	     LOGGER.info(lis);
	     //Fetching elements
	     a=lis.get(1);
	     b=lis.get(2);
	     //Printing those elements
	     LOGGER.info(a+" "+b);
	    
	      while(ch1==1)
	      {
	    	  LOGGER.info("Enter the operation you want to perform\n3.Addition \n 4.Removing \n 5.Fetching \n 6.Printing");
	         int ch=s.nextInt();
	         switch(ch)
	         {
	        	case 3: LOGGER.info("Enter an element to add");
	        			int ad=s.nextInt();
	        			 lis.add(ad);
	        			 break;
	        		case 4:LOGGER.info("Enter index of the element that has to be removed");
	        		       int in=s.nextInt();
	        		       lis.remove(in);
	        		       break;
	                case 5:LOGGER.info("Enter index of element that has to be fetched");
	        		       int fe=s.nextInt();
	        		       lis.get(fe);
	        		       break;
	        		case 6:LOGGER.info(lis);
	        		       break;
	        		default:LOGGER.info("Sorry,you entered an invalid operation!!!Please enter a valid one");
	        		        break;
	        	  }
	         LOGGER.info("Do you want to continue??(1/2)");
	         LOGGER.info("1.Yes  2.No");
	        	    ch1=s.nextInt();
	        }
	        	
	        }
	}
