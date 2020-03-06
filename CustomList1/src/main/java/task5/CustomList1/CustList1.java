package task5.CustomList1;
import java.util.Arrays;
	public class CustList1<C>{
		 private int size=0;//size of list
		 private static int init_capacity=10;
		 private Object[] lis;
		 public CustList1()
		 {
			 lis=new Object[init_capacity];
		 }
		 public void add(C val)
		 {
			 if(size==lis.length)
			 {
				 increaseCapacity();
			 }
			 lis[size++]=val;
		}
		 public void increaseCapacity()
		 {
			 int newlislength=lis.length*2;
			 lis=Arrays.copyOf(lis, newlislength);
		 }
		 public C get(int ind)
		 {
		      if(ind>=size ||ind<0) 
		      {
		         throw new IndexOutOfBoundsException("Index error");
		     }
		      return (C) lis[ind];
		  }
		 public C remove(int ind)
		 {
			  if(ind>=size ||ind<0) 
			  {
			      throw new IndexOutOfBoundsException("Index error");
			  }
			  Object item=lis[ind];
			  int num=lis.length-(ind+1);
			  System.arraycopy(lis, ind+1, lis, ind, num);
			  size--;
			  return (C) item;
			 
			 }
		 public String toString()
		   {
		        StringBuilder sb = new StringBuilder();
		        sb.append('[');
		        for(int i = 0; i < size ;i++) {
		            sb.append(lis[i].toString());
		            if(i<size-1){
		                sb.append(",");
		            }
		        }
		        sb.append(']');
		        return sb.toString();
		   }
		 
	}
