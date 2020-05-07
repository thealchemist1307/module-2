/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMS.Project;

import java.util.ArrayList;

/**
 *
 * @author nishit
 */
public class Directory
{
    int global_depth;
    int hash;
    ArrayList<Buckets> buckets;
    int bfr;
    public Directory()
    {
        global_depth=2;
        buckets=new ArrayList<>();
        hash=10;
        bfr=2;
    }
    int gethash(int x)
    {
        return (x%hash);
    }
    
}

