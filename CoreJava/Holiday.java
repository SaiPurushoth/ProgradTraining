public class Holiday{

private String name;
private int day;
private String month;

Holiday(String n,int d,String m)
{
name=n;
day=d;
month=m;
}

public boolean SameMonth(Holiday ob)
{
if(this.month==ob.month)
{
  return true;
}
else
{
   return false;
}
}

public int avg(Holiday ob[])
{
int sum=0;
for(int i=0;i<ob.length;i++)
{
sum=sum+ob[i].day;
}
int avg=sum/ob.length;
return avg;

}

}

class Main
{
public static void main(String args[])
{
Holiday h = new Holiday("sai",20,"jan");
Holiday h1 = new Holiday("siddhu",15,"feb");

sop(h1.SameMonth(h));

}

}
