import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;

class Main {
  public static void main(String[] args) {
    
    
  }

  public static double findLargest(ArrayList<Double> a)
  {
    ArrayList<Double> newList = new ArrayList(a.size());
    int ind = 0;
    for(double number: a)
    {
      newList.add(ind, number);
      ind++;
    }
    Collections.sort(newList);
    return newList.get(newList.size()-1);
  }
  public static int indexOfLargest(ArrayList<Double> a)
  {
    ArrayList<Double> newList = new ArrayList(a.size());
    int ind = 0;
    for(double num: a)
    {
      newList.add(ind, num);
      ind++;
    }
    Collections.sort(newList);
    int out = 0;
    for(int i = 0; i < a.size(); i++)
    {
      if(newList.get(newList.size()-1) == a.get(i))
      {
        out = i;
        break;
      }
    }
    return out;
  }

  public static int indexOfInt(ArrayList<Integer> a, int target)
  {
    int ind = 0;
    for(int number: a)
    {
      if(a.get(ind) == target)
      {
        return ind;
      }
      ind++;
    }
    return -1;
  }

  public static boolean hasSameElements(ArrayList<Integer>  a, ArrayList<Integer>  b)
  {
    Collections.sort(a);
    Collections.sort(b);

    for(int i = 0; i < a.size(); i++)
    {
      if(a.get(i) != b.get(i))
      {
        return false;
      }
    }
    return true;
  }

  public static void removeEvenLength(ArrayList<String> a)
  {
    //Look at each string
    Iterator<String> it = a.iterator();

    while (it.hasNext())
    {
      String str = it.next();

      if(str.length() % 2 == 0)
      {
        it.remove();
      }
    }
  }

  public static void removeDuplicates(ArrayList<Integer> a)
  {
    int i = 0;
    int j = 1;
    int k = 2;
    while(j != a.size())
    {
      if(k == a.size())
      {
        break;
      }
      if(a.get(i) == a.get(j))
      {
        if(a.get(j) == a.get(k))
        {
          a.remove(k);
          a.remove(j);
        }
        else
        {
          a.remove(j);
        }
      }
      i++;
      j++;
      k++;
    }
  }

  public static void swapPairs(ArrayList<String> a)
  {
    int i = 0;
    int j = 1;
    while(j < a.size())
    {
       String str = a.get(i);
       a.set(i, a.get(j));
       a.set(j, str);
       i = i + 2;
       j = j + 2;
    }
  }

  public static void doubleList(ArrayList<String> a)
  {
    int index = 0;
    ArrayList<String> temp = new ArrayList(a.size());
    for(String str: a)
    {
      temp.add(str);
    }
    for(String str: temp)
    {
      a.add(index, str);
      index = index + 2;
    }
  }

  public static void removeShorterStrings(ArrayList<String> a)
  {
    int one = 0;
    int two = 1;
    System.out.println("original: " + a.toString());
    while(true)
    {
      if((a.size()%2 != 0) && (two > a.size()))
      {
        break;
      }
      if(a.get(one).length() > a.get(two).length())
      {
        a.remove(two);
      }
      else if(a.get(one).length() == a.get(two).length())
      {
        a.remove(one);
      }
      else
      a.remove(one);
      one++;
      two++;
    }
  }
      
      
      public static String censor(String s, char c)
      {
        String str = "";
        for(int i = 0; i < s.length(); i++)
      {
      if(s.charAt(i) == c)
      {
        str = str + "*";
      }
      else
      {
        str = str + s.charAt(i);
      }
      }
    return str;
     }
      
    
  
}
