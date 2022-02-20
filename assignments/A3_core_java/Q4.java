
class Message{
    private String data;  
    synchronized void writeData(String str){
        this.data = str;
    }
    
    synchronized void readData(){
        System.out.println(data);
    }
}  

class Writer extends Thread{  
Message m;  
Writer(Message m){  
this.m=m;  
}  
public void run(){  
m.writeData("hello world welcome to Q");  
}  
  
}  
class Reader extends Thread{  
    Message m;  
    Reader(Message m){  
    this.m=m;  
    }  
    public void run(){  
    m.readData();  
    } 
}  
  
public class Q4{  
    public static void main(String args[]){  
        Message obj = new Message(); 
        Writer w = new Writer(obj);  
        Reader r = new Reader(obj);  
        w.start();  
        r.start();  
    }
}  