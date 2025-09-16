class A {

    int a;
    String b;
    
    /*
    A(){
        a=0;
        b=null;
    }
    */

    A(int x, String y){
        a=x;
        b=y;
    }

    A(int p, int q) {
        System.out.println(p+" "+q);
    }


    
    void Disp(){
        System.out.println(a+" "+b);    
        } 
}

class B {

    public static void main(String[] args) {

        A ref=new A(10,"ABC");
        //System.out.println(ref.a+" "+ref.b); 
        ref.Disp();
        A re=new A(101,102);
    }
}