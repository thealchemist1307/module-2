/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMS.Project;

/**
 *
 * @author nishit
 */
public class Buckets
{
    int local_depth;
    int no_elements;
    int values[];
    int bfr;
    public Buckets()
    {
        local_depth=1;
        no_elements=0;
        bfr=2;
        values=new int[bfr];
    }
    public Buckets(Buckets Bcp)
    {
        local_depth=Bcp.local_depth;
        no_elements=0;
        Bcp.no_elements=0;
        bfr=2;
        values=new int[bfr];
    }
    
}
