import java.io.*;
import java.util.*;
public class Main {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    int size(){
      return size;
    }

    void addLast(int val) {

      Node node = new Node();
      node.data= val;
      node.next = null;
      if(size==0){
         head= node;
        tail= node;
      }
      else{
        tail.next= node;
        tail=node;
      }
      size++;
    }
    
    void display(){

      if(size==0){
        return;
      }
      for(Node temp = head;temp!=null;temp= temp.next){
        System.out.print(temp.data );
        System.out.println("size of ll"+ size);
      }
      System.out.println();
    }

    int getFirst(){
    if(size==0){
      return -1 ;

    }
    else{
      return head.data;
    }

   }
   
   int getLast(){
    if(size==0){
      return -1;

    }
    else{
      return tail.data;
    }
   }

   int  getAt(int idx){
    if(size==0){
      return -1;
    }
    else if(idx<0 || idx>=size){ // isme valid indx[0,size-1] hota h 
      System.out.println("invalid index");
      return -1;
    }
    else{
      Node temp = head;
      for(int i=0;i<idx;i++){
        temp= temp.next;

      }
      return temp.data;

    }
   }

   public void addFirst(int val){

    Node node = new Node();
    node.data = val;
    
    if(size==0){
      head= tail = node;
      // node.next=null;
      
    }
    else{
      node.next=head;
      head=node;
      
    }
    size++;
    

   }

   public void addAt(int idx,int val){
    if( idx==0){
      addFirst(val);
    }
    else if(idx==size){
      addLast(val);
    }
    else if(idx<0 || idx>size){
      System.out.println("invalid");
    }
    else{
      Node nm1 =head;
      for(int i =0;i<idx-1;i++){

        nm1= nm1.next;
      }
      Node np1 = nm1.next;
      Node node = new Node();
      node.data = val;
      nm1.next=node;
      node.next=np1;
    }
   }

   public void removeFirst(){
    if(size==0){
      System.out.println("list is empty");
    }
    else if(size==1){
      head= tail = null;
      size--;
    }
    else{
      head = head.next;
      size--;
    }
   }

   public void removeLast(){
    if(size==0){
      System.out.println("list is empty");
    }
    else if(size==1){
      head= tail=null;
      size--;
    }
    else{
    Node sLast = getNodeAt(size-2);
    sLast.next= null;
    // tail = sLast;
    size--;
    }
   }

   public void removeAt(int idx){
    if(idx==0){
      removeFirst();
    }
    else if(idx==size-1){
      removeLast();
    }
    else if(idx<0 || idx>=size){
      System.out.println("invalid index");
    }
    else{
    Node temp = head;
    for(int i=0;i<idx-1;i++){
      temp = temp.next;
    }
    temp.next= temp.next.next;
  }
   }

   public int kthFromLast(int k){
    Node fast = head;
    Node slow = head;

    for(int i=0;i<k;i++){
      fast = fast.next;

    }

    // there is a gap of k between fast and slow
    // (while fast.next!=null) => age tail n de rkha ho tail.next null hoytabh 
    while(fast!=tail){ //fast!=tail => hm k index ki tarah pass kjr rhe h
  // fast!=null => hm k as a pops pass kr rhe h 
  // k index h

  
      fast= fast.next;
      slow= slow.next;
    }
    return slow.data;
   }
   
   public int midNode(){
    Node fast = head;
    Node slow = head;
    
   while(fast.next!=null && fast.next.next!=null){
    fast = fast.next.next;
    slow= slow.next;
   }
   return slow.data;


   }

   public Node getNodeAt(int idx){
    Node temp = head;
    for(int i=0;i<idx;i++){
      temp= temp.next;
    }
    return temp;
   }

   public void rdi(){
    int li=0;
    int ri=size-1;

    Node left = getNodeAt(li);
    Node right = getNodeAt(ri);
    while(li<=ri){
      int  temp = left.data;
      left.data = right.data;
      right.data = temp;

      li++;
      ri--;
    }
   }



   public void rpi(){
    Node prev = null;
    Node curr=head;
    while(curr!=null){
        Node next= curr.next; // next becaz curr.next= prev ke baad aage wala node kho jata 
        curr.next = prev; 
        prev= curr;
        curr= next;
        
        
    }
    Node temp=head;
    head=tail; //ab head uski tail ko point krne lagega swap head and tail
    tail=temp;
   }

  //  public  LinkedList mergeTwoSortedList(LinkedList l1,LinkedList l2){
  //     LinkedList res = new LinkedList();
  //     int i =0;
  //     int j=0;

  //     Node l1node = l1.getNodeAt(i);
  //     Node l2node = l2.getNodeAt(j);

  //     while(i<l1.size() || j<l2.size()){
  //       if(l1node.data<=l2node.data){
  //         res.addLast(l1node.data);
  //         i++;
  //       }
  //       else{
  //         res.addLast(l2node.data);
  //         j++;
  //       }
  //      }

  //      while(i<l1.size()){
  //       res.addLast(l1node.data);
  //       i++;
  //      }

  //      while(j<l2.size()){
  //       res.addLast(l2node.data);
  //       j++;
  //      }

      

  //     return res;
  //  }

  public static LinkedList mergeTwoSortedList(LinkedList l1,LinkedList l2){
    LinkedList res = new LinkedList();
    Node one = l1.head;
    Node two = l2.head;

    while(one!=null && two!=null){
      if(one.data<two.data){
        res.addLast(one.data);
        one = one.next;
      }
      else{
        res.addLast(two.data);
        two = two.next;
      }
    }

    while(one!=null){
      res.addLast(one.data);
      one= one.next;
    }
    while(two!=null){
      res.addLast(two.data);
      two= two.next;
    }


    return res;
  }

  public Node midNodeN(Node head,Node tail){
    Node fast = head;
    Node slow= head;
    while(fast!=tail && fast.next!=tail){
      fast = fast.next.next;
      slow= slow.next;
    }
    return slow;
  }
  public  LinkedList mergeSort(Node head,Node tail){

    if(head==tail){
      LinkedList base = new LinkedList();
      base.addLast(head.data);
      return base;
    }

    Node mid = midNodeN(head,tail);
    Node midNext = mid.next;

    LinkedList fsh = mergeSort(head,mid);
    LinkedList ssh = mergeSort(midNext,tail);

    LinkedList fsl = mergeTwoSortedList(fsh, ssh);

    return fsl;

  }
   
//   public void removeDuplicates(){
//     Node prev= head;
//     Node curr = head.next;
  
    
//     while(curr!=null){
//     while(prev.data==curr.data){
//       curr=curr.next;
//     }
//     prev.next=curr;
//     prev= curr;
//     curr=curr.next;
   
//   }
// }

public void removeDuplicates(){
  LinkedList res = new LinkedList();



  while(this.size()>0){
    int val = this.getFirst();
    this.removeFirst();

    if(res.size==0 || res.tail.data!=val){
      res.addLast(val);
    }
  }

  this.head=res.head;
   this.tail=res.tail;
  this.size=res.size;
  
  
}

public void kReverse(int K){
  LinkedList prev = null; // isme refrence hi ni h 
  LinkedList curr = new LinkedList(); // isme ref h pr isme h,t null h nd size=0
  
  while(this.size()>0){
    if(this.size<K){ //jb k elements se kam elements h
      // int sz = this.size;
        for(int i=0;i<this.size();i++){ // yha sz hi likhna padega this.size() change ho rha h 
          int val = this.getFirst();
          this.removeFirst();
          curr.addLast(val); // seedha add krmne ke liye removeFirst nd addLast krte h 
      }
    }
    else{
      for(int i=0;i<K;i++){
        int val = this.getFirst();
        this.removeFirst();
        curr.addFirst(val);
        //reverse krne ke liye rf ; af krte h
      }
    }

    if(prev==null){
      prev=curr;
    }
    else{
      prev.tail.next = curr.head;
      prev.tail=curr.tail;
      prev.size+=curr.size;
    }
    curr=new LinkedList();
  }

  this.head = prev.head;
  this.tail = prev.tail;
  this.size= prev.size;

}

public void oddEven(){
  LinkedList odd = new LinkedList();
  LinkedList even = new LinkedList();

  while(this.size()>0){
    int val = this.getFirst();

    if(val%2==0){
      even.addLast(val);
    }
    else{
      odd.addLast(val);
    }

    this.removeFirst();


  }

  if(odd.size()>0 && even.size()>0){
    odd.tail.next=even.head;
    odd.size+=even.size;
    this.head=odd.head;
    this.tail=odd.tail;
    this.size=odd.size;
  }
  else if(even.size()>0){
    this.head=even.head;
    this.tail=even.tail;
    this.size=even.size;
  }
  else{

    this.head=odd.head;
    this.tail=odd.tail;
    this.size=odd.size;
  }
}

private void displayRevHelper(Node node){
  if(node==null){
    return;
  }
  // System.out.println(node.data);
  displayRevHelper(node.next);
  System.out.println(node.data);
}

public void displayReverse(){
  // System.out.println(this.head.data);
  displayRevHelper(this.head);
  System.out.println();
}

public void rprHelp(Node node){
  if(node==tail){
    return;
  }


  rprHelp(node.next);
  node.next.next=node;
  

}

public void rpr(){
  rprHelp(head);
  Node temp=head;
  head=tail;
  tail=temp;
  tail.next=null;
}
public static int intersection(LinkedList l1, LinkedList l2){
  Node one = l1.head;
  Node two = l2.head;
  int diff=0;

  // int diff = l1.size()>l2.size() ? l1.size()-l2.size():l2.size()-l1.size();
  if(l1.size()>l2.size()){
     diff=l1.size()-l2.size();
     for(int i=0;i<diff;i++){
      one =one.next;
      
    }
  }
  else{
    diff=l2.size()-l1.size();
    for(int i=0;i<diff;i++){
      two =two.next;
      
    }
  }
  

  while(one.data!=two.data){
    one =one.next;
    two=two.next;
  }

  return one.data;
}

// very imp ques =>{reverse data recursive}=trick {while coming back in recursion if we want to move ll pointer frwrd  we need to nmake that pointer in heap} i stack we can only move backwrd while coming back in recursion

public void rdrHelp(Node right, int floor){
    // base case
    if(right==null){
      return;
    }
    rdrHelp(right.next,floor+1);
    // swap left and right upto mid only
    if(floor>size/2){
      int temp = right.data;
      right.data = left.data;
      left.data = temp;
      left = left.next;
    }
}

Node left = null;//{in heap with the summary obj h,t,s}

public void rdr(){
  left=head;
  rdrHelp(head,0);
  
}

public boolean isPallinHelp(Node right,int floor){

  if(right==null){
    return true;
  }
  boolean res = isPallinHelp(right.next,floor+1);
  
    if(res==false){
      return false;
    }
    else if(right.data!=leftP.data){
      return false;
    }
    else{
      leftP=leftP.next;
      return true;
    }
  


  
}
Node leftP =null;
public boolean  isPallin(){
  leftP=head;
  
  boolean var =isPallinHelp(head,0);
  return var;

}

public static int addTwoLinkedListHelper(Node rone,Node rtwo){
  if(rone==null && rtwo==null){
    
    return 0;
  }
  int res = addTwoLinkedListHelper(rone.next,rtwo.next);
  // int carry =0;

  int fdata = rone.data+rtwo.data;
  // if(fdata>=10){
  //   carry++;
  // }

  int fres = fdata+res;
  return fres;




  



}
public static LinkedList addTwoLinkedList(LinkedList l1,LinkedList l2){

  Node one = l1.head;
  Node two = l2.head;
  LinkedList add = new LinkedList();
  
  int kch = addTwoLinkedListHelper(one,two);
  add.addLast(kch);


  return add;
}

public void foldHelper(Node right,int floor){

  if(right==null){
    return;
  }


  foldHelper(right.next,floor+1);

  if(floor>=size/2){
    right.next=nexty;
    lefty.next=right;
    
    lefty=nexty;
    nexty=nexty.next;
  }
 
  
}
Node lefty=null;
Node nexty=null;
public void fold() {
// write your code here
lefty=head;


foldHelper(head,0);

}


}
  
  
  


  

  


  

  
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();
    LinkedList list2 = new LinkedList();
    LinkedList l1= new LinkedList();
    LinkedList l2= new LinkedList();


   
  //  list.addLast(10);
  //  list.addLast(20);
  //  list.addLast(30);
  //  list.addLast(40);
  //  list.addLast(54);
  //  list.addLast(60);
  //  list.addLast(70);
  //  list.addLast(80);
  //  list.addLast(90);
  //  list.addLast(414);
  //  list.addLast(441);

  //  list2.addLast(2);
  //  list2.addLast(8);
  //  list2.addLast(4);
  //  list2.addLast(6);
  //  list2.addLast(10);
  //  list2.addLast(6);
  //  list2.addLast(8);
   



  //  list.getAt(2);
  //  list.addFirst(100);
  //  list.addAt(3,3040);
  //  list.removeFirst();
  //  int numK = list.kthFromLast(2);
  //  System.out.println(numK);
  //  int numM  = list.midNode();
  //  System.out.println(numM);
  //  list.rdi();
  //  list.rpi();

  // l1.addLast(10);
  // l1.addLast(20);
  //  l1.addLast(30);
  //  l1.addLast(40);
  //  l1.addLast(460);

  //  l2.addLast(1);
  // l2.addLast(2);
  //  l2.addLast(3);
  //  l2.addLast(4);
  //  l2.addLast(46);

  //  l1.display();
  //  l2.display();


  //  LinkedList merged = LinkedList.mergeTwoSortedList(l1,l2);

  //  merged.display();

  // LinkedList merged = list.mergeTwoSortedList(l1,l2);
  // merged.display();


  //  ans.display();
  // list.display();
  //  list.removeLast();
  //  list.removeLast();
  // list.removeAt(5);
  //  list.display();
  // list.display();
  // list.removeDuplicates();
  // list.kReverse(3);
  // list2.oddEven();
  // list2.display();

  // list.displayReverse();


  //  l1.addLast(9);
  //  l1.addLast(5);
  //  l1.addLast(6);
  //  l1.addLast(8);
   
  //  l2.addLast(7);
  //  l2.addLast(4);
  //  l2.addLast(3);
   
   

  //  int intersect = LinkedList.intersection(l1,l2);
  //  System.out.println(intersect);

  // bina object banaye <class-name>.<function-name(param)> tb call kr skte h jb func me styatic use kia ho warna hme pehle instance banana padega fr <instance-name>.<function-name(param)> krke call krenge  => see merge two sorted lists

  // list.rpr();
  // list.rdr();
  // list.display();

  // list2.addLast(10);
  // list2.addLast(20);
  // list2.addLast(50);
  // list2.addLast(10);

  // boolean var = list2.isPallin();
  // System.out.println(var);

  // LinkedList add = LinkedList.addTwoLinkedList(l1,l1);
  // add.display();

  list.addLast(1);
  list.addLast(2);
  list.addLast(3);
  list.addLast(4);
  list.addLast(5);

  list.fold();
  list.display();   





    
  }
}

