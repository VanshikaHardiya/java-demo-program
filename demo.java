import java.util.Scanner;

class Student{
    int roll;
    String name;
    
    Student(int roll , String name){
        this.name=name;
        this.roll=roll;
    }
    void ShowData(){
        System.out.println("ROLL  :"+roll+"  NAME  :"+name);
    } 
}
public class demo {
    public static void main (String args[]){
      int i,t, ro ,ch;
      String na;
       Scanner sc= new Scanner (System.in);
       System.out.println("Enter for how many students to enter data  :");
       t=sc.nextInt();
       Student s[]= new Student[t];
     
       for(i=0;i<s.length;i++){
           System.out.println("Enter recode for student "+ (i+1));
           System.out.print("ROLL NO. :");
           ro=sc.nextInt();
           System.out.print("NAME :");
           na=sc.nextLine();
           na=sc.nextLine();
           
           
           s[i]=new Student(ro,na);
     }
        System.out.println("enter : 1 to show all recode \n enter : 2 to search data");
        ch=sc.nextInt();
       switch(ch)
       {
           case 1:
             for (i=0;i<s.length;i++)
              s[i].ShowData();
               break;
             
            case 2:
                System.out.println("Enter roll no. to search  :");
                int key=sc.nextInt();
                for(i=0;i<s.length ;i++)
                {  if(key==s[i].roll);
                   {  System.out.println("ROLL :"+s[i].roll);
                      System.out.println("NAME :"+s[i].name);
                   }
                  /* else
                    {System.out.println("invalid entry");
                    }*/
                   break;
                    
                }
            default:
                System.out.println("EXIT ");
        }
    
    }
            
    
}
