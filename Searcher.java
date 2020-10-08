
/**
 * Uses two methods to search an ArrayList
 *  of sorted elements.
 * 
 * @author GK CPM
 * @version 9/14/18
 */

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class Searcher
{
    private StudentRoster roster = new StudentRoster();
    private ArrayList<Student> myStudentList = roster.getStudentList();
    private int myNumComparisons;

    /**
     * Perform a Linear Search
     * 
     * @param  num   a Student number to search for
     * @return     the Student object if found otherwise null
     */
    public Student linearSearch(int num)
    {
        myNumComparisons = 0;
        
        //search list for num from start to end
        for (Student StudentFromList : myStudentList){
            
          //collect iteration info 
          myNumComparisons++;
          int stuNum = StudentFromList.getStudentNum();
          String stuName = StudentFromList.getStudentName();
          
          //show current student
          System.out.println("Comparison:" + myNumComparisons + ",  Student Num:" + stuNum + ", " + stuName);
          
          if(num == stuNum) return StudentFromList; //student found
          if(num < stuNum) return null; //stop loop because student does not exist
        }
        
        return null; //default
    }
    
    /**
     * Perform a recursive binary Search
     * 
     * @param  num   a Student number to search for
     * @return     the Student object if found otherwise null
     */
    public Student binarySearch(int num)
    {
        myNumComparisons = 0;
        return this.recursiveBinary(0, myStudentList.size() - 1, num);
    }

    /**
     * Private Helper for a recursive binary Search
     * 
     * @param  lowIndex The lowest possible Array element index
     *             that can hold the Student with the number 'find'
     * @param  hiIndex The highest possible Array element index
     *             that can hold the Student with the number 'find'
     * @param  find The student number being searched for
     * @return     the Student if found otherwise null
     */
    private Student recursiveBinary(int loIndex, int hiIndex, int find)
    {
        // your code goes here
        
        return null; //just so it compiles
    }

    /**
     * toString
     * 
     * @return     a String describing the number of comparisons
     *               made in the most recent search
     */
    public String toString()
    {
        return myNumComparisons + " student numbers were compared.";
    }
}
