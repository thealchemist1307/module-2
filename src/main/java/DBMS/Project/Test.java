// We will have to ensure that the maximum number of repeated value is less than bfr
package DBMS.Project;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Test
{   public Directory clear()
    {
        Directory Dnew= new Directory();
        Buckets b_initial1=new Buckets();
        Buckets b_initial2=new Buckets();
        for(int i=0;i<(1<<Dnew.global_depth);i++)
        {
            if(i%2==0)
            {
                Dnew.buckets.add(b_initial1); 
            }
            else
            {
                Dnew.buckets.add(b_initial2);
            }
        }
        return Dnew;
    }
    public static void insert(int key,Directory dir)
    {   System.out.println("In Insert");
        int hash_decimal=dir.gethash(key);
        int hash_bin_index=hash_decimal%(1<<dir.global_depth);
        if(dir.global_depth>10)
        {
            System.out.println("Exceptional Case Encountered");
             Test t =new Test();
             Directory D=t.clear();
            return;
        }
        if(dir.buckets.get(hash_bin_index).no_elements==dir.bfr)  // Overflow condition
        {
            int new_temp[]=new int[dir.bfr+1];
            for(int i=0;i<dir.bfr;i++)
            {
                new_temp[i]=dir.buckets.get(hash_bin_index).values[i];
            }
            new_temp[dir.bfr]=key;
            if(dir.buckets.get(hash_bin_index).local_depth==dir.global_depth)  // Increase Global depth 
            {
                for (int j=0;j<(1<<dir.global_depth);j++)   // Increase capacity of directory
                {
                    if(j!=hash_bin_index)
                    {
                        dir.buckets.add(dir.buckets.get(j));
                    }
                    else
                    {
                        Buckets btemp=new Buckets(dir.buckets.get(j));
                        dir.buckets.add(btemp);
                    }
                }
                dir.global_depth++;
                int new_bucket_index=(1<<(dir.global_depth-1))+hash_bin_index;
                dir.buckets.get(hash_bin_index).local_depth++;
                dir.buckets.get(new_bucket_index).local_depth++;
                for(int j=0;j<(dir.bfr+1);j++)
                {
                    insert(new_temp[j],dir);
                }
            }
            else
            {
                Buckets buck1=new Buckets(dir.buckets.get(hash_bin_index));
                Buckets buck2=dir.buckets.get(hash_bin_index);
                buck1.local_depth++;
                buck2.local_depth++;
                for(int j=0;j<(1<<dir.global_depth);j++)
                {
                    if(j%(1<<buck1.local_depth-1)==new_temp[0]%(1<<buck1.local_depth-1))
                    {
                        if(j%(1<<buck1.local_depth)!=j%(1<<buck1.local_depth-1))
                        {
                            dir.buckets.set(j,buck1);
                        }
                        else
                        {
                            dir.buckets.set(j,buck2);
                        }
                    }
                }
                for(int j=0;j<(dir.bfr+1);j++)
                {
                    insert(new_temp[j],dir);
                }
            }
        }
        else  // Insert the element
        {
            int ele=dir.buckets.get(hash_bin_index).no_elements;
            dir.buckets.get(hash_bin_index).values[ele]=key;
            dir.buckets.get(hash_bin_index).no_elements++;
        }
    }
    public static boolean search(int key,Directory dir)
    {
        int hash_val=dir.gethash(key);
        int possible_index=hash_val%(1<<dir.global_depth);
        boolean flag=false;
        int n_ele=dir.buckets.get(possible_index).no_elements;
        for(int i=0;i<n_ele;i++)
        {
            if(dir.buckets.get(possible_index).values[i]==key)
            {
                return true;
            }
        }
        return false;
    }
    
}