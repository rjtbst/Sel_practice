package com.utils.owner;

public class Addnode {
     String value;
     Addnode next;

     public void printtt(){
         System.out.println(this.value);
         if (this.next != null){
             this.next.printtt();
         }
     }
    Addnode(String value){
        this.value = value;
        this.next = null;
    }
    public void addingNode(String value){
       if (this.next == null ) {
       this.next = new Addnode(value);
       }else {
           this.next.addingNode(value);
       }
    }

}


 class TEst{
     public static void main(String[] args) {
         Addnode aa = new Addnode("abc");
         aa.addingNode("bdd");
         aa.addingNode("65351");
         aa.addingNode("32213");
         aa.addingNode("5369793221");
         aa.addingNode("245d");
         aa.addingNode("b000");
   aa.printtt();
     }
}
