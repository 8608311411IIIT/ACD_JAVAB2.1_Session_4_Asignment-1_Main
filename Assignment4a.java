class Parent{
 
     private void method1(){
            System.out.println ("Parent's method1()");
     }

        public void method2() {
               System.out.println ("Parent's method2()");
               method1();
        }
}

class Child extends Parent {
 
     public void method1() {//function overriding of method1() of parent class
           System.out.println ("Child's method1()");
     }
}

public class Assignment4a{//class declared as public as program starts from public class and public class name should be same as program name

      public static void main(String args[]) {
                Parent p = new Child();
                p.method2();//the output will be Parent's method2()
      }
}
/*the output will be 
          Parent's method2()
          Parent's method1()
*/
         
                     
