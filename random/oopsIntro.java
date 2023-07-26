public class oopsIntro{

    //encapsulation  => bundling of data member and methods in one unit(class)
    private static class person{
        String name; 
        int age;
        //data memeber (variables)

        void sayHi(){ // methods member functionws(functions)
            if(this.age>30){
                System.out.println("hello from"+ this.name );
            }
            else{
                System.out.println("hi from"+ this.name); 
            }
        }

    }
    // class is a blueprint ; factopry of objects it consists of data member  and methods 
    // object is interchabely used for refrence and instance

    public static void main(String args[]){
        person p1; // yha sirf stack ke p1 ka refrence bana h aur usme null pada h abhhi obj ni bana h 
        p1 = new person(); // yha p1 me 4k(say) {refrence } aa gya h aur heap me object{refrence } ban gya h
        p1.age=23;// yha uss refrence me age =23 
        p1.name = "ritesh"; // aur yha name =ritesh jo gya h 
        p1.sayHi(); // yha jb sayhi() call hota h ek this nbaam lka paramter pass hota h jo ki          {refence} ko point kr rha hotah

        person p2;
        p2 = new person();
        p2.age =32;
        p2.name="sumeet";
        p2.sayHi();

        person p3 = p2; // new use ni hua h to naya instance ni banega sirf p3 ek refrence banega jo ki p2 ke instance ko ni koint kr rha hoga mtlbn ki p2,p3 dono rrfenvce same instance of p2(5k)(say) ko point krega 
        p3.age=22;
        p3.name ="amit";
        p3.sayHi();
         p2.sayHi();

         

    }
}

