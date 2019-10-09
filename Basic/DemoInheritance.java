class Employer
{
String name;
String emp_id;
double salary;
String address;
Employer ()
{
System.out.println("This is default Constructor of Employer");
}
Employer (String s,String id,double d,String ad)
{
name=s;
emp_id=id;
salary=d;
address=ad;
System.out.println("This is default Constructor of Employer");
}
void showEmployer()
{
System.out.println(name+"\n"+emp_id+"\n"+salary+"\n"+address+"\n");
}
}
class Teaching extends Employer
{
String subjects;
String dept;
Teaching (String sub,String dep)
{
super("Shashwat","Raj0131",100000.0,"Jamshedpur");
subjects=sub;
dept=dep;
}
void showTeaching()
{
super.showEmployer();
System.out.println(subjects+"\n"+dept+"\n");
}
}
class NonTeaching extends Employer
{
String work;
String degination;
NonTeaching (String w,String deg)
{
super("Shashwat","Raj0131",100000.0,"Jamshedpur");
work=w;
degination=deg;
}
void showNonTeaching()
{
super.showEmployer();
System.out.println(work+"\n"+degination+"\n");
}
}
class DemoInheritance
{
public static void main(String args[])
{
Teaching t=new Teaching("Computer","DOCS");
NonTeaching nt=new NonTeaching("Admission","DSA");
Employer e=new Employer();
//e.showEmployer();
t.showTeaching();
nt.showNonTeaching();
}
}
